/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matematica;

/**
 *
 * @author Anonimo
 */
public class Entero {
    int numero;

    public Entero() {
        this.numero=0;
        
    }
    public Entero Sumar(Entero obj){
        Entero o= new Entero();
        o.numero= this.numero+ obj.numero;
        return o;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
