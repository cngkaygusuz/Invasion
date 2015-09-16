package com.hackastory.app.modules.gamelogic.base;


import com.hackastory.app.R;

public class Abstract_SituationStatementText extends AbstractGameState {
    public AbstractGameState nextstate;

    public Abstract_SituationStatementText() {
        layouttype = R.layout.situation_statement_text;
    }

    public AbstractGameState getNextState(int id) {
        return nextstate;
    }
}
