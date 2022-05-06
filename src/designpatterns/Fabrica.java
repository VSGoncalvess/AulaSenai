package designpatterns;
public class Fabrica {
    public Transporte getFabrica(int modal){
        if (modal == 1){//transporte barco
            return new Barco();
        }
        else if(modal ==2){//transporte caminhão
            return new Caminhao();
        }
        else{
            return null;
        }
    }
    
}
