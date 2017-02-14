/**
 *
 * @author edgar
 */
public class ColaQueTuImplementes extends ColaSimpleConPrioridad {
    public ColaQueTuImplementes(int tam) {
        super(tam);
    }
    
    public boolean encolar(Object dato){
        if(esta_llena()){
            if(corrimiento()){
                return super.encolar((Prioridad) dato);
            }
            return false;
        }
        return super.encolar((Prioridad)dato);
    }
    
    private boolean corrimiento(){
        if(INI==0){
            return false;
        }
        int t1=0;
        for (int t2=INI; t2 <= FIN; t1++,t2++) {
            vector[t1]=vector[t2];
        }
        INI=0;
        FIN=t1-1;
        return true;
    }
}
