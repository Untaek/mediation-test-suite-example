package com.example.admobtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.ads.mediationtestsuite.MediationTestSuite;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    String MY_TAG = "AdmobTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
//            AudienceNetworkAds
//                    .buildInitSettings(MainActivity.this)
//                    .initialize();
//        RequestConfiguration configuration = new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("CC3B7C7E3F3C5DF3AE6603ECBA2A7C14")).build();
//        MobileAds.setRequestConfiguration(configuration);
        MobileAds.initialize(MainActivity.this);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        if (adRequest.isTestDevice(this)) {
            Log.d(MY_TAG, "Test Advertisement");
        } else {
            Log.d(MY_TAG, "Not Test Advertisement");
        }

//        adView.loadAd(adRequest);

        MediationTestSuite.launch(this);
    }
}
