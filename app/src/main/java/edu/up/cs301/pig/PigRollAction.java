package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;

/**
 * Created by laum18 on 10/12/2016.
 */
public class PigRollAction extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public PigRollAction(GamePlayer player) {
        super(player);
    }
}