package com.hackastory.app.modules.gamelogic.demo.gamestates;

import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;


public class DS7 extends AbstractGameState {
    public DS7() {
        super();

        title = "Human Trafficker";
        narrative = "You get approached by a trafficker. He says he can he can get your family to Europe for $20,000 but the dog has to be left behind.";

        choices.add(new CH1());
        choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public CH1() {
            enabled = true;
        }

        public String getChoiceText() {
            return "You pay and are left with $5000";
        }

        public AbstractGameState getNextState() {
            return new DS8();
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "You choose to try your luck with a raft that costs $2,000";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }
}