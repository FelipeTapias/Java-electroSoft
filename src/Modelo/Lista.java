package Modelo;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * Esta clase es donde se construye la lista para almacenar los sitios, estos
 * tiene sus respectivos atributos y los metodos get y set.
 *
 * @author Felipe Tapias
 * @version 1.1
 */
public class Lista extends Nodo {

    Nodo cab;

    public Lista() {
        super(null, null, null, null);
        cab = null;
    }

    public Lista(String codigo, String nombre, String municipio, String responsable) {
        super(codigo, nombre, municipio, responsable);
    }

    public void insertarAntes(Nodo dato) {
        try {
            if (cab == null) {//se valida si esta vacio
                cab = dato;
            } else {
                dato.setSig(cab);//se crea el enlace
                cab = dato;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Listar() {
        try {
            Nodo tmp = cab;
            if (!esVacia()) {
                while (tmp != null) {

                    JOptionPane.showMessageDialog(null,
                        "Código: " + tmp.getCodigo() + "\n"
                        + "Nombre completo: " + tmp.getNombre() + "\n"
                        + "Municipio: " + tmp.getMunicipio() + "\n"
                        + "Responsable: " + tmp.getResponsable(), "Lista de sitios", JOptionPane.DEFAULT_OPTION);
                    tmp = tmp.getSig();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay datos para listar");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public boolean esVacia() {
        return (cab == null);
    }

    public void eliminarlista() {
        try {
            if (!esVacia()) {
                cab.setSig(null);
                cab = null;
                JOptionPane.showMessageDialog(null, "Lista eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "No hay datos para eliminar");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
