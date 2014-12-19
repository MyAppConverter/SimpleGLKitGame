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

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;


public class TexturedQuad {
	TexturedVertex bl = new TexturedVertex();
	TexturedVertex br = new TexturedVertex();
	TexturedVertex tl = new TexturedVertex();
	TexturedVertex tr = new TexturedVertex();

	public FloatBuffer offset() {

		FloatBuffer mTriangleVertices = ByteBuffer.allocateDirect(16 * 4)
				.order(ByteOrder.nativeOrder()).asFloatBuffer();
		float[] data = new float[16];
		data[0] = bl.geometryVertex.x;
		data[1] = bl.geometryVertex.y;
		data[2] = tl.geometryVertex.x;
		data[3] = tl.geometryVertex.y;
		data[4] = br.geometryVertex.x;
		data[5] = br.geometryVertex.y;
		data[6] = tr.geometryVertex.x;
		data[7] = tr.geometryVertex.y;
		data[8] = tl.textureVertex.x;
		data[9] = tl.textureVertex.y;
		data[10] = bl.textureVertex.x;
		data[11] = bl.textureVertex.y;
		data[12] = tr.textureVertex.x;
		data[13] = tr.textureVertex.y;
		data[14] = br.textureVertex.x;
		data[15] = br.textureVertex.y;
		mTriangleVertices.put(data).position(0);
		return mTriangleVertices;

	}
	
}