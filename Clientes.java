public class Clientes {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Direccion;
    private String LicenciaConduccion;
   

    
    


    public Clientes(String cedula, String nombre, String apellido, String telefono, String direccion,
            String licenciaConduccion) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Direccion = direccion;
        LicenciaConduccion = licenciaConduccion;
    }



    public Clientes() {

    }



    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
        this.LicenciaConduccion = Cedula;
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

    @Override
    public String toString() {
        return "Cedula: " + Cedula +
           "\nNombre: " + Nombre +
           "\nApellido: " + Apellido +
           "\nTelefono: " + Telefono +
           "\nDireccion: " + Direccion +
           "\nLicencia: " + LicenciaConduccion +
           "\n---------------------------";
    }
    

}
