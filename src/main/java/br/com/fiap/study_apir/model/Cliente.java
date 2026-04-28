package br.com.fiap.study_apir.model;

import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Data
@Entity
@Table(name="clientes")
public class Cliente {
@Id
private long id;
@Column(name="nome_cliente", length = 100, columnDefinition = "char(70)", nullable = false)


private String nome;



public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}


}
