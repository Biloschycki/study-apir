package br.com.fiap.study_apir.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.study_apir.model.Produto;
@Service
public class RepositoryProdutoMockup {
    private List<Produto> produtos = new ArrayList<>();
    private long ID = 0L;


    
    public RepositoryProdutoMockup() {
        produtos.add(new Produto(ID++, "Maçã", BigDecimal.valueOf(15.25) ));
        produtos.add(new Produto(ID++, "Uva", BigDecimal.valueOf(10.50)));

    }

    public List<Produto> findAll(){
        return produtos;
    }

    public Optional<Produto> findById(Long id){
       return produtos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public boolean deleteById(Long id){
        return produtos.removeIf(p -> p.getId().equals(id));
    }
    public Produto create(Produto produto){
        //gerar o id e atribuir ao produto a ser cadastrado, salvar no banco de dados e retornar o produto novo, fluxo de qualquer entidade
        produto.setId(ID++);
        produtos.add(produto);

        return produto;
    }
    public boolean update(Long id, Produto produto){
        Optional<Produto>optProduto = this.findById(id);
        if(optProduto.isPresent()){
            Produto produtoAtual = optProduto.get();
            produtoAtual.setNome(produto.getNome());
            produtoAtual.setValor(produto.getValor());
            return true;
        }
        return false;
    }
}
