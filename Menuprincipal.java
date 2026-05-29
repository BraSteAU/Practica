 import java.util.ArrayList;
import java.util.Scanner;

public class Menuprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Clientes> clientes = new ArrayList<>();
        gestionClientes gc = new gestionClientes();
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
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("Gestion de clientes");
                        System.out.println("1) Registrar cliente");
                        System.out.println("2) Modificar cliente");
                        System.out.println("3) Eliminar cliente");
                        System.out.println("4) Buscar cliente");
                        System.out.println("5) Ver todos los clientes");
                        System.out.println("6) Regresar al menu principal");
                        int opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                clientes = gc.registrarClientes(sc);
                                break;
                            case 2:
                                clientes = gc.modificarClientes(clientes, sc);
                                break;
                            case 3:
                                clientes = gc.eliminarClientes(clientes, sc);
                                break;
                            case 4:
                                clientes = gc.buscarClientes(clientes, sc);
                                if(clientes != null){
                                    System.out.println(clientes);
                                }
                                break;
                            case 5:
                                gc.mostrarClientes(clientes);
                                break; 
                            case 6:
                                submenu = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
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

