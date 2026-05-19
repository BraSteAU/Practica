

public class carroSedan extends Vehiculo {
    private String tipoCombustible;
    private String Transmision;
    

    public carroSedan() {
        super();
    }

    public carroSedan(String tipoCombustible, String transmision) {
        this.tipoCombustible = tipoCombustible;
        Transmision = transmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public String getTransmision() {
        return Transmision;
    }
    public void setTransmision(String transmision) {
        Transmision = transmision;
    }

    

}
