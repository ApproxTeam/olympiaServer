/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.approxteam.antcolosseumserver.gamelogic.predicates;

import com.approxteam.antcolosseumserver.PlayerHandler;
import com.approxteam.antcolosseumserver.gamelogic.PlayerState;
import java.util.function.Predicate;

/**
 *
 * @author adamr
 */
public class NotInState implements Predicate<PlayerHandler>{

    private PlayerState[] playerStates;
    
    public NotInState(PlayerState ... playerStates) {
        this.playerStates = playerStates;
    }
    
    @Override
    public boolean test(PlayerHandler player) {
        for(PlayerState state : playerStates) {
            if(player.getPlayerState().equals(state)) {
                return false;
            }
        }
        return true;
    }
    
}
