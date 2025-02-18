package com.sistema.academico.repositorys;

import com.sistema.academico.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
}
