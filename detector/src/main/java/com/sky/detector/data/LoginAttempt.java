/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sky.detector.data;

import java.util.Date;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class LoginAttempt {
    private String ip;
    private LoginDate date;
    private Action action;
    private String username;

    public LoginAttempt(String ip, LoginDate date, Action action, String username) {
        this.ip = ip;
        this.date = date;
        this.action = action;
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public LoginDate getDate() {
        return date;
    }

    public Action getAction() {
        return action;
    }

    public String getUsername() {
        return username;
    }
    
}
