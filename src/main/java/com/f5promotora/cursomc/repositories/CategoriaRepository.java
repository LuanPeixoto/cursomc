package com.f5promotora.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.f5promotora.cursomc.domain.Categoria;

//esse metodo vai ter acesso ao banco de dados, para salvar, alterar e deletar
//recebe o Id da classe Categoria
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}