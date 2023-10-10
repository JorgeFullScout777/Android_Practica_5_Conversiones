package Models;

public class Celsius extends Grados {

    public Celsius parse(Kelvin K){

        Celsius C = new Celsius();
        C.setValor(K.getValor() - 273.15);
        return  C;
    }
}
