/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users.controllers;

import com.rdajila.users.TestProperties;
import com.rdajila.users.bll.IUsuarioService;
import com.rdajila.users.dr.UsuarioDr;
import com.rdajila.users.models.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rdajila
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private IUsuarioService _servicio;
    
    @Autowired
    private TestProperties testProperties;
    
    @Autowired
    private Environment environment;
    
    @GetMapping
    public List<Usuario> getAll() {
        String song = environment.getProperty("test.song");
        String song1 = testProperties.getSong();
        System.out.println("ddddd");
        System.out.println(song);
        System.out.println(song1);
        System.out.println(environment.getProperty("spring.datasource.username"));
        return _servicio.getAll();
    }
    
    @PostMapping("/create")
    public Usuario insert(@RequestBody UsuarioDr data) {
        return _servicio.insert(data);
    }
    
    @PatchMapping("/{id}")
    public Usuario update(@RequestBody UsuarioDr data,@PathVariable Long id) {
        return _servicio.update(id, data);
    }
    
    @DeleteMapping("/{id}")
    public Usuario delete(@PathVariable Long id) {
        return _servicio.delete(id);
    }
}