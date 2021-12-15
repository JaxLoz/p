/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listagenericaprueba;

/**
 *
 * @author Javier M
 */
public class TNodo <T> {
    
    private T Datos;
    private TNodo <T> siguiente;
                                                                                                                                                                                       
public <T> TNodo (){

    Datos = null;
    siguiente = null;
}

public void setDatos (T dat){
 
    this.Datos = dat;
}

public void setSiguiente (TNodo <T> sig){
    this.siguiente = sig;
}

public T getDatos (){
    return this.Datos;
}

public TNodo <T> getSiguiente (){
    return this.siguiente;
}
    
    
}
