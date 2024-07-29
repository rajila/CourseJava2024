/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users.controllers;

import com.rdajila.users.bll.IAuthService;
import com.rdajila.users.dr.AuthDr;
import com.rdajila.users.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rdajila
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private IAuthService _servicio;
    
    @PostMapping("/login")
    public Usuario login(@RequestBody AuthDr data) {
        return _servicio.Login(data.getEmail(), data.getPassword());
    }
}
