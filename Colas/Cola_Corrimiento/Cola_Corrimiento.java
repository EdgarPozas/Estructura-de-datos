/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Cola_Corrimiento extends Cola_Simple{
    
    public Cola_Corrimiento(int tam) {
        super(tam);
    }
    
    @Override
    public boolean encolar(Object dato){
        if(esta_llena()){
            if(corrimiento()){
                return super.encolar(dato);
            }
            return false;
        }
        return super.encolar(dato);
    }
    
    private boolean corrimiento(){
        if(INI==0){
            return false;
        }
        int t1=0;
        for (int t2=INI; t2 <= FIN; t1++,t2++) {
            vector[t1]=vector[t2];
        }
        INI=0;
        FIN=t1-1;
        return true;
    }
}
