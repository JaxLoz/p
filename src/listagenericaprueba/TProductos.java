/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listagenericaprueba;

/**
 *
 * @author javier
 */
public class TProductos {
    
    private String Nombre;
    private int Precio;
    private int Cantidad;
    private String fecha;
    
    
public TProductos (){
    
    this.Nombre = "";
    this.Precio = 0;
    this.Cantidad = 0;
    this.fecha = "";
}

public void setNombre (String Nom){
    this.Nombre = Nom;
}

public void setPrecio (int pre){
    this.Precio = pre;
}

public void setCantidad (int can){
    this.Cantidad = can;
}

public void setFecha (String fec){
    this.fecha = fec;
}

public String getNombre (){
    return this.Nombre;
}

public int getPrecios (){
    return this.Precio;
}

public int getCantidad (){
    return this.Cantidad;
}

public String getFecha (){
    return this.fecha;
}
}
