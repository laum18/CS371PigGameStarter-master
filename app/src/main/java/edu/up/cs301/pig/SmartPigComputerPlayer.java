package edu.up.cs301.pig;

import android.util.Log;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class SmartPigComputerPlayer extends GameComputerPlayer {

    /**
     * ctor does nothing extra
     */
    public SmartPigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {

        PigGameState p = (PigGameState)info;
        if(p.getCurPlayer() == playerNum){
            int eduGuess;
            if(p.getCurTotal() < 10 && !((p.getPlayerOneScore()+p.getCurTotal())>=50)){
                eduGuess = 1;
            }
            else{
                eduGuess = 0;
            }

            if (eduGuess == 0){
                PigHoldAction hold = new PigHoldAction(this);
                game.sendAction(hold);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Log.i("Computer Player", "Turn Over");
            }
            else if(eduGuess == 1){
                PigRollAction roll = new PigRollAction(this);
                game.sendAction(roll);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        else return;
        // TODO  You will implement this method
    }//receiveInfo

}
