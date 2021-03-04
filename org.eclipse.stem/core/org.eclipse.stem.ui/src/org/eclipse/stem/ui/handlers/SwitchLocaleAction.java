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
package org.eclipse.stem.ui.handlers;

import java.util.ArrayList;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;

/**
 * RCP Workspace action to handle interactive switching of the current locale.
 * This class provides a menu list of available locales (from the list of
 * plugin_*.properties files in org.eclipse.stem.ui). When selected, then the
 * action re-builds the STEM launch command and forces a workspace restart with
 * the proper exitdata to switch to the new language.
 * 
 * This class is derived from the Eclipse IDE OpenWorkspaceAction and follows
 * the the same methodology. Thanks to the developers of that class for the
 * methodology.
 * 
 * @since 1.3.0
 */
public class SwitchLocaleAction extends Action implements
		ActionFactory.IWorkbenchAction {

	/**
	 * 
	 */
	public static final ActionFactory SWITCH_LOCALE_ACTION = new ActionFactory(
			"switchLocale") { //$NON-NLS-1$
		
		/* (non-Javadoc)
		 * @see org.eclipse.ui.actions.ActionFactory#create(org.eclipse.ui.IWorkbenchWindow)
		 */
		public IWorkbenchAction create(IWorkbenchWindow window) {
			if (window == null) {
				throw new IllegalArgumentException();
			}
			IWorkbenchAction action = new SwitchLocaleAction(window);
			action.setId(getId());
			return action;
		}
	};

	/**
	 *
	 *
	 */
	class ChangeLanguageAction extends Action 
	{
		String locale;
		boolean selected = false;

		ChangeLanguageAction(String locale) {
			this.locale = locale;
			String displayName = org.eclipse.stem.ui.NLS
					.getLocaleDisplayName(locale);
			if (org.eclipse.stem.ui.NLS.isDefaultLocale(locale)) {
				displayName = displayName
						+ Messages.SwitchLocaleAction_DefaultSetting;
			}

			setText(displayName);
			setToolTipText(displayName);

			if (org.eclipse.stem.ui.NLS.isCurrentLocale(locale)) {
				selected = true;
				setChecked(true);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.action.Action#run()
		 */
		public void run() {
			if (selected) {
				return;
			}

			boolean b = MessageDialog.openConfirm(window.getShell(),
					Messages.SwitchLocaleAction_ConfirmRestart,
					Messages.SwitchLocaleAction_ConfirmRestartMessage);
			if (b) {
				changeLocaleAndRestart(locale);
			}
		}
	}

	private static final String PROP_VM = "eclipse.vm"; //$NON-NLS-1$

	private static final String PROP_VMARGS = "eclipse.vmargs"; //$NON-NLS-1$

	private static final String PROP_COMMANDS = "eclipse.commands"; //$NON-NLS-1$

	private static final String PROP_EXIT_CODE = "eclipse.exitcode"; //$NON-NLS-1$

	private static final String PROP_EXIT_DATA = "eclipse.exitdata"; //$NON-NLS-1$

	private static final String CMD_NL = "-nl"; //$NON-NLS-1$

	private static final String CMD_VMARGS = "-vmargs"; //$NON-NLS-1$

	private static final String NEW_LINE = "\n"; //$NON-NLS-1$

	private IWorkbenchWindow window;

	private IContributionItem[] getContributionItems() {

		ArrayList<IContributionItem> list = new ArrayList<IContributionItem>();

		for (String locale : org.eclipse.stem.ui.NLS.getAvailableLocales()) {
			list.add(new ActionContributionItem(
					new ChangeLanguageAction(locale)));
		}

		return (IContributionItem[]) list.toArray(new IContributionItem[list
				.size()]);
	}

	class MenuCreator implements IMenuCreator {
		private MenuManager dropDownMenuMgr;

		/**
		 * Creates the menu manager for the drop-down.
		 */
		private void createDropDownMenuMgr() {
			if (dropDownMenuMgr == null) {
				dropDownMenuMgr = new MenuManager();
				dropDownMenuMgr.setRemoveAllWhenShown(true);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets
		 * .Control)
		 */
		public Menu getMenu(Control parent) {
			createDropDownMenuMgr();
			dropDownMenuMgr.addMenuListener(new IMenuListener() {
				public void menuAboutToShow(IMenuManager manager) {
					IContributionItem[] items = getContributionItems();
					for (int i = 0; i < items.length; i++) {
						manager.add(items[i]);
					}
					// manager.add(new OpenDialogAction());
				}
			});
			return dropDownMenuMgr.createContextMenu(parent);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets
		 * .Menu)
		 */
		public Menu getMenu(Menu parent) {
			createDropDownMenuMgr();
			final Menu menu = new Menu(parent);

			menu.addListener(SWT.Show, new Listener() {
				public void handleEvent(Event event) {
					if (menu.isDisposed()) {
						return;
					}
					MenuItem[] items = menu.getItems();
					for (int i = 0; i < items.length; i++) {
						items[i].dispose();
					}
					IContributionItem[] contributions = getContributionItems();
					for (int i = 0; i < contributions.length; i++) {
						contributions[i].fill(menu, -1);
					}
				}
			});
			return menu;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.action.IMenuCreator#dispose()
		 */
		public void dispose() {
			if (dropDownMenuMgr != null) {
				dropDownMenuMgr.dispose();
				dropDownMenuMgr = null;
			}
		}
	}

	/**
	 * Set definition for this action and text so that it will be used for File
	 * -&gt; Open Workspace in the argument window.
	 * 
	 * @param window
	 *            the window in which this action should appear
	 */
	public SwitchLocaleAction(IWorkbenchWindow window) {
		super(Messages.SwitchLocaleAction_SwitchLangaugeMenu,
				IAction.AS_DROP_DOWN_MENU);

		if (window == null) {
			throw new IllegalArgumentException();
		}

		this.window = window;
		setToolTipText(Messages.SwitchLocaleAction_SwitchLangaugeMenuTT);
		setActionDefinitionId("org.eclipse.stem.ui.switchLanguage"); //$NON-NLS-1$
		setMenuCreator(new MenuCreator());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	public void run() {
		// restart(path);
		return;
	}

	/**
	 * Restart the workbench using the specified locale as the 
	 * new language upon restart
	 * 
	 * @param locale the new locale
	 */
	private void changeLocaleAndRestart(String locale) {
		
		try {
			org.eclipse.stem.ui.NLS.persistNewLocale(locale);
		} catch (Throwable t) {
			Activator.logWarning("Unable to persist new locale in system properties. Setting is transient only.", t);
		}
		
		String command_line = buildCommandLine(locale);
		if (command_line == null) {
			return;
		}

		System.setProperty(PROP_EXIT_CODE, Integer.toString(24));
		System.setProperty(PROP_EXIT_DATA, command_line);
		window.getWorkbench().restart();
	}

	/**
	 * Create and return a string with command line options for stem executable that
	 * will launch a new locale that is the same as the currently running
	 * one, but using the new locale
	 * 
	 * @param newLocale The new locale to use
	 * @return a string of command line options or null on error
	 */
	private String buildCommandLine(String newLocale) {
		String property = System.getProperty(PROP_VM);
		if (property == null) {
			MessageDialog
					.openError(
							window.getShell(),
							Messages.SwitchLocaleAction_CommandLineError,
							NLS.bind(
									Messages.SwitchLocaleAction_CommandLineErrorMessage,
									PROP_VM));
			return null;
		}

		StringBuffer result = new StringBuffer(512);
		result.append(property);
		result.append(NEW_LINE);

		// append the vmargs and commands. Assume that these already end in \n
		String vmargs = System.getProperty(PROP_VMARGS);

		StringBuffer vmargsBuf = new StringBuffer();

		if (!vmargs.contains(org.eclipse.stem.ui.NLS.SYSTEM_LOCALE_PROPERTY)) {
			vmargsBuf.append("-D"); //$NON-NLS-1$
			vmargsBuf.append(org.eclipse.stem.ui.NLS.SYSTEM_LOCALE_PROPERTY);
			vmargsBuf.append("="); //$NON-NLS-1$
			vmargsBuf.append(org.eclipse.stem.ui.NLS.getSystemLocale());
			vmargsBuf.append(NEW_LINE);
		}
		vmargsBuf.append(vmargs);

		result.append(vmargsBuf.toString());

		// append the rest of the args, replacing or adding -data as required
		property = System.getProperty(PROP_COMMANDS);
		if (property == null) {
			result.append(CMD_NL);
			result.append(NEW_LINE);
			result.append(newLocale);
			result.append(NEW_LINE);
		} else {
			// find the index of the arg to replace its value
			int cmd_data_pos = property.lastIndexOf(CMD_NL);
			if (cmd_data_pos != -1) {
				cmd_data_pos += CMD_NL.length() + 1;
				result.append(property.substring(0, cmd_data_pos));
				result.append(newLocale);
				result.append(property.substring(property.indexOf('\n',
						cmd_data_pos)));
			} else {
				result.append(CMD_NL);
				result.append(NEW_LINE);
				result.append(newLocale);
				result.append(NEW_LINE);
				result.append(property);
			}
		}

		result.append(CMD_VMARGS);
		result.append(NEW_LINE);
		result.append(vmargsBuf.toString());

		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#dispose()
	 */
	public void dispose() {
		window = null;
	}
}
