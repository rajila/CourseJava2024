/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rdajila.users.bll;

import com.rdajila.users.dr.UsuarioDr;
import com.rdajila.users.models.Usuario;
import java.util.List;

/**
 *
 * @author rdajila
 */
public interface IUsuarioService {
    List<Usuario> getAll();
    Usuario insert(UsuarioDr data);
    Usuario update(Long id,UsuarioDr data);
    Usuario delete(Long id);
}