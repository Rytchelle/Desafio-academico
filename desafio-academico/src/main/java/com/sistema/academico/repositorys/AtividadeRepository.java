package com.sistema.academico.repositorys;

import com.sistema.academico.models.AtividadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<AtividadeModel, Integer> {
}
