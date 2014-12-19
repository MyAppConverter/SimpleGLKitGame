package org.cocos2dx.lib;

import com.myappconverter.java.foundations.NSString;

public class SimpleAudioEngine {

	private static SimpleAudioEngine instance;

	public static SimpleAudioEngine sharedEngine() {
		if (instance == null)
			instance = new SimpleAudioEngine();
		return instance;
	}

	public void playBackgroundMusic(NSString filename) {
		Cocos2dxActivity.playBackgroundMusic(filename.getWrappedString(), false);
	}

	public void preloadEffect(NSString filename) {
		Cocos2dxActivity.preloadEffect(filename.getWrappedString());
	}

	public void playEffect(NSString filename) {
		Cocos2dxActivity.playEffect(filename.getWrappedString(), false);
	}
}
