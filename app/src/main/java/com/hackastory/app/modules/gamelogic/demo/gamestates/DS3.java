package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;
import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementText;

public class DS3 extends AbstractGameState {
    public DS3() {
        super();

        title = "Money";
        narrative = "Early morning, people are scampering to get out of the city. Houses are abandoned and there are long lines of people in the highway trying to move away from the city. ATMs are maxed out and banks don’t have enough reserve money to replace what has been withdrawn. Your options for liquidating your assets decrease by the hour.";

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
        public CH2() {
            enabled = true;
        }

        public String getChoiceText() {
            return "You sell your valuables for marked down prices and travel with cash only";
        }

        public AbstractGameState getNextState() {
            return new DS4();
        }
    }

}
