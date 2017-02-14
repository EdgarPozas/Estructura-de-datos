package Grafos;

/**
 *
 * @author edgar
 */
public class NodoGrafo {
    public Object valor;
    public NodoGrafo ant,sig;
    public NodoArista cab,fin;
    
    public NodoGrafo(Object o){
        valor=o;
        ant=sig=null;
        cab=fin=null;
    }
    
    public boolean crearAristaNodo(NodoGrafo destino){
        for (NodoArista i = cab; i!=null; i=i.sig) {
            if(i.arista.equals(destino)){
                return false;
            }
        }
        NodoArista arista=new NodoArista(destino);
        if(arista==null)return false;
        
        if(cab==null&&fin==null){
            cab=fin=arista;
            return true;
        }
       
        fin.sig=arista;
        fin.sig.ant=fin;
        fin=arista;
        
        return true;
    }
    
    public boolean eliminarTodaAristaNodo(){
        for (NodoArista i = cab; i!=null; i=i.sig) {
           if(!eliminarAristaNodo(i.arista))
               return false;
        }
        return true;
    }
    
    public boolean eliminarAristaNodo(NodoGrafo destino){
        if(cab==null&&fin==null)return false;
        if(cab==fin){
            if(cab.arista.equals(destino)){
                cab=fin=null;
                return true;
            }
            return false;
        }
        NodoArista t;
        if(cab.arista.equals(destino)){
            t=cab;
            cab=t.sig;
            cab.ant=null;
            cab.sig=null;
            cab=null;
            return true;
        }
        
        if(fin.arista.equals(destino)){
            t=fin;
            fin=t.ant;
            fin.ant=null;
            fin.sig=null;
            fin=null;
            return true;
        }
        
        for (NodoArista i = cab; i!=null; i=i.sig) {
            if(i.arista.equals(destino)){
                i.ant.sig=i.sig;
                i.sig.ant=i.ant;
                i.sig=null;
                i.ant=null;
                return true;
            }
        }
        return false;
        
    }
}
