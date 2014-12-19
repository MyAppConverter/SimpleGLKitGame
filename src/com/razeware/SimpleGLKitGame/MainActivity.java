/*
 * Copyright (c) 2014 MyAppConverter
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the MyAppConverter License v1.0
 * which accompanies this distribution, and is available at
 * http://www.myappconverter.com/legal/epl-v1.html
 *
 * Contributors:
 *    MyAppConverter Core Team - initial API and implementation
 * @date : Dec, 02 2014 - 13:57:39
 */

package com.razeware.SimpleGLKitGame;

import org.cocos2dx.lib.Cocos2dxActivity;

import android.os.Bundle;

import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIWindow;
import com.myappconverter.mapping.utils.GenericMainContext;
import com.razeware.SimpleGLKitGame.simpleglkitgame.impl.SGGViewController;

public class MainActivity extends Cocos2dxActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GenericMainContext.sharedContext = this;
		SGGViewController sgViewController = new SGGViewController();
		sgViewController.init();
		sgViewController.viewDidLoad();
		
		UIWindow window = new UIWindow();
		window.setRootViewController(sgViewController);
		SGGAppDelegate appdelegate = new SGGAppDelegate();
		appdelegate.setWindow(window);
		UIApplication.sharedApplication().setDelegate(appdelegate);
		setContentView(sgViewController.view().getWrappedView());
		
	}

}
