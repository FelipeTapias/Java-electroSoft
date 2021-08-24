package Modelo;

/** Esta clase es donde se construyen los nodos para los sitios, estos
 * tiene sus respectivos atributos y los metodos get y set
 *
 * @author Felipe Tapias
 * @version 1.0
 */
public class Sitio {
    private String codigo;
    private String nombre;
    private String municipio;
    private String responsable;

    public Sitio(String codigo, String nombre, String municipio, String responsable) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.municipio = municipio;
        this.responsable = responsable;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
