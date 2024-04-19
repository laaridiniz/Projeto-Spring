package br.gov.sp.fatec.ProjetoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.ProjetoSpring.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
