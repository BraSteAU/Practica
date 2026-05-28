 import java.util.ArrayList;
import java.util.Scanner;

public class Menuprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al CarroItm");
            System.out.println("Que desea realizar");
            System.out.println("1) GESTIÓN DE CLIENTES");
            System.out.println("2) GESTIÓN DE VEHÍCULOS");
            System.out.println("3) GESTIÓN DE CONTRATOS DE RENTING");
            System.out.println("4) Exportar");
            System.out.println("5) Importar");
            System.out.println("6) Salir");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:                 
                    System.out.println("Gestion de clientes");
                    System.out.println("1) Registrar cliente");
                    System.out.println("2) Modificar cliente");
                    System.out.println("3) Eliminar cliente");
                    System.out.println("4) Buscar cliente");
                    System.out.println("5) Ver todos los clientes");
                    System.out.println("6) Regresar al menu principal");
                    int opcion = sc.nextInt();
                    ArrayList<Clientes> clientes = new ArrayList<>();
                    gestionClientes gc = new gestionClientes();
                    switch (opcion) {
                        case 1:
                            clientes = gc.resgistrClientes(sc);
                            break;
                        case 5:
                            gc.mostrarClientes(clientes);
                            break; 
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Pagina en mantenimieto");
                    break;
                case 3:
                    System.out.println("Pagina en mantenimieto");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimieto");
                    break;
                case 5:
                    System.out.println("Pagina en mantenimieto");
                    break;
                case 6:
                    System.out.println("hasta luego");
                    seguir = false;
                    break;

                default:
                    System.out.println("esa opción no es valida ");
                    break;
            }
        }
    }
}

