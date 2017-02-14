
public class ListaDoblePrioridad {
   private NodoPrioridad cab,fin;
    
    public ListaDoblePrioridad(){
        cab=fin=null;
    }
    
    public boolean insertar(Object dato,int prio){
        NodoPrioridad temp=new NodoPrioridad(dato,prio);
        if(temp==null) return false;
        if(esVacio()){
           cab=fin=temp;
           return true;
        }
        
        for(NodoPrioridad i=cab;i!=null;i=i.sig){
            if(i.prioridad==temp.prioridad){
                temp.ant=i.ant;
                temp.sig=i;
                i.ant.sig=temp;
                i.ant=temp;
                return true;
            }
        }
        return false;
    }
     public boolean eliminar(){
        if(esVacio()) return false;
        if(cab.equals(fin)){
            cab=fin=null;
            return true;
        }
        cab=cab.sig;
        cab.ant.sig=null;
        cab.ant.ant=null;
        cab.ant=null;
        return true;
    }
    private boolean esVacio(){
        return cab==null && fin==null;
    }
    private void ordenar(){
        
    }
}
