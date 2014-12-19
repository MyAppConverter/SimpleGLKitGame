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

import org.cocos2dx.lib.SimpleAudioEngine;

import android.util.Log;

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.foundations.NSMutableArray;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.glkit.GLKBaseEffect;
import com.myappconverter.java.glkit.GLKVector2;
import com.myappconverter.java.uikit.UIApplication;
import com.myappconverter.java.uikit.UIWindow;
import com.myappconverter.mapping.utils.Math;
import com.razeware.SimpleGLKitGame.SGGAppDelegate;
import com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode;

public class SGGActionScene extends com.razeware.SimpleGLKitGame.simpleglkitgame.SGGActionScene {


	public SGGActionScene() {
		effect = new GLKBaseEffect();
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
	 * The cached value of the '<em>player</em>' property.
	 * 
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	public SGGSprite player;

	/**
	 * Returns the value of the '<em><b>player</b></em>' property.
	 *
	 * @return SGGSprite.
	 * @see #setPlayer(SGGSprite)
	 * @generated
	 */
	public SGGSprite player() {
		return this.player;
	}

	/**
	 * Sets the value of the '{@link <em>player</em>}' property.
	 * 
	 * @param SGGSprite the new value of the '<em>player</em>' property.
	 * @see #getPlayer()
	 * @generated
	 */
	public void setPlayer(SGGSprite player) {
		this.player = player;
	}

	/**
	 * Returns the value of the '<em><b>player</b></em>' property.
	 *
	 * @return SGGSprite.
	 * @see #setPlayer(SGGSprite)
	 * @generated
	 */
	public SGGSprite getPlayer() {
		return this.player;
	}

	/**
	 * The cached value of the '<em>timeSinceLastSpawn</em>' property.
	 * 
	 * @see #getTimeSinceLastSpawn()
	 * @generated
	 * @ordered
	 */
	public float timeSinceLastSpawn;

	/**
	 * Returns the value of the '<em><b>timeSinceLastSpawn</b></em>' property.
	 *
	 * @return float.
	 * @see #setTimeSinceLastSpawn(float)
	 * @generated
	 */
	public float timeSinceLastSpawn() {
		return this.timeSinceLastSpawn;
	}

	/**
	 * Sets the value of the '{@link <em>timeSinceLastSpawn</em>}' property.
	 * 
	 * @param float the new value of the '<em>timeSinceLastSpawn</em>' property.
	 * @see #getTimeSinceLastSpawn()
	 * @generated
	 */
	public void setTimeSinceLastSpawn(float timeSinceLastSpawn) {
		this.timeSinceLastSpawn = timeSinceLastSpawn;
	}

	/**
	 * Returns the value of the '<em><b>timeSinceLastSpawn</b></em>' property.
	 *
	 * @return float.
	 * @see #setTimeSinceLastSpawn(float)
	 * @generated
	 */
	public float getTimeSinceLastSpawn() {
		return this.timeSinceLastSpawn;
	}

	/**
	 * The cached value of the '<em>projectiles</em>' property.
	 * 
	 * @see #getProjectiles()
	 * @generated
	 * @ordered
	 */
	public NSMutableArray<SGGNode> projectiles;

	/**
	 * Returns the value of the '<em><b>projectiles</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setProjectiles(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> projectiles() {
		return this.projectiles;
	}

	/**
	 * Sets the value of the '{@link <em>projectiles</em>}' property.
	 * 
	 * @param NSMutableArray the new value of the '<em>projectiles</em>' property.
	 * @see #getProjectiles()
	 * @generated
	 */
	public void setProjectiles(NSMutableArray projectiles) {
		this.projectiles = projectiles;
	}

	/**
	 * Returns the value of the '<em><b>projectiles</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setProjectiles(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> getProjectiles() {
		return this.projectiles;
	}

	/**
	 * The cached value of the '<em>targets</em>' property.
	 * 
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	public NSMutableArray<SGGNode> targets;

	/**
	 * Returns the value of the '<em><b>targets</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setTargets(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> targets() {
		return this.targets;
	}

	/**
	 * Sets the value of the '{@link <em>targets</em>}' property.
	 * 
	 * @param NSMutableArray the new value of the '<em>targets</em>' property.
	 * @see #getTargets()
	 * @generated
	 */
	public void setTargets(NSMutableArray targets) {
		this.targets = targets;
	}

	/**
	 * Returns the value of the '<em><b>targets</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setTargets(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> getTargets() {
		return this.targets;
	}

	/**
	 * The cached value of the '<em>targetsDestroyed</em>' property.
	 * 
	 * @see #getTargetsDestroyed()
	 * @generated
	 * @ordered
	 */
	public int targetsDestroyed;

	/**
	 * Returns the value of the '<em><b>targetsDestroyed</b></em>' property.
	 *
	 * @return int.
	 * @see #setTargetsDestroyed(int)
	 * @generated
	 */
	public int targetsDestroyed() {
		return this.targetsDestroyed;
	}

	/**
	 * Sets the value of the '{@link <em>targetsDestroyed</em>}' property.
	 * 
	 * @param int the new value of the '<em>targetsDestroyed</em>' property.
	 * @see #getTargetsDestroyed()
	 * @generated
	 */
	public void setTargetsDestroyed(int targetsDestroyed) {
		this.targetsDestroyed = targetsDestroyed;
	}

	/**
	 * Returns the value of the '<em><b>targetsDestroyed</b></em>' property.
	 *
	 * @return int.
	 * @see #setTargetsDestroyed(int)
	 * @generated
	 */
	public int getTargetsDestroyed() {
		return this.targetsDestroyed;
	}

	/**
	 * Method : initWithEffect <!-- begin-user-doc -->
	 * 
	 * @return SGGActionScene.
	 * @generated
	 */
	public SGGActionScene initWithEffect(GLKBaseEffect effect) {
		// Special IF Statement
		super.init();
		if (this != null) {
			this.setEffect(effect);
			this.setPlayer((new SGGSprite()).initWithFile(new NSString("Player.png"), this.getEffect()));
			this.getPlayer().setPosition(GLKVector2.GLKVector2Make(this.getPlayer().getContentSize().width / 2, 160));
			this.setChildren(new NSMutableArray<com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode>());
			this.getChildren().addObject(this.getPlayer());
			this.setProjectiles(new NSMutableArray<SGGNode>());
			this.setTargets(new NSMutableArray<SGGNode>());
			SimpleAudioEngine.sharedEngine().playBackgroundMusic(new NSString("background_music_aac.mp3"));
			SimpleAudioEngine.sharedEngine().preloadEffect(new NSString("pewpew.wav"));
		}
		return this;
	}

	/**
	 * Method : handleTap <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void handleTap(CGPoint touchLocation) {
		GLKVector2 target = (GLKVector2) (GLKVector2.GLKVector2Make(touchLocation.x, touchLocation.y));
		GLKVector2 offset = (GLKVector2) (GLKVector2.GLKVector2Subtract(target, this.getPlayer().getPosition()));
		GLKVector2 normalizedOffset = (GLKVector2) (GLKVector2.GLKVector2Normalize(offset));
		float POINTS_PER_SECOND = (float) (480);
		GLKVector2 moveVelocity = (GLKVector2) (GLKVector2.GLKVector2MultiplyScalar(normalizedOffset, POINTS_PER_SECOND));
		SGGSprite sprite = (SGGSprite) ((new SGGSprite()).initWithFile(new NSString("Projectile.png"), this.getEffect()));
		sprite.setPosition(this.getPlayer().getPosition());
		sprite.setMoveVelocity(moveVelocity);
		this.getChildren().addObject(sprite);
		this.getProjectiles().addObject(sprite);
		SimpleAudioEngine.sharedEngine().playEffect(new NSString("pewpew.wav"));
	}

	/**
	 * Method : addTarget <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void addTarget() {
		SGGSprite target = (SGGSprite) ((new SGGSprite()).initWithFile(new NSString("Target.png"), this.getEffect()));
		this.getChildren().addObject(target);
		int minY = (int) (target.getContentSize().height / 2);
		int maxY = (int) (320 - target.getContentSize().height / 2);
		int rangeY = (int) (maxY - minY);
		int actualY = (int) ((Math.arc4random() % rangeY) + minY);
		target.setPosition(GLKVector2.GLKVector2Make(480 + (target.getContentSize().width / 2), actualY));
		int minVelocity = (int) (480.0f / 4.0f);
		int maxVelocity = (int) (480.0f / 2.0f);
		int rangeVelocity = (int) (maxVelocity - minVelocity);
		int actualVelocity = (int) ((Math.arc4random() % rangeVelocity) + minVelocity);
		target.setMoveVelocity(GLKVector2.GLKVector2Make(-actualVelocity, 0));
		this.getTargets().addObject(target);
	}

	/**
	 * Method : gameOver <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void gameOver(boolean win) {
		SGGGameOverScene gameOver = (SGGGameOverScene) ((new SGGGameOverScene()).initWithEffect(this.getEffect(), win));
		SGGAppDelegate delegate = (SGGAppDelegate) (UIApplication.sharedApplication().delegate());
		UIWindow mainWindow = (UIWindow) (delegate.window());
		SGGViewController viewController = (SGGViewController) (mainWindow.rootViewController());
		viewController.setScene(gameOver);
	}

	/**
	 * Method : update <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void update(float dt) {
		super.update(dt);
		NSMutableArray projectilesToDelete = (NSMutableArray) (NSMutableArray.array());
		for (Object projectileInter : this.getProjectiles()) {
			SGGSprite projectile = (SGGSprite) projectileInter;
			NSMutableArray targetsToDelete = (NSMutableArray) (NSMutableArray.array());
			for (Object targetInter : this.getTargets()) {
				SGGSprite target = (SGGSprite) targetInter;
				if (CGGeometry.CGRectIntersectsRect(projectile.boundingBox(), target.boundingBox())) {
					targetsToDelete.addObject(target);
				}
			}
			for (Object targetInter : targetsToDelete) {
				SGGSprite target = (SGGSprite) targetInter;
				this.getTargets().removeObject(target);
				this.getChildren().removeObject(target);
				targetsDestroyed++;
			}
			if (targetsToDelete.count() > 0) {
				projectilesToDelete.addObject(projectile);
			}
		}
		for (Object projectileInter : projectilesToDelete) {
			SGGSprite projectile = (SGGSprite) projectileInter;
			this.getProjectiles().removeObject(projectile);
			this.getChildren().removeObject(projectile);
		}
		this.setTimeSinceLastSpawn(this.getTimeSinceLastSpawn() + dt);
		if (this.getTimeSinceLastSpawn() > 1.0f) {
			this.setTimeSinceLastSpawn(0);
			this.addTarget();
		}
		if (targetsDestroyed > 5) {
			this.gameOver(true);
			return;
		}
		boolean lose = (boolean) (false);
		for (int i = this.getChildren().count() - 1; i >= 0; i--) {
			SGGSprite sprite = (SGGSprite) this.getChildren().objectAtIndex(i);
			if (sprite.getPosition().x() <= -sprite.getContentSize().width / 2
					|| sprite.getPosition().x() > 480 + sprite.getContentSize().width / 2
					|| sprite.getPosition().y() <= -sprite.getContentSize().height / 2
					|| sprite.getPosition().y() >= 320 + sprite.getContentSize().height / 2) {
				if (com.myappconverter.java.foundations.ExpressNullable.assertCondition(this.getTargets().containsObject(sprite))) {
					this.getTargets().removeObject(sprite);
					this.getChildren().removeObjectAtIndex(i);
					lose = (boolean) (true);
				} else {
					if (com.myappconverter.java.foundations.ExpressNullable.assertCondition(this.getProjectiles().containsObject(sprite))) {
						this.getProjectiles().removeObject(sprite);
						this.getChildren().removeObjectAtIndex(i);
					}
				}
			}
		}
		if (com.myappconverter.java.foundations.ExpressNullable.assertCondition(lose)) {
			this.gameOver(false);
		}
	}
}
