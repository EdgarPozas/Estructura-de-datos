import java.util.Arrays;

/**
 *
 * @author edgar
 */
public class ArbolGeneral {
    NodoArbolGeneral raiz;

    public ArbolGeneral(){
        raiz=null;
    }
    
    public boolean insertar(String ruta,Object v){
        if(raiz==null){
            raiz=new NodoArbolGeneral(v);
            if(raiz==null)return false;
            return true;
        }
        NodoArbolGeneral padre=buscarNodo(ruta);
        if(padre==null){
            return false;
        }
        if(padre.buscarNodo(v.toString())!=null){
            return false;
        }
        NodoArbolGeneral hijo=new NodoArbolGeneral(v);
        if(hijo==null)return false;
        
        return padre.enlazarHijo(hijo);
    }
    public boolean eliminar(String ruta){
        if(raiz==null)return false;
        NodoArbolGeneral hijo=buscarNodo(ruta);
        if(hijo==null)return false;
        if(raiz==hijo){
            if(raiz.esHoja()){
               raiz=null;
               return true;
            }
            return false;
        }
        ruta=ruta.substring(0, ruta.lastIndexOf("/"));
        NodoArbolGeneral papa=buscarNodo(ruta);
        if(papa==null)return false;
        if(!hijo.esHoja()){
            return false;
        }
        return papa.desenlazarHijo(hijo);
    }
    public NodoArbolGeneral buscarNodo(String ruta){
        ruta=(ruta.startsWith("/"))?ruta.substring(1):ruta;
        
        String[] rutas=ruta.split("/");
        return buscarNodo_(raiz,rutas);
    }
    private NodoArbolGeneral buscarNodo_(NodoArbolGeneral padre,String[] rutas){
        if(padre.valor.equals(rutas[0])){
            if(rutas.length==1){
                return padre;
            }
            NodoArbolGeneral nodo=padre.buscarNodo(rutas[0]);
            return (nodo==null) ?null:buscarNodo_(nodo,Arrays.copyOfRange(rutas, 1, rutas.length));
        }
        return null;
    }
}
