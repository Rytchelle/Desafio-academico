package com.sistema.academico.repositorys;

import com.sistema.academico.models.ParticipanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipanteRepository extends JpaRepository<ParticipanteModel, Integer> {
}
