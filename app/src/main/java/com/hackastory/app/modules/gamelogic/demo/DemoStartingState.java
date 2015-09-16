package com.hackastory.app.modules.gamelogic.demo;


import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementText;
import com.hackastory.app.modules.gamelogic.demo.gamestates.DS2;

public class DemoStartingState extends Abstract_SituationStatementText {
    public DemoStartingState() {
        super();

        title = "Prologue";
        narrative = "You are a 30 year old architect residing in Kolechia, living quite a comfortable life." +
                "The power struggle that was going on in Arstotzka has ended in favor of ultranationalists." +
                "They held your country responsible for the troubles they had to go through. In a turn of unexpected" +
                "events they declared war, but it doesn't really looks like they are going to overwhelm the armed forces.";

        nextstate = new DS2();
    }
}
