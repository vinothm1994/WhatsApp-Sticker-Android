/*
 * Copyright (c) WhatsApp Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.example.samplestickerapp;

import android.app.Application;
import android.content.Context;

import com.example.samplestickerapp.utils.Analytics;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.firebase.FirebaseApp;

public class StickerApplication extends Application {
    public static StickerApplication appContext;

    public static Context getAppContext() {
        return appContext;
    }

    public static StickerApplication getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        FirebaseApp.initializeApp(this);
        Analytics.init(this);
        appContext = this;
    }


}
