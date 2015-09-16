package com.hackastory.app.modules.situation.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;
import com.hackastory.app.utility.ObjectContainer;


public class SituationActivity extends Activity implements View.OnClickListener {
    public static final String STATE_KEY = "A_RANDOM_STATE_KEY";

    private AbstractGameState gameState;

    public void onCreate(Bundle sis) {
        super.onCreate(sis);

        gameState = (AbstractGameState) ObjectContainer.get(STATE_KEY);

        if (gameState == null) {
            Log.e("situation_act", "gamestate is null");
        }

        setContentView(gameState.layouttype);
        gameState.renderActivity(this);
    }

    public void onClick(View view) {
        int id = getViewTagAsInt(view);

        if (id == 1000) {
            setEndOfDemo();
            return;
        }

        AbstractGameState newstate = gameState.getNextState(id);
        ObjectContainer.put(STATE_KEY, newstate);

        Intent i = new Intent(this, SituationActivity.class);
        startActivity(i);
        finish();
    }

    private int getViewTagAsInt(View view) {
        String tag = (String) view.getTag();
        return Integer.parseInt(tag);
    }

    private void setEndOfDemo() {
        setContentView(R.layout.endofdemo);
    }
}
