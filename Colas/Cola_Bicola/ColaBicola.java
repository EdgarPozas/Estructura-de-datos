/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class ColaBicola extends Cola_Simple{
    
    public ColaBicola(int tam) {
        super(tam);
    }
    
    public boolean encolarINI(Object dato){
        if(INI==0)return false;
        if(INI==-1){
            INI=-1;
            FIN=0;
        }
        INI--;
        vector[INI]=dato;
        return true;
    }
    public boolean desencolarFIN(){
        if(esta_vacia())return false;
        if(INI==FIN){
            INI=FIN=-1;
            return true;
        }
        FIN--;
        return true;
    }
}
