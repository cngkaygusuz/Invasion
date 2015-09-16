package com.hackastory.app.modules.gamelogic.demo.gamestates;


import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementText;

public class DS3 extends Abstract_SituationStatementText {
    public DS3() {
        title = "The Boat Trip";
        narrative = "Insert narrative here";

        layouttype = R.layout.situation_statement_text;
        nextstate = new DS4();
    }
}
