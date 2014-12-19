
#include "SGGAppDelegate.h"

#include "cocos2d.h"

#include "platform/android/jni/JniHelper.h"
#include <jni.h>
#include <android/log.h>

#define  LOG_TAG    "main"
#define  LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG,LOG_TAG,__VA_ARGS__)


void cocos2d_android_app_init (JNIEnv* env, jobject thiz) {
    LOGD("cocos2d_android_app_init");
    SGGAppDelegate *pAppDelegate = new SGGAppDelegate();
}


