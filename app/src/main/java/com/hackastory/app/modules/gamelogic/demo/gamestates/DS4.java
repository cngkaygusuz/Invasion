package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.AbstractChoice;
import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

public class DS4 extends AbstractGameState {
    public DS4() {
        super();

        title = "A Friend's Request";
        narrative = "Two hours later, you pack up whatever you can fit in the trunk of the car. As you say your final goodbyes to your neighbours, your friend from university comes to your house. Worried and frightened, he asks for a ride away from the capital.\n\nMake your decision.";

        images.add(R.drawable.emiel);
        images.add(R.drawable.dog);

        layouttype = R.layout.situation_decidefriends;
    }

    public AbstractGameState getNextState(int id) {
        if (id == 1) {
            return new DS5();
        } else {
            throw new RuntimeException("DIE IN HELL.");
        }
    }
}
