package com.sistema.academico.models;

import com.sistema.academico.dtos.BlocoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Bloco")
@NoArgsConstructor
@AllArgsConstructor
public class BlocoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Getter
    @Setter
    private Instant inicio;
    private Instant fim;

    public BlocoModel(BlocoDto dto) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @OneToMany(mappedBy = "bloco")
    private List<AtividadeModel> atividades;
}
