package com.hackastory.app.modules.gamelogic.base;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.LinearLayout;
import com.hackastory.app.R;
import com.hackastory.app.modules.situation.activities.SituationActivity;

public abstract class AbstractChoice {
    public boolean enabled = false;

    public abstract String getChoiceText();
    public abstract AbstractGameState getNextState();

    public Button asButton(SituationActivity act, String tag) {
        Button btn = new Button(act);

        btn.setClickable(enabled);

        btn.setText(getChoiceText()); btn.setTextColor(Color.parseColor("#BBBBBB"));
        btn.setOnClickListener(act);
        btn.setTag(tag);
        return btn;
    }
}