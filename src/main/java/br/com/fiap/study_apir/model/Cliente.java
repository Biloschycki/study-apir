package br.com.fiap.study_apir.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Data
@Entity
public class Cliente {
@Id
private long id;
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
