/**
 *
 * @author edgar
 */
public class NodoDoble {
    NodoArbolGeneral direccionHijo;
    NodoDoble ant,sig;

    public NodoDoble(NodoArbolGeneral direccionHijo) {
        this.direccionHijo = direccionHijo;
        ant=sig=null;
    }
    
    
}
