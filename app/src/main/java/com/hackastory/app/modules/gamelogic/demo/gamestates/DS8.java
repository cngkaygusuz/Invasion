package com.hackastory.app.modules.gamelogic.demo.gamestates;

import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;


public class DS8 extends AbstractGameState {
    public DS8() {
        super();

        title = "the Turkish Border";
        narrative = "The boat reaches the coast of Turkey in a week however, Turkey closes its border a day before you get there. They are allowing kids to cross the border.";

        choices.add(new CH1());
        choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "You keep the kids in the boat to keep the family together.";
        }

        public AbstractGameState getNextState() {
            return new EndOfDemo();
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "You let the kids go and stay on the boat with your wife.";
        }

        public AbstractGameState getNextState() {
            return new EndOfDemo();
        }
    }
}