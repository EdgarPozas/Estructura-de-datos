/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Prioridad {
    private Object valor;
    private int prioridad;
    
    public Prioridad(Object val,int prio){
        valor=val;
        prioridad=prio;      
    }
    public void asignarPrioridad(int prio){
        if(prio<=0 || prio>3) prio=1;
        prioridad=prio;
    }
    public void asignarValor(Object val){
        valor=val;
    }
    public Object obtenerValor(){
        return valor;
    }
    public int obtenerPrioridad(){
        return prioridad;
    }
}
