/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users.dal;

import com.rdajila.users.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rdajila
 */
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}