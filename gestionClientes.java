
import java.util.ArrayList;
import java.util.Scanner;

public class gestionClientes {
    public ArrayList<Clientes> resgistrClientes(Scanner sc){
        ArrayList<Clientes> clientes = new ArrayList<>();
        boolean condicion = true;
        while (condicion) {
            Clientes c = new Clientes();
            System.out.println("Ingrese cedula del cliente: ");
            c.setCedula(sc.next());
            System.out.println("Ingrese nombre del cliente: ");
            c.setNombre(sc.next());
            System.out.println("Ingrese apellido del cliente: ");
            c.setApellido(sc.next());
            System.out.println("Ingrese telefono del cliente: ");
            c.setTelefono(sc.nextInt());
            System.out.println("Ingrese direccion del cliente: ");
            c.setDireccion(sc.next());
            clientes.add(c);
            System.out.println("Desea ingresar mas clinetes: 1)Si\n2)No");
            int opt = sc.nextInt();
            if (opt == 2) {
                condicion = false;
            }
        }
        return clientes;
    }
}
