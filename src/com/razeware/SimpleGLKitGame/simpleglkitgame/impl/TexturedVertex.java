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

import com.myappconverter.java.applicationservices.CGPoint;


public class TexturedVertex {

	CGPoint geometryVertex = new CGPoint();
	CGPoint textureVertex = new CGPoint();

	public static int sizeOf() {
		return (2*2)*2;
	}
}
