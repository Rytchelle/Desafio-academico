package com.sistema.academico.models;

import com.sistema.academico.dtos.AtividadeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "Atividade")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AtividadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String descricao;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    @ManyToOne
    @JoinColumn(name = "bloco_id")
    private BlocoModel bloco;

    @ManyToMany
    @JoinTable(name = "participante_atividade",
            joinColumns = @JoinColumn(name = "atividade_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id"))
    private List<ParticipanteModel> participantes;

    public AtividadeModel(AtividadeDto dto) {
        this.nome = dto.nome();
        this.descricao = dto.descricao();
        this.preco = dto.preco();
    }
}
