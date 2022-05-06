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
public class Caminhao implements Transporte {
    public int chassi;

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }
    public void entregar(){
        System.out.println("Entrega feita via caminhão");
    }
    @Override
    public void abastecer(){
        System.out.println("Abastecendo um caminhão");
    }
}
