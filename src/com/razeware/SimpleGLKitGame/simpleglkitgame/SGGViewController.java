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

import com.razeware.SimpleGLKitGame.simpleglkitgame.impl.SGGNode;
import com.myappconverter.java.glkit.GLKViewController;
import com.razeware.SimpleGLKitGame.simpleglkitgame.impl.SGGNode;

public abstract class SGGViewController extends GLKViewController {
	/**
	 * The cached value of the '<em>scene</em>' property.
	 * 
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	public SGGNode scene;

	/**
	 * Returns the value of the '<em><b>scene</b></em>' property.
	 *
	 * @return SGGNode.
	 * @see #setScene(SGGNode)
	 * @generated
	 */
	public SGGNode scene() {
		return this.scene;
	}

	/**
	 * Sets the value of the '{@link <em>scene</em>}' property.
	 * 
	 * @param SGGNode the new value of the '<em>scene</em>' property.
	 * @see #getScene()
	 * @generated
	 */
	public void setScene(SGGNode scene) {
		this.scene = scene;
	}

	/**
	 * Returns the value of the '<em><b>scene</b></em>' property.
	 *
	 * @return SGGNode.
	 * @see #setScene(SGGNode)
	 * @generated
	 */
	public SGGNode getScene() {
		return this.scene;
	}

}
