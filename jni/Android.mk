
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

$(call import-add-path,$(LOCAL_PATH)/../..//SimpleGLKitGame/cocos2d)

$(call import-add-path,$(LOCAL_PATH)/../..//SimpleGLKitGame/cocos2d/extension)




LOCAL_MODULE := 

LOCAL_MODULE_FILENAME := 

LOCAL_SRC_FILES := hellocpp/main.cpp \
             
                  
LOCAL_C_INCLUDES := $(LOCAL_PATH)/../../Classes

LOCAL_WHOLE_STATIC_LIBRARIES += cocos2d


include $(BUILD_SHARED_LIBRARY)

$(call import-module,.)

$(call import-module,/SimpleGLKitGame/cocos2d)

$(call import-module,/SimpleGLKitGame/cocos2d/extension)



