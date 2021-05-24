package br.com.dududueedu.investBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dududueedu.investBackend.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{}