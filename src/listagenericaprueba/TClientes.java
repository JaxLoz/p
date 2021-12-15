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
public class TClientes {
    
    private String Nombre;
    private String Apellido;
    private String cedula;
    private String Telefono;
    private String Correo;
    
public TClientes (){
    
    this.Nombre = "";
    this.Apellido = "";
    this.cedula = "";
    this.Telefono = "";
    this.Correo = "";
}

public void setNombre (String nom){
    this.Nombre = nom;
}

public void setApellido (String ape){
    this.Apellido = ape;
}

public void setcedula (String cd){
    this.cedula = cd;
}
 public void setTelefono (String tel){
     this.Telefono = tel;
 }
 
 public void setcorreo (String cor){
     this.Correo = cor;
 }
 
 public String getNombre (){
     return this.Nombre;
 } 
 
 public String getApellido (){
     return this.Apellido;
 }
 
 public String getcedula (){
     return this.cedula;
 }
 
 public String getTelefono (){
     return this.Telefono;
 }
 
 public String getcorreo (){
     return this.Correo;
 }
    
}
