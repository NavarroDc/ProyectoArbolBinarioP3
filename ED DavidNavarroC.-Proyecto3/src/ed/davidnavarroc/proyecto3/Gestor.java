package ed.davidnavarroc.proyecto3;

import javax.swing.JOptionPane;

public class Gestor {
    
    private Nodo nodoRaiz;

    public Gestor() {
        this.nodoRaiz = null;
    }

    public Gestor(Nodo nodoRaiz) {
        this.nodoRaiz = nodoRaiz;
    }
    
    public boolean tarjetaInsertada(Tarjeta tarjeta){
        if(buscarTarjetaID(tarjeta.getId()) != null){
            return false; //Significa que ya existe el ID
        }
        
        nodoRaiz = insertarDatos(nodoRaiz, tarjeta);
        return true;
    }
    
    public Nodo insertarDatos(Nodo nodoActual, Tarjeta tarjeta){
        if(nodoActual == null){
        return new Nodo(tarjeta);
        }
        
        if(tarjeta.getId() < nodoActual.tarjeta.getId()){
            nodoActual.nodoIzquierdo = insertarDatos(nodoActual.nodoIzquierdo, tarjeta);
        }else{
            nodoActual.nodoDerecho = insertarDatos(nodoActual.nodoDerecho, tarjeta);
        }
        return nodoActual;
    }
    
    public Tarjeta buscarTarjetaID(int id){
        
        return buscarDatosTarjeta(nodoRaiz, id);
    }
    
    private Tarjeta buscarDatosTarjeta(Nodo nodoActual, int id){
        if(nodoActual==null){
            return null;
        }
        
        if(id == nodoActual.tarjeta.getId()){
            return nodoActual.tarjeta;
        }
        
        if(id < nodoActual.tarjeta.getId()){
            return buscarDatosTarjeta(nodoActual.nodoIzquierdo, id);
        }else{
            return buscarDatosTarjeta(nodoActual.nodoDerecho, id);
        }
    }
    
    private void imprimirInOrden(Nodo nodo){
        if (nodo != null){
            imprimirInOrden(nodo.nodoIzquierdo);
            System.out.println("ID: " + nodo.tarjeta.getId() + 
            " | Descripción: " + nodo.tarjeta.getDescripcion()
            + " | Categoria: " + nodo.tarjeta.getCategoria()) ;
            imprimirInOrden(nodo.nodoDerecho);
        }
    }
    
    public void mostrarDatosConsola(){
        imprimirInOrden(nodoRaiz);
    }
}
