
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

package com.razeware.SimpleGLKitGame.simpleglkitgame;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.applicationservices.CGSize;
import com.myappconverter.java.foundations.NSMutableArray;
import com.myappconverter.java.foundations.NSObject;
import com.myappconverter.java.glkit.GLKMatrix4;
import com.myappconverter.java.glkit.GLKVector2;
import com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode;

public abstract class SGGNode extends NSObject {
	
	public SGGNode() {
		position = new GLKVector2(new float[]{0,0});
	}
	
	/**
	 * The cached value of the '<em>position</em>' property.
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	public GLKVector2 position;
	/**
	 * Returns the value of the '<em><b>position</b></em>' property.
	 *
	 * @return GLKVector2.
	 * @see #setPosition(GLKVector2)
	 * @generated
	 */
	public GLKVector2 position() {
		return this.position;
	}

	/**
	 * Sets the value of the '{@link  <em>position</em>}' property.
	 * @param GLKVector2 the new value of the '<em>position</em>' property.
	 * @see #getPosition()
	 * @generated
	 */
	public void setPosition(GLKVector2 position) {
		this.position = position;
	}
	/**
	 * Returns the value of the '<em><b>position</b></em>' property.
	 *
	 * @return GLKVector2.
	 * @see #setPosition(GLKVector2)
	 * @generated
	 */
	public GLKVector2 getPosition() {
		return this.position;
	}
	/**
	 * The cached value of the '<em>contentSize</em>' property.
	 * @see #getContentSize()
	 * @generated
	 * @ordered
	 */
	public CGSize contentSize;
	/**
	 * Returns the value of the '<em><b>contentSize</b></em>' property.
	 *
	 * @return CGSize.
	 * @see #setContentSize(CGSize)
	 * @generated
	 */
	public CGSize contentSize() {
		return this.contentSize;
	}

	/**
	 * Sets the value of the '{@link  <em>contentSize</em>}' property.
	 * @param CGSize the new value of the '<em>contentSize</em>' property.
	 * @see #getContentSize()
	 * @generated
	 */
	public void setContentSize(CGSize contentSize) {
		this.contentSize = contentSize;
	}
	/**
	 * Returns the value of the '<em><b>contentSize</b></em>' property.
	 *
	 * @return CGSize.
	 * @see #setContentSize(CGSize)
	 * @generated
	 */
	public CGSize getContentSize() {
		return this.contentSize;
	}
	/**
	 * The cached value of the '<em>moveVelocity</em>' property.
	 * @see #getMoveVelocity()
	 * @generated
	 * @ordered
	 */
	public GLKVector2 moveVelocity;
	/**
	 * Returns the value of the '<em><b>moveVelocity</b></em>' property.
	 *
	 * @return GLKVector2.
	 * @see #setMoveVelocity(GLKVector2)
	 * @generated
	 */
	public GLKVector2 moveVelocity() {
		return this.moveVelocity;
	}

	/**
	 * Sets the value of the '{@link  <em>moveVelocity</em>}' property.
	 * @param GLKVector2 the new value of the '<em>moveVelocity</em>' property.
	 * @see #getMoveVelocity()
	 * @generated
	 */
	public void setMoveVelocity(GLKVector2 moveVelocity) {
		this.moveVelocity = moveVelocity;
	}
	/**
	 * Returns the value of the '<em><b>moveVelocity</b></em>' property.
	 *
	 * @return GLKVector2.
	 * @see #setMoveVelocity(GLKVector2)
	 * @generated
	 */
	public GLKVector2 getMoveVelocity() {
		if (this.moveVelocity == null) {
			this.moveVelocity = GLKVector2.GLKVector2Make(0, 0);
		}
		return this.moveVelocity;
	}
	/**
	 * The cached value of the '<em>children</em>' property.
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	public NSMutableArray<SGGNode> children;
	/**
	 * Returns the value of the '<em><b>children</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setChildren(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> children() {
		return this.children;
	}

	/**
	 * Sets the value of the '{@link  <em>children</em>}' property.
	 * @param NSMutableArray the new value of the '<em>children</em>' property.
	 * @see #getChildren()
	 * @generated
	 */
	public void setChildren(NSMutableArray<SGGNode> children) {
		this.children = children;
	}
	/**
	 * Returns the value of the '<em><b>children</b></em>' property.
	 *
	 * @return NSMutableArray.
	 * @see #setChildren(NSMutableArray)
	 * @generated
	 */
	public NSMutableArray<SGGNode> getChildren() {
		return this.children;
	}
	/**
	 * The cached value of the '<em>rotation</em>' property.
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	public float rotation;
	/**
	 * Returns the value of the '<em><b>rotation</b></em>' property.
	 *
	 * @return float.
	 * @see #setRotation(float)
	 * @generated
	 */
	public float rotation() {
		return this.rotation;
	}

