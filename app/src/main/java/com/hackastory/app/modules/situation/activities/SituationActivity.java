package com.hackastory.app.modules.situation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;
import com.hackastory.app.utility.ObjectContainer;


public class SituationActivity extends ActionBarActivity implements View.OnClickListener {
    public static final String STATE_KEY = "A_RANDOM_STATE_KEY";

    private AbstractGameState gameState;

    public void onCreate(Bundle sis) {
        super.onCreate(sis);

        gameState = (AbstractGameState) ObjectContainer.get(STATE_KEY);

        setContentView(gameState.layouttype);
        gameState.renderActivity(this);
    }

    public void onClick(View view) {
        int id = getViewTagAsInt(view);

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
}
