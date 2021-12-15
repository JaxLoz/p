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
public class ListaGenericaMain <T> {
    
    private TNodo <T> Cabeza;

    
public ListaGenericaMain (){
    
    Cabeza = null;
}

public void setCabeza (TNodo <T> cab){
    this.Cabeza = cab;
}

public TNodo <T> getCabeza (){
    return this.Cabeza;
}

public TNodo <T> Ultimo (){
   
    TNodo Temp;
    Temp = this.Cabeza;
    
    while (Temp != null){
        
        if(Temp.getSiguiente() == null){
            
            break;
        }else{
            
            Temp = Temp.getSiguiente();
        }
    }
    
    return Temp;
}
}
