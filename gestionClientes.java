
import java.util.ArrayList;
import java.util.Scanner;

public class gestionClientes {
    
    public ArrayList<Clientes> registrarClientes(ArrayList<Clientes> clientes, Scanner sc){
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
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
        if(clientes == null || clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return clientes;
        }
        System.out.println("Ingrese la cedula del cliente a modificar: ");
        String cedula = sc.next();
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
                return clientes;
            }
        }
        System.out.println("Cliente no encontrado");
        return clientes;
    }

    public ArrayList<Clientes> eliminarClientes(ArrayList<Clientes> clientes, ArrayList<contratoRenting> contratos, Scanner sc){
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return clientes;
        }
        System.out.println("Ingrese la cedula del cliente a eliminar: ");
        String cedula = sc.next();
        for (int i = 0; i < clientes.size(); i++) {
            Clientes c = clientes.get(i);
            if(c.getCedula().equals(cedula)){
                clientes.remove(i);
                contratos.removeIf(ct -> String.valueOf(ct.getCedulaCliente()).equals(cedula));
                System.out.println("Cliente eliminado correctamente");
                System.out.println("Cualquier contrato asociado al cliente tambien fue eliminado.");
                return clientes;
            }
        }
        System.out.println("Cliente no encontrado");
        return clientes;
    }

    public void buscarClientes(ArrayList<Clientes> clientes, Scanner sc){
        if(clientes == null || clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.println("Ingrese la cedula del cliente a buscar: ");
        String cedula = sc.next();
        for(Clientes c : clientes){
            if(c.getCedula().equals(cedula)){
                System.out.println(c);
                return;
            }
        }
        System.out.println("Cliente no encontrado");
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
