/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Aluno
 */
public class Barco implements Transporte {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void entregar(){
        
        System.out.println("Entrega feita via barco");
    }
    @Override
    public void abastecer(){
        System.out.println("Abastecendo um barco");
    }
    
}
