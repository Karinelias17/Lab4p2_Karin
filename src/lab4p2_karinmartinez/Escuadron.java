
package lab4p2_karinmartinez;

import java.util.ArrayList;

public class Escuadron {
    //Atributos
    public String nombre;
    public ArrayList <Soldados> soldados =new ArrayList();
    public Zonas zona;
    //Constructores
    public Escuadron(){
    }

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Escuadron(String nombre, ArrayList <Soldados> soldado, Zonas zona) {
        this.nombre = nombre;
        this.soldados=soldados;
        this.zona = zona;
    }
    //mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Soldados> getSoldado() {
        return soldados;
    }

    public void setSoldado(ArrayList <Soldados> soldado) {
        this.soldados = soldado;
    }

    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }
    
    //metodos de ADM

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + '}';
    }
    
}
