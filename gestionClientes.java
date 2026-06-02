
import java.util.ArrayList;
import java.util.Scanner;

public class gestionClientes {
    
    Validaciones v = new Validaciones();
    ArrayList<Clientes> clientes = new ArrayList<>();
    public ArrayList<Clientes> registrarClientes(Scanner sc){
        Clientes c = new Clientes();
        System.out.println("Ingrese cedula del cliente: ");
        c.setCedula(v.validarNumeros(sc));
        System.out.println("Ingrese nombre del cliente: ");
        c.setNombre(v.validarTexto(sc));
        System.out.println("Ingrese apellido del cliente: ");
        c.setApellido(v.validarTexto(sc));
        System.out.println("Ingrese telefono del cliente: ");
        c.setTelefono(v.validarNumeros(sc));
        System.out.println("Ingrese direccion del cliente: ");
        sc.nextLine();
        c.setDireccion(v.validarDireccion(sc));
        clientes.add(c);
            
        return clientes;
    }

    public ArrayList<Clientes> modificarClientes(ArrayList<Clientes> clientes, Scanner sc){
        String cedula = "";
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return clientes;
        }
        System.out.println("Ingrese la cedula del cliente a modificar: ");
        cedula = v.validarNumeros(sc);
        for(Clientes c : clientes){
            if(c.getCedula().equals(cedula)){
                System.out.println("Ingrese el nuevo Nombre: ");
                c.setNombre(v.validarTexto(sc));
                System.out.println("Ingrese el nuevo Apellido: ");
                c.setApellido(v.validarTexto(sc));
                System.out.println("Ingrese el nuevo Telefono: ");
                c.setTelefono(v.validarNumeros(sc));
                System.out.println("Ingrese la nueva Direccion: ");
                sc.nextLine();
                c.setDireccion(v.validarDireccion(sc));
                System.out.println("Cliente modificado correctamente");
                return clientes;
            }
        }
        System.out.println("Cliente no encontrado");
        return clientes;
    }

    public ArrayList<Clientes> eliminarClientes(ArrayList<Clientes> clientes,Scanner sc){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return clientes;
        }
        String cedula = "";
        System.out.println("Ingrese la cedula del cliente a eliminar: ");
        cedula = v.validarNumeros(sc);
        for(Clientes c : clientes){
            if(c.getCedula().equals(cedula)){
                clientes.remove(c);
                System.out.println("Cliente eliminado correctamente");
                return clientes;
            }
        }
        System.out.println("Cliente no encontrado");
        return clientes;
    }

    public ArrayList<Clientes> buscarClientes(ArrayList<Clientes> clientes, Scanner sc){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return clientes;
        }
        String cedula = "";
        System.out.println("Ingrese la cedula del cliente a buscar: ");
        cedula = v.validarNumeros(sc);
        for(Clientes c : clientes){
            if(c.getCedula().equals(cedula)){
                return clientes;
            }
        }
        return null;
    }

    public void mostrarClientes(ArrayList<Clientes> clientes){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        for(Clientes c : clientes){
            System.out.println(c);
        }
    }
}
