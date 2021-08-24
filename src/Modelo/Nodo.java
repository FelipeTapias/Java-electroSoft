package Modelo;

/**
 *
 * @author FelipeTapias
 */
public class Nodo extends Sitio {
    private Nodo sig;
    
    public Nodo(String codigo, String nombre, String municipio, String responsable) {
        super(codigo, nombre, municipio, responsable);
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
