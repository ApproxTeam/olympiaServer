/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.approxteam.antcolosseumserver.gamelogic.actionDivisors;

import java.io.Serializable;

/**
 *
 * @author adamr
 */
public class LoginDivision implements Serializable{
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    
    
}
