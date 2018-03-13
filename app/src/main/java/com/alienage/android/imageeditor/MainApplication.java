package com.alienage.android.imageeditor;

import android.app.Application;

import com.adobe.creativesdk.foundation.AdobeCSDKFoundation;
import com.adobe.creativesdk.foundation.auth.IAdobeAuthClientCredentials;

/**
 * Created by utsavoza on 17/4/17.
 */

public class MainApplication extends Application implements IAdobeAuthClientCredentials {

    private static final String CREATIVE_SDK_CLIENT_ID      = "20035243f9a146c681d59786a35ad3c0";
    private static final String CREATIVE_SDK_CLIENT_SECRET  = "150db997-9f46-4c4c-9257-492d68a60c0d";
    private static final String CREATIVE_SDK_REDIRECT_URI   = "ams+1ec29e2038842e210604c832ffb0ef2a92ca441f://adobeid/20035243f9a146c681d59786a35ad3c0";

    /*
    *
    *
        private static final String CREATIVE_SDK_CLIENT_ID      = "<-- CLIENT ID -->";
        private static final String CREATIVE_SDK_CLIENT_SECRET  = "<-- CLIENT SECRET -->";
        private static final String CREATIVE_SDK_REDIRECT_URI   = "<-- REDIRECT URI -->";
    *
    *
    */


    private static final String[] CREATIVE_SDK_SCOPES = {"email", "profile", "address"};

    @Override
    public void onCreate() {
        super.onCreate();
        AdobeCSDKFoundation.initializeCSDKFoundation(getApplicationContext());
    }

    @Override
    public String getClientID() {
        return CREATIVE_SDK_CLIENT_ID;
    }

    @Override
    public String getClientSecret() {
        return CREATIVE_SDK_CLIENT_SECRET;
    }

    @Override
    public String[] getAdditionalScopesList() {
        return CREATIVE_SDK_SCOPES;
    }

    @Override
    public String getRedirectURI() {
        return CREATIVE_SDK_REDIRECT_URI;
    }
}
