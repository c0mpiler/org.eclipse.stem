package org.eclipse.stem.ui.ge.servlet;
/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/ 
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.stem.ui.Activator;


/**
 * Servlet that allows the client to verify that the 
 * web server is started and the STEM-GoogleEarth servlets 
 * are deployed.
 * 
 * If it gets a String "VerifyClient v.v.v"
 * It returns a String "VerifyServlet v.v.v"
 * 
 */
public class VerifyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	  /**
     * String that we will send the client
     */
 	private static String outputText="VerifyServlet "+
 			Version.version;
 	/**
 	 * String that client should send us.
 	 */
 	private static String expectedText="VerifyClient "+
 	 		Version.version;
    /**
     * 
     * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void service(HttpServletRequest request,HttpServletResponse response) 
            throws ServletException, IOException {
    	
		DataInputStream in = 
			new DataInputStream(request.getInputStream());
		response.setContentType("application/octer-stream");
		// use ByteArray output
		ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
		DataOutputStream output =
			new DataOutputStream(byteOutput);
		//
		// read the input from the client
		//
		String stringValue = in.readUTF();
		if (stringValue.startsWith(expectedText)) {
			output.writeUTF(outputText);
			if (stringValue.contains("DEBUG")) {
				SlideShowServlet.DEBUG = true;
			}
		} else {
			String errmsg = "Error: "+
			                "Expected: "+expectedText+
			                " Received: "+stringValue;
			debug(errmsg);
			output.writeUTF(errmsg);
		}
		output.flush();
		byte[] buf = byteOutput.toByteArray();
		response.setContentLength(buf.length);
		ServletOutputStream servletOutput = response.getOutputStream();
		servletOutput.write(buf);
		servletOutput.close();
		
	}
	
	
	@SuppressWarnings("unused")
	private void errHtml(HttpServletResponse response, String msg)
			throws IOException {
		response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());
		out.println("<html>");
		out.println("<head><title>VerifyServlet Error</title></head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body></html>");
		out.flush();
	}
	


    /**
     * print debug messages to the server log.
     * @param msg
     */
	private static void debug(String msg) {
		if (SlideShowServlet.DEBUG) {		  
		  Activator.logInformation("VerifyServlet: "+msg);
		}
	}
	
	@SuppressWarnings("unused")
	private static void debug(String msg,Throwable e) {
		//log(msg,e);
		Activator.logInformation(msg);
		e.printStackTrace();
		
	}
}


