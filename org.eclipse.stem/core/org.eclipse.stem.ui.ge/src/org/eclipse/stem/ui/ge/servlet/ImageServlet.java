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
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.stem.ui.Activator;

/**
 * Servlet that returns a png image containing the 
 * specified text string. 
 * This builds a PNG image based on specified parameters:
 *   text=
 *   
 * Works for Tomcat on Windows but on other platforms
 * It may require the following for the webserver
 *  -Djava.awt.headless=true
 *
 *
 */
public class ImageServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
    //	 get the parms from the URL parameters.
	// http://localhost:8080/image?text=string
	private String text="DEFAULT";
	private int textsize = 14;
	private String fc = "#ffffff";
	private String bc = "#000000";
	private int h = 32;
    int w = 0;
    private String fontName = "Sans-serif";
    
    /** 
     * handle doPost same as doGet
     */
    protected void doPost(HttpServletRequest request,HttpServletResponse response) 
            throws ServletException, IOException {
    	doGet(request,response);
    }
	/**
	 *  Process the URL command 
	 *  
	 *  The following are picked up from the URL
	 *   http://system/SlideShow/image?text=A%20String&h=height&w=width
	 *  
	 *  text  The String to be shown in resulting image
	 *  h     Height of image in pixels
	 *  w     Width of image in pixels
	 *  bc     Background color   (black)
	 *  fc     Foreground (text) color (white)
	 *  
	 *  - could be enhanced to also do the following
	 
	 *  font   Font name ( San-Sarif )
	 *  size   TextSise for font (14) 
	 *  type   Image Type (png)
	 *  
	 *  
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
 
		Enumeration e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = (String)request.getParameter(name);
			//debug(name+"="+value);
			if (name.equals("text")) {
				text = value;
			} else if (name.equals("w")) {
				w = Integer.parseInt(value);				
			} else if (name.equals("h")) {
				h = Integer.parseInt(value);
				
			} else if (name.equals("bc")) {
				bc = value;
			} else if (name.equals("fc")) {
				fc = value;
			}
		}
		BufferedImage image = getImage();
		if (image == null) {
			errHtml(response, "Unable to create image.");
		}
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		ImageIO.write(image, "png", outputStream);
		outputStream.close();
	}
	
	/**
	 * create a Buffered Image based on the 
	 * parameters gathered from the request.
	 * 
	 * @return  png image
	 */
	public BufferedImage getImage() {	
		BufferedImage image = null;
		// set defaults
		Font font = new Font(fontName, Font.BOLD, textsize);
        //	 default width is 8 pixels per char + margin
		if (w == 0)
		    w = (text.length()+2)*8;
		
		int textColor = 0;
		int imageColor = 0;
		try { 
	         if (fc.startsWith("#")) 
	        	 fc = fc.substring(1);
	         textColor = (int)(Long.parseLong(fc, 16) & 0x0fffffff);
	         if (bc.startsWith("#")) 
	        	 bc = bc.substring(1);
	         imageColor = (int)(Long.parseLong(bc, 16) & 0x0fffffff);
	    } catch (Exception excep) { 
	    	debug("textColor="+textColor);
		    debug("imageColor="+imageColor);
	    	debug("Invalid text or image color.",excep);
	    	return null;
	    }
	    
		try {
			image = new BufferedImage(w, h,
					BufferedImage.TYPE_INT_RGB);
			for (int i=0;i<w;i++) {
				for (int j=0;j<h;j++) {
					image.setRGB(i,j,imageColor);
				}
			}
			Graphics2D g = image.createGraphics();
			// add text string
			Color c = new Color(textColor, (((textColor >> 24) & 0xff) != 0));
			g.setColor(c);		
			g.setFont(font);
			g.drawString(text, textsize / 2, (textsize * 5) / 4);

			g.dispose();
		} catch (RuntimeException e) {
			
			e.printStackTrace();
			return null;
		}
		return image;
	}
	
	private void errHtml(HttpServletResponse response, String msg)
			throws IOException {
		response.setContentType("text/html");
		PrintWriter out = new PrintWriter(response.getOutputStream());
		out.println("<html>");
		out.println("<head><title>KML SlideShow Error</title></head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body></html>");
		out.flush();
	}
	
    /**
     * print debug messages to the server log.
     * @param msg
     */
	private void debug(String msg) {
		if (SlideShowServlet.DEBUG) {
		  
		  Activator.logInformation("ImageServlet: "+msg);
		}
	}
	
	private void debug(String msg,Throwable e) {
		
		Activator.logInformation(msg);
		e.printStackTrace();
		
	}
}


