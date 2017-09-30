/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.approxteam.antcolosseumserver;

import com.approxteam.antcolosseumserver.gamelogic.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.websocket.Session;

/**
 *
 * @author adamr
 */
public class PlayerHandler {
            
    private PlayerState playerState;
    private Session session;
    public PlayerHandler(Session session) {
        this.playerState = PlayerState.MAINMENU;
        this.session = session;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public Session getSession() {
        return session;
    }
    
    public void switchState(PlayerState newState) {
        this.playerState = newState;
    }
    
    
    
    
}
