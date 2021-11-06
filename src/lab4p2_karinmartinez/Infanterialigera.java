
package lab4p2_karinmartinez;


public class Infanterialigera extends Soldados {
    private Armas arma =new Armablanca();

    public Infanterialigera() {
        super();
    }

    public Infanterialigera(String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Infanterialigera{" + "arma=" + arma + '}';
    }
    
}
