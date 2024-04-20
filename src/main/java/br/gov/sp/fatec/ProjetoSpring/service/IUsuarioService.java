package br.gov.sp.fatec.ProjetoSpring.service;

import java.util.List;

import br.gov.sp.fatec.ProjetoSpring.entity.Usuario;

public interface IUsuarioService {
    public Usuario buscarUsuarioPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    public List<Usuario> buscarTodosUsuarios();
}
