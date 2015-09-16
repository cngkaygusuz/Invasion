package com.hackastory.app.modules.gamelogic.base;


import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.TextView;
import com.hackastory.app.R;
import com.hackastory.app.modules.situation.activities.SituationActivity;

import java.util.ArrayList;

public abstract class AbstractGameState {
    // Everything is a singleton.

    public String title;
    public String narrative;
    public ArrayList<Bitmap> images;
    public ArrayList<AbstractChoice> choices;
    public int layouttype;  // Should be something like  R.layout.<BLAH>

    public AbstractGameState() {
        images = new ArrayList<Bitmap>();
        choices = new ArrayList<AbstractChoice>();
    }

    public void renderActivity(SituationActivity act) {
        if (layouttype == R.layout.situation_text) {
            renderSituationText(act);
        } else if (layouttype == R.layout.situation_image) {
            renderSituationImage(act);
        } else if (layouttype == R.layout.situation_statement_text) {
            renderSituationStatementText(act);
        } else if (layouttype == R.layout.situation_statement_text_image) {
            renderSituationStatementTextImage(act);
        } else if (layouttype == R.layout.situation_decidefriends) {
            renderSituationDecideFriends(act);
        }
    }

    public AbstractGameState getNextState(int id) {
        // Override this when using statement types.
        return choices.get(id).getNextState();
    }

    private void renderSituationText(SituationActivity act) {

    }

    private void renderSituationImage(SituationActivity act) {

    }

    private void renderSituationStatementText(SituationActivity act) {
        TextView titleview = (TextView) act.findViewById(R.id.title);
        TextView narrativeview = (TextView) act.findViewById(R.id.narrative);
        Button continuebtn = (Button) act.findViewById(R.id.continue_button);

        titleview.setText(title);
        narrativeview.setText(narrative);

        continuebtn.setTag("123");
        continuebtn.setOnClickListener(act);
    }

    private void renderSituationStatementTextImage(SituationActivity act) {

    }

    private void renderSituationDecideFriends(SituationActivity act) {

    }
}

