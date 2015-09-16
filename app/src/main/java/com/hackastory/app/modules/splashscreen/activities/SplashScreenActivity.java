package com.hackastory.app.modules.splashscreen.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;
import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.demo.DemoStartingState;
import com.hackastory.app.modules.situation.activities.SituationActivity;
import com.hackastory.app.utility.ObjectContainer;


public class SplashScreenActivity extends Activity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());

        setContentView(R.layout.splashscreen);
        setCallbacks();
    }

    public void onClick(View view) {
        // get random starting situation, for demo, it is fixed.
        switch (view.getId()) {
            case R.id.facebooklogin:
                startDemoGame();
                break;
            default:
                Log.e("splashscreen", "Unidentified button");
        }
    }

    private void setCallbacks() {
        Button loginButton = (Button) findViewById(R.id.facebooklogin);
        loginButton.setOnClickListener(this);
    }

    private void startDemoGame() {
        ObjectContainer.put(SituationActivity.STATE_KEY, new DemoStartingState());
        Intent i = new Intent(this, SituationActivity.class);
        startActivity(i);
        finish();
    }
}
