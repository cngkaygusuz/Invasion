package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS4 extends AbstractGameState {
    public DS4() {
        super();

        title = "Concluding the Boat Trip";
        narrative = "You are informed that you have arrived to Spain. Unfortunately, for some reason the captain does" +
                "not allow all the people to disembark the ship at once. Only a few people can get off every day." +
                "Your turn finally arrives, but before taking this opportunity, maybe you should consider letting" +
                "a friend of you with a family go first. You don't know when you will have the opportunity again," +
                "but it definitely feels like he badly needs to attent to his family.";

        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "Do not give your place";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "Give your place";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }

}
