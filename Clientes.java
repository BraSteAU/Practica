public class Clientes {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;
    private String LicenciaConduccion;
   

    public Clientes(String Cedula, String Nombre, String Apellido, String Telefono, String Direccion, String LicenciaConduccion) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.LicenciaConduccion = LicenciaConduccion;
       
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getLicenciaConduccion() {
        return LicenciaConduccion;
    }

    public void setLicenciaConduccion(String LicenciaConduccion) {
        this.LicenciaConduccion = LicenciaConduccion;
    }

}
