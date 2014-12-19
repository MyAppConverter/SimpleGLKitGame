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

import java.nio.FloatBuffer;

import android.opengl.GLES20;
import android.util.Log;

import com.myappconverter.java.applicationservices.CGGeometry;
import com.myappconverter.java.applicationservices.CGRect;
import com.myappconverter.java.foundations.NSBundle;
import com.myappconverter.java.foundations.NSDictionary;
import com.myappconverter.java.foundations.NSError;
import com.myappconverter.java.foundations.NSNumber;
import com.myappconverter.java.foundations.NSObjCRuntime;
import com.myappconverter.java.foundations.NSString;
import com.myappconverter.java.glkit.GLKBaseEffect;
import com.myappconverter.java.glkit.GLKEffects;
import com.myappconverter.java.glkit.GLKMatrix4;
import com.myappconverter.java.glkit.GLKTextureInfo;
import com.myappconverter.java.glkit.GLKTextureLoader;
import com.myappconverter.java.glkit.MACGLES20;

public class SGGSprite extends com.razeware.SimpleGLKitGame.simpleglkitgame.SGGSprite {

	MACGLES20 gl;

	public SGGSprite() {
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
	 * The cached value of the '<em>quad</em>' property.
	 * 
	 * @see #getQuad()
	 * @generated
	 * @ordered
	 */
	public TexturedQuad quad;

	/**
	 * Returns the value of the '<em><b>quad</b></em>' property.
	 * 
	 * @return TexturedQuad.
	 * @see #setQuad(TexturedQuad)
	 * @generated
	 */
	public TexturedQuad quad() {
		return this.quad;
	}

	/**
	 * Sets the value of the '{@link <em>quad</em>}' property.
	 * 
	 * @param TexturedQuad the new value of the '<em>quad</em>' property.
	 * @see #getQuad()
	 * @generated
	 */
	public void setQuad(TexturedQuad quad) {
		this.quad = quad;
	}

	/**
	 * Returns the value of the '<em><b>quad</b></em>' property.
	 * 
	 * @return TexturedQuad.
	 * @see #setQuad(TexturedQuad)
	 * @generated
	 */
	public TexturedQuad getQuad() {
		return this.quad;
	}

	/**
	 * The cached value of the '<em>textureInfo</em>' property.
	 * 
	 * @see #getTextureInfo()
	 * @generated
	 * @ordered
	 */
	public GLKTextureInfo textureInfo;

	/**
	 * Returns the value of the '<em><b>textureInfo</b></em>' property.
	 * 
	 * @return GLKTextureInfo.
	 * @see #setTextureInfo(GLKTextureInfo)
	 * @generated
	 */
	public GLKTextureInfo textureInfo() {
		return this.textureInfo;
	}

	/**
	 * Sets the value of the '{@link <em>textureInfo</em>}' property.
	 * 
	 * @param GLKTextureInfo the new value of the '<em>textureInfo</em>' property.
	 * @see #getTextureInfo()
	 * @generated
	 */
	public void setTextureInfo(GLKTextureInfo textureInfo) {
		this.textureInfo = textureInfo;
	}

	/**
	 * Returns the value of the '<em><b>textureInfo</b></em>' property.
	 * 
	 * @return GLKTextureInfo.
	 * @see #setTextureInfo(GLKTextureInfo)
	 * @generated
	 */
	public GLKTextureInfo getTextureInfo() {
		return this.textureInfo;
	}

	/**
	 * Method : initWithFile <!-- begin-user-doc -->
	 * 
	 * @return SGGSprite.
	 * @generated
	 */
	public SGGSprite initWithFile(NSString fileName, GLKBaseEffect effect) {
		super.init();

		this.setEffect(effect);
		NSDictionary options = NSDictionary.dictionaryWithObjectsAndKeys(NSNumber.numberWithBool(true),
				GLKTextureLoader.GLKTextureLoaderOriginBottomLeft, null);
		NSError[] error = { new NSError() };
		NSString path = NSBundle.mainBundle().pathForResourceOfType(fileName, null);

		this.setTextureInfo(GLKTextureLoader.textureWithContentsOfFileOptionsError(path, options, error));
		if (this.getTextureInfo() == null) {
			NSObjCRuntime.NSLog(new NSString("Error loading file: %@"), error[0].localizedDescription());
			return null;
		}

		// Log.d(TAG, "" + "fileName = " + fileName.getWrappedString()
		// + " texture = " + this.textureInfo.name() + " pathId = " + path);
		this.setContentSize(CGGeometry.CGSizeMake(this.getTextureInfo().width(), this.getTextureInfo().height()));
		TexturedQuad newQuad = new TexturedQuad();
		newQuad.bl.geometryVertex = CGGeometry.CGPointMake(0, 0);
		newQuad.br.geometryVertex = CGGeometry.CGPointMake(this.getTextureInfo().width(), 0);
		newQuad.tl.geometryVertex = CGGeometry.CGPointMake(0, this.getTextureInfo().height());
		newQuad.tr.geometryVertex = CGGeometry.CGPointMake(this.getTextureInfo().width(), this.getTextureInfo().height());
		newQuad.bl.textureVertex = CGGeometry.CGPointMake(0, 0);
		newQuad.br.textureVertex = CGGeometry.CGPointMake(1, 0);
		newQuad.tl.textureVertex = CGGeometry.CGPointMake(0, 1);
		newQuad.tr.textureVertex = CGGeometry.CGPointMake(1, 1);
		this.setQuad(newQuad);
		return this;
	}

	/**
	 * Method : renderWithModelViewMatrix <!-- begin-user-doc -->
	 * 
	 * @return void.
	 * @generated
	 */
	public void renderWithModelViewMatrix(GLKMatrix4 modelViewMatrix) {
		super.renderWithModelViewMatrix(modelViewMatrix);
		this.getEffect().texture2d0().setName(this.getTextureInfo().name());
		this.getEffect().texture2d0().setEnabled(true);
		this.getEffect().transform().setModelviewMatrix(GLKMatrix4.GLKMatrix4Multiply(modelViewMatrix, this.modelMatrix(true)));
		this.getEffect().prepareToDraw();

		// The pointer to our buffer, containing all of the positional data
		FloatBuffer offset = quad.offset();

		MACGLES20.glEnableVertexAttribArray(GLKEffects.GLKVertexAttrib.GLKVertexAttribPosition);// 0
		MACGLES20.glEnableVertexAttribArray(GLKEffects.GLKVertexAttrib.GLKVertexAttribTexCoord0);// 3
		// offset.position(0);
		GLES20.glVertexAttribPointer(GLKEffects.GLKVertexAttrib.GLKVertexAttribPosition.ordinal(), 2, GLES20.GL_FLOAT, false,
				TexturedVertex.sizeOf(), offset);
		offset.position(8);
		GLES20.glVertexAttribPointer(GLKEffects.GLKVertexAttrib.GLKVertexAttribTexCoord0.ordinal(), 2, GLES20.GL_FLOAT, false,
				TexturedVertex.sizeOf(), offset);
		// Draw two Array
		GLES20.glDrawArrays(GLES20.GL_TRIANGLE_STRIP, 0, 4);
	}

}
