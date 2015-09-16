package com.hackastory.app.modules.gamelogic.base;

import com.hackastory.app.R;


public class Abstract_SituationStatementImage extends AbstractGameState {
    public AbstractGameState nextstate;

    public Abstract_SituationStatementImage() {
        super();
        layouttype = R.layout.situation_statement_text_image;
    }

    public AbstractGameState getNextState(int id) {
        return nextstate;
    }
}
