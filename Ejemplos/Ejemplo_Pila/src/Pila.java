
public class Pila{

    private Object[] datos;
    private int tope;

    public Pila(int tam){
        datos=new Object[tam];
        tope=-1;
    }
    public boolean apilar(Object dato){
        if(esta_lleno()) return false;
        datos[++tope]=dato;
        return true;
    }
    public boolean retirar(){
        if(esta_vacio()) return false;
        tope--;
        return true;
    }
    public Object[] mostrar_elementos_validos(){
        if(esta_vacio()) return null;
        Object[] aux=new Object[tope+1];
        for (int i=0;i<tope+1;i++ ) {
            aux[i]=datos[i];
        }
        return aux;
    }
    public int cantidad_datos(){
        return tope+1;
    }
    private boolean esta_vacio(){
        return tope==-1;
    }
    private boolean esta_lleno(){
        return tope==datos.length-1;
    }
}