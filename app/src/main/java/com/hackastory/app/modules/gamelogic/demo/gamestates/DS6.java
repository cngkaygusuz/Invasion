package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementImage;


public class DS6 extends Abstract_SituationStatementImage {
    public DS6() {
        super();

        title = "You have departed by a boat";

        images.add(R.drawable.leavebysea);

        nextstate = new DS7();
    }
}
