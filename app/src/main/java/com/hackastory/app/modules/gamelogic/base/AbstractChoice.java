package com.hackastory.app.modules.gamelogic.base;


public abstract class AbstractChoice {
    public abstract String getChoiceText();
    public abstract AbstractGameState getNextState();
}
