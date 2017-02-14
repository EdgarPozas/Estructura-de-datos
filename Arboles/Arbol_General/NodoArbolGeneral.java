import java.util.Arrays;

/**
 *
 * @author edgar
 */

//Lista
public class NodoArbolGeneral {
    Object valor;
    NodoDoble Cabecera,Final;
    
    public NodoArbolGeneral(Object valor){
        this.valor=valor;
        Cabecera=Final=null;
    }
    public boolean enlazarHijo(NodoArbolGeneral hijo){
        NodoDoble temp=new NodoDoble(hijo);
        if(temp==null)
            return false;
        if(Cabecera==null&&Final==null){
            Cabecera=Final=temp;
            return true;
        }
        Final.sig=temp;
        temp.ant=temp;
        Final=temp;
        return true;
    }
    public NodoArbolGeneral buscarNodo(String dato){
        for(NodoDoble nodo=Cabecera;nodo!=null;nodo=nodo.sig){
            if(nodo.direccionHijo.valor.equals(dato)){
                return nodo.direccionHijo;
            }
        }
        return null;
    }
    public boolean esHoja(){
        return Cabecera==null&&Final==null;
    }
    public boolean desenlazarHijo(NodoArbolGeneral hijo){
        if(Cabecera.direccionHijo==hijo){
            if(Cabecera==Final){
                Cabecera.direccionHijo=null;
                Cabecera=Final=null;
                return true;
            }
            NodoDoble temp=Cabecera;
            Cabecera=Cabecera.sig;
            temp.direccionHijo=null;
            temp.sig=null;
            temp.ant=null;
            return true;
        }
        if(Final.direccionHijo==hijo){
            NodoDoble temp=Final;
            Final=Final.ant;
            temp.direccionHijo=null;
            temp.sig=null;
            temp.ant=null;
            return true;
        }
        for(NodoDoble nodo=Cabecera;nodo!=null;nodo=nodo.sig){
            if(nodo.direccionHijo==hijo){
                nodo.direccionHijo=null;
                nodo.ant.sig=nodo.sig;
                nodo.sig.ant=nodo.ant;
                nodo.sig=nodo.ant=null;
                return true;
            }
        }
       
        return false;
    }
}