	/**
	 * Sets the value of the '{@link  <em>rotation</em>}' property.
	 * @param float the new value of the '<em>rotation</em>' property.
	 * @see #getRotation()
	 * @generated
	 */
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	/**
	 * Returns the value of the '<em><b>rotation</b></em>' property.
	 *
	 * @return float.
	 * @see #setRotation(float)
	 * @generated
	 */
	public float getRotation() {
		return this.rotation;
	}
	/**
	 * The cached value of the '<em>scale</em>' property.
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	public float scale;
	/**
	 * Returns the value of the '<em><b>scale</b></em>' property.
	 *
	 * @return float.
	 * @see #setScale(float)
	 * @generated
	 */
	public float scale() {
		return this.scale;
	}

	/**
	 * Sets the value of the '{@link  <em>scale</em>}' property.
	 * @param float the new value of the '<em>scale</em>' property.
	 * @see #getScale()
	 * @generated
	 */
	public void setScale(float scale) {
		this.scale = scale;
	}
	/**
	 * Returns the value of the '<em><b>scale</b></em>' property.
	 *
	 * @return float.
	 * @see #setScale(float)
	 * @generated
	 */
	public float getScale() {
		return this.scale;
	}
	/**
	 * The cached value of the '<em>rotationVelocity</em>' property.
	 * @see #getRotationVelocity()
	 * @generated
	 * @ordered
	 */
	public float rotationVelocity;
	/**
	 * Returns the value of the '<em><b>rotationVelocity</b></em>' property.
	 *
	 * @return float.
	 * @see #setRotationVelocity(float)
	 * @generated
	 */
	public float rotationVelocity() {
		return this.rotationVelocity;
	}

	/**
	 * Sets the value of the '{@link  <em>rotationVelocity</em>}' property.
	 * @param float the new value of the '<em>rotationVelocity</em>' property.
	 * @see #getRotationVelocity()
	 * @generated
	 */
	public void setRotationVelocity(float rotationVelocity) {
		this.rotationVelocity = rotationVelocity;
	}
	/**
	 * Returns the value of the '<em><b>rotationVelocity</b></em>' property.
	 *
	 * @return float.
	 * @see #setRotationVelocity(float)
	 * @generated
	 */
	public float getRotationVelocity() {
		return this.rotationVelocity;
	}
	/**
	 * The cached value of the '<em>scaleVelocity</em>' property.
	 * @see #getScaleVelocity()
	 * @generated
	 * @ordered
	 */
	public float scaleVelocity;
	/**
	 * Returns the value of the '<em><b>scaleVelocity</b></em>' property.
	 *
	 * @return float.
	 * @see #setScaleVelocity(float)
	 * @generated
	 */
	public float scaleVelocity() {
		return this.scaleVelocity;
	}

	/**
	 * Sets the value of the '{@link  <em>scaleVelocity</em>}' property.
	 * @param float the new value of the '<em>scaleVelocity</em>' property.
	 * @see #getScaleVelocity()
	 * @generated
	 */
	public void setScaleVelocity(float scaleVelocity) {
		this.scaleVelocity = scaleVelocity;
	}
	/**
	 * Returns the value of the '<em><b>scaleVelocity</b></em>' property.
	 *
	 * @return float.
	 * @see #setScaleVelocity(float)
	 * @generated
	 */
	public float getScaleVelocity() {
		return this.scaleVelocity;
	}

	/**
	 * Method : renderWithModelViewMatrix
	 * <!-- begin-user-doc -->
	 * @return void.
	 * @generated
	 */
	public abstract void renderWithModelViewMatrix(GLKMatrix4 modelViewMatrix);
	/**
	 * Method : update
	 * <!-- begin-user-doc -->
	 * @return void.
	 * @generated
	 */
	public abstract void update(float dt);
	/**
	 * Method : modelMatrix
	 * <!-- begin-user-doc -->
	 * @return GLKMatrix4.
	 * @generated
	 */
	public abstract GLKMatrix4 modelMatrix(boolean renderingSelf);
	/**
	 * Method : boundingBox
	 * <!-- begin-user-doc -->
	 * @return CGRect.
	 * @generated
	 */
	public abstract CGRect boundingBox();
	/**
	 * Method : addChild
	 * <!-- begin-user-doc -->
	 * @return void.
	 * @generated
	 */
	public abstract void addChild(SGGNode child);
	/**
	 * Method : handleTap
	 * <!-- begin-user-doc -->
	 * @return void.
	 * @generated
	 */
	public abstract void handleTap(CGPoint touchLocation);

}
