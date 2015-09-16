package com.hackastory.app.modules.gamelogic.demo.gamestates;


import android.widget.Button;
import com.hackastory.app.R;
import com.hackastory.app.modules.gamelogic.base.Abstract_SituationStatementText;
import com.hackastory.app.modules.situation.activities.SituationActivity;

public class DS5 extends Abstract_SituationStatementText {
    public DS5() {
        title = "Concluding the Boat Trip";
        narrative = "You decided to give your place to the man. You can read his gratitude in his eyes. He gives you " +
                "a piece of paper, which seems holding an address.\n" +
                "OBTAINED UNRECOGNIZED ADDRESS";
    }

    protected void renderSituationStatementText(SituationActivity act) {
        super.renderSituationStatementText(act);
        Button btn = (Button) act.findViewById(R.id.continue_button);
        btn.setTag("1000");
    }
}
