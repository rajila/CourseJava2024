/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rdajila.users.bll;

import com.rdajila.users.dal.IUsuarioRepository;
import com.rdajila.users.dr.UsuarioDr;
import com.rdajila.users.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author rdajila
 */
@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository _repositorio;
    
    @Override
    public List<Usuario> getAll() {
        List<Usuario> _listTmp = new ArrayList<>();
        // No mejor solución, para filtrar solo los de estado = 1
        this._repositorio.findAll(Sort.by(Sort.Direction.DESC, "id")).forEach((el) -> {
            if (el.getEstado() == 1) _listTmp.add(el);
        });
        return _listTmp;
    }

    @Override
    public Usuario insert(UsuarioDr data) {
        Usuario _data = new Usuario();
        _data.setEstado(1);
        BeanUtils.copyProperties(data, _data);
        return this._repositorio.save(_data);
    }

    @Override
    public Usuario update(Long id, UsuarioDr data) {
        Usuario _usuarioDB = _repositorio.getReferenceById(id);
        BeanUtils.copyProperties(data, _usuarioDB);
        return this._repositorio.save(_usuarioDB);
    }

    @Override
    public Usuario delete(Long id) {
        Usuario _usuarioDB = _repositorio.getReferenceById(id);
        _usuarioDB.setEstado(-1);
        _usuarioDB.setEmail(_usuarioDB.getEmail() + "_delete_" + _usuarioDB.getId().toString());
        return this._repositorio.save(_usuarioDB);
    }
}