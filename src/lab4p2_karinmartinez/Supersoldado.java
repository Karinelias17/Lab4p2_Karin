
package lab4p2_karinmartinez;

public class Supersoldado extends Soldados{
    private Armas arma1 =new Armablanca();
    private Armas arma2 =new Bomba();
    private Armas arma3 =new Escopeta();
    private Armas arma4 =new Lanzallamas();
    
    public Supersoldado() {
        super();
    }

    public Supersoldado(Armablanca arma1,Bomba arma2, Escopeta arma3,Lanzallamas arma4, String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.arma1 = arma1;
        this.arma2 = arma2;
        this.arma3 = arma3;
        this.arma4 = arma4;
    }

    public Armas getArma1() {
        return arma1;
    }

    public void setArma1(Armas arma1) {
        this.arma1 = arma1;
    }

    public Armas getArma2() {
        return arma2;
    }

    public void setArma2(Armas arma2) {
        this.arma2 = arma2;
    }

    public Armas getArma3() {
        return arma3;
    }

    public void setArma3(Armas arma3) {
        this.arma3 = arma3;
    }

    public Armas getArma4() {
        return arma4;
    }

    public void setArma4(Armas arma4) {
        this.arma4 = arma4;
    }

    @Override
    public String toString() {
        return "Supersoldado{" + "arma1=" + arma1 + ", arma2=" + arma2 + ", arma3=" + arma3 + ", arma4=" + arma4 + '}';
    }

    
}
