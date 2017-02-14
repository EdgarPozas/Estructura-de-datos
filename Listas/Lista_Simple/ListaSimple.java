/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class ListaSimple {
    private Nodo Cabecera,Final;
    
    public ListaSimple(){
        Cabecera=Final=null;
    }
    
    public boolean insertar(Object valor){
        //Creacion nodo
        Nodo temp=new Nodo(valor);
        if(temp==null)return false;
        //enlace
        if(estaVacio()){
            Cabecera=Final=temp;
            return true;
        }
        //Final.siguiente es crear el enlacea
        Final.siguiente=temp;
        //Final pasas el valor de la variable temporal
        Final=temp;
        
        return true;
    }
    
    public boolean borrar(){
        if(estaVacio()){
            return false;
        }
        if(unSoloElemento()){
            Cabecera=Final=null;
            return true;
        }
        Nodo temp=Cabecera;
        Cabecera=temp.siguiente;
        temp.siguiente=null;
        temp=null;
        return true;
    }
    
    public boolean borrar(Object dato){
        if(estaVacio()) return false;
        Nodo temp=Cabecera;
        
        do{
            if(temp.valor.equals(dato)){
                return true;
            }
        }while(temp.siguiente!=null);
        
        return false;
    }
    
    private boolean unSoloElemento(){
        return Cabecera==Final;
    }
    
    private boolean estaVacio(){
       return Cabecera==null && Final==null;
    }
    
}
