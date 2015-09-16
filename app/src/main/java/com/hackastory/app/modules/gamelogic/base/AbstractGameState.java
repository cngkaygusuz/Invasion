package com.hackastory.app.modules.gamelogic.base;


import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hackastory.app.R;
import com.hackastory.app.modules.situation.activities.SituationActivity;

import java.util.ArrayList;

public abstract class AbstractGameState {
    // Everything is a singleton.

    public String title;
    public String narrative;
    public ArrayList<Integer> images;  // Holds R.drawable.<BLAH>
    public ArrayList<AbstractChoice> choices;
    public int layouttype;  // Should be something like  R.layout.<BLAH>

    public AbstractGameState() {
        images = new ArrayList<Integer>();
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

    protected void renderSituationText(SituationActivity act) {
        TextView titleview = (TextView) act.findViewById(R.id.title);
        TextView narrativeview = (TextView) act.findViewById(R.id.narrative);

        titleview.setText(title);
        narrativeview.setText(narrative);

        LinearLayout buttoncontainer = (LinearLayout) act.findViewById(R.id.buttonholder);

        for (int i=0; i<choices.size(); i++) {
            buttoncontainer.addView(choices.get(i).asButton(act, String.format("%d", i)));
        }
    }

    protected void renderSituationImage(SituationActivity act) {

    }

    protected void renderSituationStatementText(SituationActivity act) {
        TextView titleview = (TextView) act.findViewById(R.id.title);
        TextView narrativeview = (TextView) act.findViewById(R.id.narrative);
        Button continuebtn = (Button) act.findViewById(R.id.continue_button);

        titleview.setText(title);
        narrativeview.setText(narrative);

        continuebtn.setTag("123");
        continuebtn.setOnClickListener(act);
    }

    protected void renderSituationStatementTextImage(SituationActivity act) {
        TextView titleview = (TextView) act.findViewById(R.id.title);
        Button continuebtn = (Button) act.findViewById(R.id.continue_button);
        ImageView imview = (ImageView) act.findViewById(R.id.image);

        titleview.setText(title);
        imview.setImageResource(images.get(0));

        continuebtn.setTag("123");
        continuebtn.setOnClickListener(act);
    }

    protected void renderSituationDecideFriends(SituationActivity act) {

    }
}

