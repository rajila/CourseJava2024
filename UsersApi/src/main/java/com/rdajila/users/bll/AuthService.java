/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users.bll;

import com.rdajila.users.dal.IUsuarioRepository;
import com.rdajila.users.models.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rdajila
 */
@Service
public class AuthService implements IAuthService {
    @Autowired
    private IUsuarioRepository _repositorio;
    
    @Override
    public Usuario Login(String emailIn, String passwordIn) {
        Usuario _usuarioLogin = new Usuario();
        // No es la mejor opción de buscar usuario. Crear query para filtrar el registro
        this._repositorio.findAll().forEach((el) -> {
            if (    el.getEstado() == 1 && 
                    el.getEmail().toLowerCase().compareTo(emailIn.toLowerCase()) == 0 &&
                    el.getPassword().toLowerCase().compareTo(passwordIn.toLowerCase()) == 0
                ) {
                BeanUtils.copyProperties(el, _usuarioLogin);
            }
        });
        return _usuarioLogin;
    }
}
