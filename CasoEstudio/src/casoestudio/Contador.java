/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio;

/**
 *
 * @author sebas
 */
public class Contador {
    private int puntos;
    
    public Contador(){
        this.puntos= 0;
    }
public void agregarPuntos(int cantidad){
    if (cantidad > 0){
        this.puntos += cantidad;
    }
}
public int obtenerPuntos(){
   return this.puntos;
}
public void restablacerPuntos(){
    this.puntos= 0;
}
@Override
public String toString(){
    return "Puntos: " + this.puntos;
}
}
