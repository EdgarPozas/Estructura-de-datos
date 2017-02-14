/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class NodoPrioridad {
    public Object valor;
    public int prioridad;
    public NodoPrioridad sig,ant;

    public NodoPrioridad(Object valor, int prioridad) {
        this.valor = valor;
        this.prioridad = prioridad;
    }
}
