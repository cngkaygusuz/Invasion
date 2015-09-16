package com.hackastory.app.modules.gamelogic.base;


import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import com.hackastory.app.modules.situation.activities.SituationActivity;

public abstract class AbstractChoice {
    public abstract String getChoiceText();
    public abstract AbstractGameState getNextState();

    public Button asButton(SituationActivity act, String tag) {
        Button btn = new Button(act);
        btn.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        btn.setText(getChoiceText());
        btn.setOnClickListener(act);
        btn.setTag(tag);
        return btn;
    }
}
