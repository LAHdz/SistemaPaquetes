package sistemapaquetes.model;

/**
 *
 * @author asael
 */
public class PuntoControl {
    private int numero;
    private String nombre;
    private int idRuta;
    private int limitePaquetes;
    private String DPIOperador;
    private float tarifaOperacion;
    private float tarifaOperacionGlobal;

    public PuntoControl() {
    }

    public PuntoControl(int numero, String nombre, int idRuta, int limitePaquetes, String DPIOperador, float tarifaOperacion, float tarifaOperacionGlobal) {
        this.numero = numero;
        this.nombre = nombre;
        this.idRuta = idRuta;
        this.limitePaquetes = limitePaquetes;
        this.DPIOperador = DPIOperador;
        this.tarifaOperacion = tarifaOperacion;
        this.tarifaOperacionGlobal = tarifaOperacionGlobal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getLimitePaquetes() {
        return limitePaquetes;
    }

    public void setLimitePaquetes(int limitePaquetes) {
        this.limitePaquetes = limitePaquetes;
    }

    public String getDPIOperador() {
        return DPIOperador;
    }

    public void setIdOperador(String DPIOperador) {
        this.DPIOperador = DPIOperador;
    }

    public float getTarifaOperacion() {
        return tarifaOperacion;
    }

    public void setTarifaOperacion(float tarifaOperacion) {
        this.tarifaOperacion = tarifaOperacion;
    }

    public float getTarifaOperacionGlobal() {
        return tarifaOperacionGlobal;
    }

    public void setTarifaOperacionGlobal(float tarifaOperacionGlobal) {
        this.tarifaOperacionGlobal = tarifaOperacionGlobal;
    }
}