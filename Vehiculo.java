package Practica;

public class Vehiculo {
    protected String Placa;
    protected String Marca;
    protected int Modelo;
    protected float precioDiario;
    protected String Estado; //Disponible / alquilado

    public Vehiculo(String placa, String marca, int modelo, float precioDiario, String estado) {
        Placa = placa;
        Marca = marca;
        Modelo = modelo;
        this.precioDiario = precioDiario;
        Estado = estado;
    }

    public Vehiculo() {
    }

    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int modelo) {
        Modelo = modelo;
    }
    public float getPrecioDiario() {
        return precioDiario;
    }
    public void setPrecioDiario(float precioDiario) {
        this.precioDiario = precioDiario;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }

    
}
