package com.hackastory.app.modules.gamelogic.demo.gamestates;

import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;


public class DS8 extends AbstractGameState {
    public DS8() {
        super();

        title = "the Turkish Border";
        narrative = "A week later your boat reaches the coast of Turkey only to find that the borders are closed. You can see a crush of boats and people who have been denied entry. You hear a human rights activist announcing that children under the age of 12 are being allowed in with parental consent";

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