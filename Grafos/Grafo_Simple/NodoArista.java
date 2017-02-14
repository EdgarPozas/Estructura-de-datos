package Grafos;

/**
 *
 * @author edgar
 */
public class NodoArista {
    public NodoGrafo arista;
    NodoArista ant,sig;

    public NodoArista(NodoGrafo arista) {
        this.arista = arista;
        ant=sig=null;
    }
    
    
    
}
