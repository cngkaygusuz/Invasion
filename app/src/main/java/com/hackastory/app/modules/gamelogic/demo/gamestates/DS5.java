package com.hackastory.app.modules.gamelogic.demo.gamestates;

import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;


public class DS5 extends AbstractGameState {
    public DS5() {
        super();

        title = "Departure";
        narrative = "A few days later, you finally make it to the nearest border, you see the border police with guns and dogs around the barbed wire fence. You have a decision to make. Do you;";

        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "Leave by land";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }

    private class CH2 extends AbstractChoice {
        public CH2() {
            enabled = true;
        }

        public String getChoiceText() {
            return "Leave by sea";
        }

        public AbstractGameState getNextState() {
            return new DS6();
        }
    }
}
