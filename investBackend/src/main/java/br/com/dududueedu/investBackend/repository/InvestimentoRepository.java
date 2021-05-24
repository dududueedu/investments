package br.com.dududueedu.investBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dududueedu.investBackend.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{}