public class Clientes {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private String Direccion;
    private String LicenciaConduccion;
   

    
    


    public Clientes(String cedula, String nombre, String apellido, int telefono, String direccion,
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
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

    

}
