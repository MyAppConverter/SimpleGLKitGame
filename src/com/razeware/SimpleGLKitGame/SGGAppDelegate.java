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

import android.app.Application;

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.coregraphics.CGAffineTransform;
import com.myappconverter.java.foundations.NSArray;
import com.myappconverter.java.foundations.NSCoder;
import com.myappconverter.java.foundations.NSData;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.NSURL;
import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIApplication.UIInterfaceOrientation;
import com.myappconverter.java.uikit.UILocalNotification;
import com.myappconverter.java.uikit.UIViewController;
import com.myappconverter.java.uikit.UIWindow;
import com.myappconverter.java.uikit.protocols.UIApplicationDelegate;

public class SGGAppDelegate extends  Application implements UIApplicationDelegate {

	/**
	 * The cached value of the '<em>window</em>' property.
	 * 
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	public UIWindow window;

	/**
	 * Returns the value of the '<em><b>window</b></em>' property.
	 *
	 * @return UIWindow.
	 * @see #setWindow(UIWindow)
	 * @generated
	 */
	public UIWindow window() {
		return this.window;
	}

	/**
	 * Sets the value of the '{@link <em>window</em>}' property.
	 * 
	 * @param UIWindow
	 *            the new value of the '<em>window</em>' property.
	 * @see #getWindow()
	 * @generated
	 */
	public void setWindow(UIWindow window) {
		this.window = window;
	}

	/**
	 * Returns the value of the '<em><b>window</b></em>' property.
	 *
	 * @return UIWindow.
	 * @see #setWindow(UIWindow)
	 * @generated
	 */
	public UIWindow getWindow() {
		return this.window;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		CGAffineTransform t1 = (CGAffineTransform) (CGAffineTransform
				.CGAffineTransformMake(1, 2, 3, 4, 5, 6));
		CGAffineTransform t2 = (CGAffineTransform) (CGAffineTransform
				.CGAffineTransformMake(2, 2, 2, 2, 2, 2));
		CGAffineTransform t3 = (CGAffineTransform) (CGAffineTransform
				.CGAffineTransformConcat(t1, t2));
		CGPoint p = (CGPoint) (CGGeometry.CGPointMake(10, 20));
		CGPoint p1 = (CGPoint) (CGAffineTransform.CGPointApplyAffineTransform(
				p, t2));

	}

	@Override
	public void onTerminate() {
		super.onTerminate();

	}

	/**
	 * Method : applicationWillResignActive <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationWillResignActive(UIApplication application) {
	}

	/**
	 * Method : applicationDidEnterBackground <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationDidEnterBackground(UIApplication application) {
	}

	/**
	 * Method : applicationWillEnterForeground <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationWillEnterForeground(UIApplication application) {
	}

	/**
	 * Method : applicationDidBecomeActive <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void applicationDidBecomeActive(UIApplication application) {
	}

	@Override
	public void applicationDidChangeStatusBarFrame(UIApplication application,
			CGRect oldStatusBarFrame) {
		
	}

	@Override
	public boolean applicationDidFinishLaunchingWithOptions(
			UIApplication application, NSDictionary launchOptions) {
		return false;
	}

	@Override
	public boolean applicationWillFinishLaunchingWithOptions(
			UIApplication application, NSDictionary launchOptions) {
		return false;
	}

	@Override
	public void applicationWillTerminate(UIApplication application) {
		
	}

	@Override
	public void applicationDidChangeStatusBarOrientation(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidDecodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidFailToRegisterForRemoteNotificationsWithError(UIApplication application, NSError error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidReceiveLocalNotification(UIApplication application, UILocalNotification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidReceiveRemoteNotification(UIApplication application, NSDictionary userInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidRegisterForRemoteNotificationsWithDeviceToken(UIApplication application, NSData deviceToken) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationHandleOpenURL(UIApplication application, NSURL url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean applicationOpenURLSourceApplicationAnnotation(UIApplication application, NSURL url, NSString sourceApplication,
			Object annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applicationShouldRestoreApplicationState(UIApplication application, NSCoder coder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean applicationShouldSaveApplicationState(UIApplication application, NSCoder coder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int applicationSupportedInterfaceOrientationsForWindow(UIApplication application, UIWindow window) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UIViewController applicationViewControllerWithRestorationIdentifierPathCoder(UIApplication application,
			NSArray identifierComponents, NSCoder coder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void applicationWillChangeStatusBarFrame(UIApplication application, CGRect newStatusBarFrame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationWillChangeStatusBarOrientationDuration(UIApplication application,
			UIInterfaceOrientation newStatusBarOrientation, double duration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationWillEncodeRestorableStateWithCoder(UIApplication application, NSCoder coder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidFinishLaunching(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationDidReceiveMemoryWarning(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationProtectedDataDidBecomeAvailable(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationProtectedDataWillBecomeUnavailable(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationSignificantTimeChange(UIApplication application) {
		// TODO Auto-generated method stub
		
	}

}
