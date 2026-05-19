

public class camionetaSUV extends Vehiculo {
    private String tipoTraccion; //4x2 4x4
    private int capacidadPasajeros; //litros

    public camionetaSUV() {
        super();
    }

    public camionetaSUV(String tipoTraccion, int capacidadPasajeros) {
        this.tipoTraccion = tipoTraccion;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }
    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
}
