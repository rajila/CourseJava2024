/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rdajila.users.bll;

import com.rdajila.users.models.Usuario;

/**
 *
 * @author rdajila
 */
public interface IAuthService {
    Usuario Login(String emailIn, String passwordIn);
}
