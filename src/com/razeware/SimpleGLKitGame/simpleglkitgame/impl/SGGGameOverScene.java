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

import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.glkit.GLKBaseEffect;
import com.myappconverter.java.glkit.GLKVector2;
import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIWindow;
import com.razeware.SimpleGLKitGame.SGGAppDelegate;

public class SGGGameOverScene extends com.razeware.SimpleGLKitGame.simpleglkitgame.SGGGameOverScene {
	/**
	 * The cached value of the '<em>timeSinceInit</em>' property.
	 * 
	 * @see #getTimeSinceInit()
	 * @generated
	 * @ordered
	 */
	public float timeSinceInit;

	/**
	 * Returns the value of the '<em><b>timeSinceInit</b></em>' property.
	 *
	 * @return float.
	 * @see #setTimeSinceInit(float)
	 * @generated
	 */
	public float timeSinceInit() {
		return this.timeSinceInit;
	}

	/**
	 * Sets the value of the '{@link <em>timeSinceInit</em>}' property.
	 * 
	 * @param float the new value of the '<em>timeSinceInit</em>' property.
	 * @see #getTimeSinceInit()
	 * @generated
	 */
	public void setTimeSinceInit(float timeSinceInit) {
		this.timeSinceInit = timeSinceInit;
	}

	/**
	 * Returns the value of the '<em><b>timeSinceInit</b></em>' property.
	 *
	 * @return float.
	 * @see #setTimeSinceInit(float)
	 * @generated
	 */
	public float getTimeSinceInit() {
		return this.timeSinceInit;
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
	 * Method : initWithEffect <!-- begin-user-doc -->
	 * 
	 * @return SGGGameOverScene.
	 * @generated
	 */
	public SGGGameOverScene initWithEffect(GLKBaseEffect effect, boolean win) {
		// Special IF Statement
		super.init();
		if (this != null) {
			this.setEffect(effect);
			if (com.myappconverter.java.foundations.ExpressNullable.assertCondition(win)) {
				SGGSprite winSprite = (SGGSprite) ((new SGGSprite()).initWithFile(new NSString("YouWin.png"), effect));
				winSprite.setPosition(GLKVector2.GLKVector2Make(240, 160));
				this.addChild(winSprite);
			} else {
				SGGSprite loseSprite = (SGGSprite) ((new SGGSprite()).initWithFile(new NSString("YouLose.png"), effect));
				loseSprite.setPosition(GLKVector2.GLKVector2Make(240, 160));
				this.addChild(loseSprite);
			}
		}
		return (SGGGameOverScene) (this);
	}

	/**
	 * Method : update <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void update(float dt) {
		this.setTimeSinceInit(this.getTimeSinceInit() + dt);
		if (this.getTimeSinceInit() > 3.0f) {
			SGGActionScene scene = (SGGActionScene) ((new SGGActionScene()).initWithEffect(this.getEffect()));
			SGGAppDelegate delegate = (SGGAppDelegate) (UIApplication.sharedApplication().delegate());
			UIWindow mainWindow = (UIWindow) (delegate.window());
			SGGViewController viewController = (SGGViewController) (mainWindow.rootViewController());
			viewController.setScene(scene);
		}
	}

}
