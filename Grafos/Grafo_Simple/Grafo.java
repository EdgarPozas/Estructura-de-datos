package Grafos;

/**
 *
 * @author edgar
 */
public class Grafo {
    private NodoGrafo cab,fin;

    public Grafo(){
        cab=fin=null;
    }
    
    public boolean insertarNodo(Object o){
        if(buscarNodo(o)!=null){
            return false;
        }
        NodoGrafo t=new NodoGrafo(o);
        if(null==t) return false;
        if(grafoVacio()){
            cab=fin=t;
            return true;
        }
        fin.sig=t;
        t.ant=fin;
        fin=t;
        return true;
    }
    public NodoGrafo buscarNodo(Object o){
        if(grafoVacio()){
            return null;
        }
        if(cab.valor.equals(o)){
            return cab;
        }
        if(fin.valor.equals(o)){
            return fin;
        }
        for (NodoGrafo i = cab; i!=null; i=i.sig) {
            if(i.valor.equals(o)){
                return i;
            }
        }
        return null;
    }
    private boolean grafoVacio(){
        return cab==null &&fin==null;
    }
    public boolean crearArista(Object origen,Object destino){
        if(grafoVacio()){
            return false;
        }
        NodoGrafo NodoOrigen=buscarNodo(origen);
        NodoGrafo NodoDestino=buscarNodo(destino);
        if(NodoOrigen==null||NodoDestino==null){
            return false;
        }
        return NodoOrigen.crearAristaNodo(NodoDestino);
    }
    public boolean eliminarArista(Object origen,Object destino){
        if(grafoVacio())return false;
        
        NodoGrafo NodoOrigen=buscarNodo(origen);
        NodoGrafo NodoDestino=buscarNodo(destino);
        
        if(NodoOrigen==null&&NodoDestino==null){
            return false;
        }
        
        return NodoOrigen.eliminarAristaNodo(NodoDestino);
    }
    
    public boolean eliminarNodo(Object nodo){
        if(grafoVacio())return false;
        
        NodoGrafo origen=buscarNodo(nodo);
        if(origen==null)return false;
        
        if(!origen.eliminarTodaAristaNodo())
            return false;
        
        for (NodoGrafo i = cab; i !=null;i=i.sig) {
            if(!i.eliminarAristaNodo(origen))
                return false;
        }
        return true;
        
    }
}
