package ed.davidnavarroc.proyecto3;

public class Nodo {
   
    Tarjeta tarjeta;
    Nodo nodoIzquierdo;
    Nodo nodoDerecho;

    public Nodo(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Nodo getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    
}
