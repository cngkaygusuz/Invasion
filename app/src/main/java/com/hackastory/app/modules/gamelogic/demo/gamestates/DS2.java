package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS2 extends AbstractGameState {
    public DS2() {
        title = "A year after";
        narrative = "Kolechia have been making inroads into the capital from the southern part of the country. One night as you sit in the living room watching a football match, you can hear aerial bombardment. Suddenly, the phones are ringing off the hook. People are making sudden decisions to pack and leave the city.";
        choices.add(new CH1()); choices.add(new CH2());

        layouttype = R.layout.situation_text;
    }

    private class CH1 extends AbstractChoice {
        public CH1() {
            enabled = true;
        }

        public String getChoiceText() {
            return "You can follow the example of your friends and relatives and leave with the family";
        }

        public AbstractGameState getNextState() {
            return new DS3();
        }
    }

    private class CH2 extends AbstractChoice {
        public String getChoiceText() {
            return "You can wait it out in the city and hope things get better";
        }

        public AbstractGameState getNextState() {
            return null;
        }
    }
}
