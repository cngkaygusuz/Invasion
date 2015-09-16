package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS2 extends AbstractGameState {
    public DS2() {
        title = "A year after";
        narrative = "Kolechia quickly blitzed their way through the defenses of your country. The capital city" +
                "is under aerial bombardment. You have to leave the country.\n" +
                "You have two means of accomplishing this task: You may use your personal car to take temporary refugee" +
                "in one of the neighboring country. You may also board the ship to set sail for Europe.";
        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public String getChoiceText() {
            return "Take the car to the neightboring country";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "Board the ship to Europe.";
        }

        public AbstractGameState getNextState() {
            return new DS3();
        }
    }


}
