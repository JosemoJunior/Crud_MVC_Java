/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josemojr
 */
public class Fornecedor {
    private String nome;
    private String cnpj;
    private int idFornecedor;
    
    public Fornecedor () {
        
    }
    
    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Fornecedor(String nome, String cnpj, int idFornecedor) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", cnpj=" + cnpj + ", idFornecedor=" + idFornecedor + '}';
    }
    
    
    
}
