/*

____ Followed the class OOP diagram
___ *Grading tags completed


Tier 1: Model		50
	Move test 			pass
	Food test			____
	Eat test 			____
	Home test 			____
	Zoom pickup test	____
	Bar test 			____
	Caught test 		____
	No energy test		____
	Win test 			____

Tier 2: Connect Views		22
	All views present test	 	____
	Starting values test pass	____
	Move test 	 				____
	Food test	 				____
	Eat test  					____
	Bar test	 				____
	Home test	 				____
	Reset test	 				____

Tier 3a: State Machine/Event Rules	34
	Framework there	 			____
	Base to heavy*	 			____
	Heavy to zoom* 				____
	Base to zoom* 				____
	Caught*	 					____
	No energy*	 				____
	Win*	 					____
	Reset on close ***	 		____

Tier 3b: Floating Action	 		___
	All buttons there 		 		___
	Icons set and distinguishable	___
	Opens/closes properly 	 		___
	Tribble color updated.	 		___

Tier 3c: Layout **	26
	Custom’s View’s aspect ratio constant			___
	Relative size of objects in view maintained 	___
	Works in required screen sizes 	 				___


Tier 3d: Rotation		20
	Required state saved on rotation 	 		___

Tier 4: Extensions		30

 */

package edu.sdsmt.hamsterrunwilsonadeline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Game getGame() {

        return null;
    }

    StateMachine getStateMachine() {

        return null;
    }
}