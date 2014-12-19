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

package com.razeware.SimpleGLKitGame.simpleglkitgame.impl;

import android.util.Log;

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.foundations.NSObjCRuntime;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.foundations.SEL;
import com.myappconverter.java.glkit.EAGL;
import com.myappconverter.java.glkit.GLKBaseEffect;
import com.myappconverter.java.glkit.GLKMatrix4;
import com.myappconverter.java.glkit.GLKView;
import com.myappconverter.java.glkit.MACGLES20;
import com.myappconverter.java.opengles.EAGLContext;
import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIApplication.UIInterfaceOrientation;
import com.myappconverter.java.uikit.UITapGestureRecognizer;
import com.myappconverter.mapping.utils.GenericMainContext;

public class SGGViewController extends com.razeware.SimpleGLKitGame.simpleglkitgame.SGGViewController {


	/**
	 * The cached value of the '<em>context</em>' property.
	 * 
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	public EAGLContext context;

	/**
	 * Returns the value of the '<em><b>context</b></em>' property.
	 * 
	 * @return EAGLContext.
	 * @see #setContext(EAGLContext)
	 * @generated
	 */
	public EAGLContext context() {
		return this.context;
	}

	/**
	 * Sets the value of the '{@link <em>context</em>}' property.
	 * 
	 * @param EAGLContext the new value of the '<em>context</em>' property.
	 * @see #getContext()
	 * @generated
	 */
	public void setContext(EAGLContext context) {
		this.context = context;
	}

	/**
	 * Returns the value of the '<em><b>context</b></em>' property.
	 * 
	 * @return EAGLContext.
	 * @see #setContext(EAGLContext)
	 * @generated
	 */
	public EAGLContext getContext() {
		return this.context;
	}

	/**
	 * The cached value of the '<em>effect</em>' property.
	 * 
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	public GLKBaseEffect effect;

	/**
	 * Returns the value of the '<em><b>effect</b></em>' property.
	 * 
	 * @return GLKBaseEffect.
	 * @see #setEffect(GLKBaseEffect)
	 * @generated
	 */
	public GLKBaseEffect effect() {
		return this.effect;
	}

	/**
	 * Sets the value of the '{@link <em>effect</em>}' property.
	 * 
	 * @param GLKBaseEffect the new value of the '<em>effect</em>' property.
	 * @see #getEffect()
	 * @generated
	 */
	public void setEffect(GLKBaseEffect effect) {
		this.effect = effect;
	}

	/**
	 * Returns the value of the '<em><b>effect</b></em>' property.
	 * 
	 * @return GLKBaseEffect.
	 * @see #setEffect(GLKBaseEffect)
	 * @generated
	 */
	public GLKBaseEffect getEffect() {
		return this.effect;
	}

	/**
	 * Method : viewDidLoad <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void viewDidLoad() {
		super.viewDidLoad();
		this.setContext((new EAGLContext()).initWithAPI(EAGL.kEAGLRenderingAPIOpenGLES2));
		if (!com.myappconverter.java.foundations.ExpressNullable.assertCondition(this.getContext())) {
			NSObjCRuntime.NSLog(new NSString("Failed to create ES context"));
		}
		GLKView view = (GLKView) (this.getView());
		view.setContext(this.getContext());
		EAGLContext.setCurrentContext(this.getContext());
		this.setEffect((new GLKBaseEffect()).init());
		// TODO check this
		GLKMatrix4 projectionMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4MakeOrtho(0, 480, 0, 320, -1024, 1024));
		this.getEffect().transform().setProjectionMatrix(projectionMatrix);
		UITapGestureRecognizer tapRecognizer = new UITapGestureRecognizer(GenericMainContext.sharedContext).initWithTargetAction(
				this, new SEL(new NSString("handleTapFrom")));
		this.getView().addGestureRecognizer(tapRecognizer);
		this.setScene((new SGGActionScene()).initWithEffect(this.getEffect()));
	}

	/**
	 * Method : handleTapFrom <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void handleTapFrom(UITapGestureRecognizer recognizer) {
		CGPoint touchLocation = (CGPoint)

		(recognizer.locationInView(recognizer.view()));
		touchLocation = (CGPoint) (CGGeometry.CGPointMake(touchLocation.x, 320 - touchLocation.y));
		this.getScene().handleTap(touchLocation);
	}

	/**
	 * Method : shouldAutorotateToInterfaceOrientation <!-- begin-user-doc -->
	 * 
	 * @return boolean.
	 * @generated
	 */
	public boolean shouldAutorotateToInterfaceOrientation(UIInterfaceOrientation interfaceOrientation) {
		return (boolean) ((interfaceOrientation) == UIApplication.UIInterfaceOrientation.UIInterfaceOrientationLandscapeLeft || (interfaceOrientation) == UIApplication.UIInterfaceOrientation.UIInterfaceOrientationLandscapeRight);
	}

	/**
	 * Method : glkView <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void glkViewDrawInRect(GLKView view, CGRect rect) {
		MACGLES20.glClearColor(1, 1, 1, 1);
		MACGLES20.glClear(16384);
		MACGLES20.glBlendFunc(770, 771);
		MACGLES20.glEnable(3042);
		this.getScene().renderWithModelViewMatrix(GLKMatrix4.GLKMatrix4Identity);
		update();
	}

	/**
	 * Method : update <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void update() {
		this.getScene().update((float) this.getTimeSinceLastUpdate());
	}
}
