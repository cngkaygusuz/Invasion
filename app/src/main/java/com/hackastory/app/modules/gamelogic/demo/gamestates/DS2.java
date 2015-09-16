package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS2 extends AbstractGameState {
    public DS2() {
        title = "A year after";
        narrative = "X, 33 is sitting in his apartment one evening and suddenly bombs go off in the city center and there are huge numbers of casualties. The unrest that started in the southern border has now reached the capital and people decide to leave for safer areas.";
        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "Leave";
        }

        public AbstractGameState getNextState() {
            return new DS3();
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "Stay";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }
}
