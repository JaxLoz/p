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

public void Agregar (TNodo <T> nod){
    
    if (Cabeza == null){
        
        Cabeza = nod;
        
    }else{
        
        Ultimo().setSiguiente(nod);
    }
    
    nod.setSiguiente(null);
}

public void Insertar (TNodo <T> nod){
    
    if (Cabeza == null){
        
        Cabeza = nod;
        nod.setSiguiente(null);
    }else{
        
        nod.setSiguiente(Cabeza);
        Cabeza = nod;
    }
}
    
public TNodo<T> Anterior (TNodo<T> nod){
    
    TNodo<T> Ant;
    TNodo<T> Temp;
    Ant = null;
    Temp = Cabeza;
    
    while (Temp != null){
        
        if (Temp.getSiguiente() == nod){
            
            Ant = Temp;
            break;
        }else{
            
            Temp = Temp.getSiguiente();
        }
    }
    
    return Ant;
}

public void Eliminar (TNodo <T> nod){
    
    TNodo<T> Ant;
    
    if(Cabeza == nod){
        
        Cabeza=Cabeza.getSiguiente();
    }else{
        Ant = Anterior(nod);
        Ant.setSiguiente(nod.getSiguiente());
    }
    
    nod.setSiguiente(null);
}

public TNodo<T> NodoPos (int Pos){
    
    int p;
    TNodo<T> Nod;
    p = 0;
    Nod = Cabeza;
    
    while (Nod != null){
        
        if (p == Pos){
            
            break;
        }else{
            
            p++;
            Nod = Nod.getSiguiente();
        }
    }
      return Nod;
}

public void LimipiarLista(){
    
    while (Cabeza != null){
        
        Eliminar(Cabeza);
    }
}

public int ContarNodos (){
    
    int cant; 
    TNodo temp;
    cant = 0;
    temp = Cabeza;
    
    while (temp != null){
        
        cant++;
        temp=temp.getSiguiente();
    }
    
    return cant;
}
}


