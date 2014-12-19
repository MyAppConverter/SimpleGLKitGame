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


import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGPoint;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.coregraphics.CGAffineTransform;
import com.myappconverter.java.foundations.NSMutableArray;
import com.myappconverter.java.glkit.GLKMathUtils;
import com.myappconverter.java.glkit.GLKMatrix4;
import com.myappconverter.java.glkit.GLKVector2;

public class SGGNode extends com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode {

	/**
	 * Method : init <!-- begin-user-doc -->
	 * 
	 * @return SGGNode.
	 * @generated
	 */
	public SGGNode init() {
		// Special IF Statement
		super.init();
		if (this != null) {
			this.setChildren(new NSMutableArray<com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode>());
			this.setScale(1);
		}
		return this;
	}

	/**
	 * Method : renderWithModelViewMatrix <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void renderWithModelViewMatrix(GLKMatrix4 modelViewMatrix) {
		GLKMatrix4 childModelViewMatrix = GLKMatrix4.GLKMatrix4Multiply(modelViewMatrix, this.modelMatrix(false));
		for (int i = 0; i < this.getChildren().count(); i++) {
			SGGNode node = (SGGNode) this.getChildren().objectAtIndex(i);
			node.renderWithModelViewMatrix(childModelViewMatrix);
		}
	}

	/**
	 * Method : update <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void update(float dt) {
		for (int i = 0; i < this.getChildren().count(); i++) {
			SGGNode node = (SGGNode) this.getChildren().objectAtIndex(i);
			node.update(dt);
		}
		GLKVector2 curMove = (GLKVector2) (GLKVector2.GLKVector2MultiplyScalar(this.getMoveVelocity(), dt));
		// if (this.getPosition() == null) {
		// this.setPosition(new GLKVector2(0, 0));
		// }
		this.setPosition(GLKVector2.GLKVector2Add(this.getPosition(), curMove));
		float curRotate = (float) (this.getRotationVelocity() * dt);
		this.setRotation(this.getRotation() + curRotate);
		float curScale = (float) (this.getScaleVelocity() * dt);
		this.setScale(this.getScale() + curScale);
	}

	/**
	 * Method : modelMatrix <!-- begin-user-doc -->
	 * 
	 * @return GLKMatrix4.
	 * @generated
	 */
	public GLKMatrix4 modelMatrix(boolean renderingSelf) {
		GLKMatrix4 modelMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4Identity);
		modelMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4Translate(modelMatrix, this.getPosition().x(), this.getPosition().y(), 0));
		float radians = (float) (GLKMathUtils.GLKMathDegreesToRadians(this.getRotation()));
		modelMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4Rotate(modelMatrix, radians, 0, 0, 1));
		modelMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4Scale(modelMatrix, this.getScale(), this.getScale(), 0));
		if (com.myappconverter.java.foundations.ExpressNullable.assertCondition(renderingSelf)) {
			modelMatrix = (GLKMatrix4) (GLKMatrix4.GLKMatrix4Translate(modelMatrix, -this.getContentSize().width / 2,
					-this.getContentSize().height / 2, 0));
		}
		return modelMatrix;
	}

	/**
	 * Method : boundingBox <!-- begin-user-doc -->
	 * 
	 * @return CGRect.
	 * @generated
	 */
	@Override
	public CGRect boundingBox() {
		CGRect rect = (CGRect) (CGGeometry.CGRectMake(0, 0, this.getContentSize().width, this.getContentSize().height));
		GLKMatrix4 modelMatrix = (GLKMatrix4) (this.modelMatrix(true));
		CGAffineTransform transform = (CGAffineTransform) (CGAffineTransform.CGAffineTransformMake(modelMatrix.m00(), modelMatrix.m01(),
				modelMatrix.m10(), modelMatrix.m11(), modelMatrix.m30(), modelMatrix.m31()));
		return CGAffineTransform.CGRectApplyAffineTransform(rect, transform);
	}

	/**
	 * Method : addChild <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void addChild(com.razeware.SimpleGLKitGame.simpleglkitgame.SGGNode child) {
		this.getChildren().addObject(child);
	}

	/**
	 * Method : handleTap <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void handleTap(CGPoint touchLocation) {
	}

}
