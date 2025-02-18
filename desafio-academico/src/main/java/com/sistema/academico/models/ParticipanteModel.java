package com.sistema.academico.models;


import com.sistema.academico.dtos.ParticipanteDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "participante")
@NoArgsConstructor
@AllArgsConstructor
public class ParticipanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter
    @Setter
    private String nome;
    private String email;


    @ManyToMany(mappedBy = "participantes")
    private List<AtividadeModel> atividades;

    public ParticipanteModel(ParticipanteDto dto) {
        this.nome = dto.nome();
        this.email = dto.email();
    }
}
