package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS4 extends AbstractGameState {
    public DS4() {
        super();

        title = "A Friend's Request";
        narrative = "As you start leave with the family, your friend from university comes to your house and asks for a ride";

        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "You take him and leave the family dog behind";
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
            return "You ask him to make other arrangements and choose the family dog";
        }

        public AbstractGameState getNextState() {
            return new DS5();
        }
    }

}
