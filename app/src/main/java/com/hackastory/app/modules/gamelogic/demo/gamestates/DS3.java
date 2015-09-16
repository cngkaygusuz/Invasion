package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;
import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementText;

public class DS3 extends AbstractGameState {
    public DS3() {
        super();

        title = "Money";
        narrative = "The ATMs have been maxed out, there is no other way of liquidating your assets.";

        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "You pack up the money and whatever jewellery you can find";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "You sell your valuables for marked down prices and travel with cash only";
        }

        public AbstractGameState getNextState() {
            return new DS4();
        }
    }

}
