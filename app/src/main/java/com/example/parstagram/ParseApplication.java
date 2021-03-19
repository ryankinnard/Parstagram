package com.example.parstagram;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f8AGAJnffytvWch2DkFa6RFDWVfEUhd3tel6wYVl")
                .clientKey("fNVk2vrKQny4P7zqhPdgeWB4uvDxGM1Q7OA23Z5h")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
