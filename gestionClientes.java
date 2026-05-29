
import java.util.ArrayList;
import java.util.Scanner;

public class gestionClientes {
    
    public ArrayList<Clientes> registrarClientes(Scanner sc){
        ArrayList<Clientes> clientes = new ArrayList<>();
            Clientes c = new Clientes();
            System.out.println("Ingrese cedula del cliente: ");
            c.setCedula(sc.next());
            System.out.println("Ingrese nombre del cliente: ");
            c.setNombre(sc.next());
            System.out.println("Ingrese apellido del cliente: ");
            c.setApellido(sc.next());
            System.out.println("Ingrese telefono del cliente: ");
            c.setTelefono(sc.next());
            System.out.println("Ingrese direccion del cliente: ");
            c.setDireccion(sc.next());
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
        cedula = sc.next();
        for(Clientes c : clientes){
            if(c.getCedula().equals(cedula)){
                System.out.println("Ingrese el nuevo Nombre: ");
                c.setNombre(sc.next());
                System.out.println("Ingrese el nuevo Apellido: ");
                c.setApellido(sc.next());
                System.out.println("Ingrese el nuevo Telefono: ");
                c.setTelefono(sc.next());
                System.out.println("Ingrese la nueva Direccion: ");
                c.setDireccion(sc.next());
                System.out.println("Cliente modificado correctamente");
            }
            return clientes;
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
        cedula = sc.next();
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
