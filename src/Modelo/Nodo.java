package Modelo;

/** Esta clase es donde se construyen los nodos para los sitios, estos
 * tiene sus respectivos atributos y los metodos get y set
 *
 * @author Felipe Tapias
 * @version 1.1 
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
