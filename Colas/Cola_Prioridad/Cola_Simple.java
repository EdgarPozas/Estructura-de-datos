/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Cola_Simple {
    protected int INI,FIN;
    protected Object[] vector;
    
    public Cola_Simple(int tam){
        vector=new Object[tam];
        INI=-1;
        FIN=-1;
    }
    public boolean encolar(Object dato){
        if(esta_llena()) return false;
        FIN++;
        if(insertarPrimerElemento()) INI=FIN;
        vector[FIN]=dato;
        return true;
    }
    public boolean desencolar(){
        if(esta_vacia()) return false;
        INI++;
        if(INI==FIN){ 
            INI=FIN=-1;
        }
        return true;
    }
    protected boolean esta_llena(){
        return FIN==vector.length-1;
    }
    protected boolean esta_vacia(){
        return INI==-1 && FIN==-1;
    }
    protected boolean insertarPrimerElemento(){
        return INI==-1;
    }
    public Object[] mostrar(){
        //for int i;i<<
        if(esta_vacia()) return null;
        Object[] aux=new Object[FIN-INI+1];
        for (int i = INI; i <=FIN; i++) {
            aux[i-INI]=vector[i];
        }
        return aux;
    }
}
