package com.cp.jni;

/**
 * Created by T430 on 2018/3/19.
 */

public class JNIClass {
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI();
}
