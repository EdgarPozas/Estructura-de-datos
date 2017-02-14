/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Cola_Circular extends Cola_Simple {
    
    public Cola_Circular(int tam) {
        super(tam);
    }
    
    private boolean enModoCircular(){
        return INI>FIN;
    }
    
    public boolean encolar(Object dato){
        if(FIN+1==INI){
            return false;
        }
        if(esta_llena()){
            if(!(INI>0)){
                return false;
            }
            FIN=-1;
        }
        return super.encolar(dato);
    }
    
    public boolean desencolar(){
        if(enModoCircular()){
            if(INI==vector.length-1){
                INI=0;
                return true;
            }
        }
        return super.desencolar();
    }
    public Object[] mostrar(){
        if(!enModoCircular()){
            return super.mostrar();
        }
        int primerciclo=vector.length-INI;
        Object[] aux=new Object[primerciclo+FIN];
        for (int i = INI; i < vector.length; i++) {
            aux[i]=vector[i];
        }
        for (int i = 0; i <=FIN ; i++) {
            aux[primerciclo+1]=vector[i];
        }
        return aux;
    }
    
}
