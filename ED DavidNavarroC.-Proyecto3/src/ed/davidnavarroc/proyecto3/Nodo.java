package ed.davidnavarroc.proyecto3;

public class Nodo {
    int id; 
    String descripcion;
    String categoria;
    Nodo nodoIzquierdo;
    Nodo nodoDerecho;

    public Nodo(int id, String descripcion, String categoria, Nodo nodoIzquierdo, Nodo nodoDerecho) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
