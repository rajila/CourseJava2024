/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author rdajila
 */
@ConfigurationProperties("test")
public class TestProperties {
    private String song;
 
    public String getSong() {
        return song;
    }
 
    public void setSong(String song) {
        this.song = song;
    }
}
