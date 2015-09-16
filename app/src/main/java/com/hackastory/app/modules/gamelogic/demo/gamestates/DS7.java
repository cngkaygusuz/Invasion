package com.hackastory.app.modules.gamelogic.demo.gamestates;

import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;


public class DS7 extends AbstractGameState {
    public DS7() {
        super();

        title = "Human Trafficker";
        narrative = "The trafficker asks $20,000 to take the entire family in a bigger boat but you have to leave the dog behind.";

        choices.add(new CH1());
        choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
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