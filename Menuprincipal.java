 import java.util.ArrayList;
 import java.util.LinkedList;
import java.util.Scanner;

public class Menuprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Clientes> clientes = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        LinkedList<contratoRenting> contratoRenting = new LinkedList<>();
        Metodoscontratos gr = new Metodoscontratos();
        gestionClientes gc = new gestionClientes();
        GestionVehiculos gv = new GestionVehiculos();
      
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
            boolean submenu = true;
            int opt = sc.nextInt();
            switch (opt) {
                case 1:    
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
                    while (submenu) {
                        System.out.println("Gestion de vehiculos");
                        System.out.println("1) Registrar vehiculo");
                        System.out.println("2) Modificar vehiculo");
                        System.out.println("3) Eliminar vehiculo");
                        System.out.println("4) Buscar vehiculo");
                        System.out.println("5) Regresar al menu principal");
                        int opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                vehiculos = gv.registrarVehiculo(sc);
                                break;
                            case 2:
                                vehiculos = gv.modificarVehiculos(vehiculos, sc);
                                break;
                            case 3:
                                vehiculos = gv.eliminarVehiculos(vehiculos, sc);
                                break;
                            case 4:
                                gv.buscarVehiculos(vehiculos, sc);
                                break;
                            case 5:
                                submenu = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean minmenu = true;
                    while (minmenu) {
                        System.out.println("Gestion de contratos de renting");
                        System.out.println("1) Registrar nuevo contrato");
                        System.out.println("2) Modificar contrato");
                        System.out.println("3) Finalizar contrato");
                        System.out.println("4) Buscar contrato");
                        System.out.println("5) Ver todos los contratos");
                        System.out.println("6) Regresar al menu principal");
                        int opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                contratoRenting = gr.Registrarnuevocontrato(contratoRenting, sc);
                                break;
                            case 2:
                                String idModificar = sc.next();
                                contratoRenting = gr.Modificarcontrato(idModificar, contratoRenting, sc);
                                break;
                            case 3:
                                String idFinalizar = sc.next();
                                contratoRenting = gr.Finalizarcontrato(idFinalizar, contratoRenting, sc);
                                break;
                            case 4:
                                String idBuscar = sc.next();
                                contratoRenting contrato = gr.BuscarContrato(idBuscar, contratoRenting);
                                if (contrato != null) {
                                    System.out.println("Contrato encontrado: " + contrato.getIdContrato());
                                    System.out.println("Cédula: " + contrato.getCedulaCliente());
                                    System.out.println("Fecha inicio: " + contrato.getFechaInicio());
                                    System.out.println("Fecha fin: " + contrato.getFechaFinal());
                                    System.out.println("Total de días: " + contrato.getTotalDias());
                                } else {
                                    System.out.println("Contrato no encontrado");
                                }
                                break;
                            case 5:
                                gr.MostrarLista(contratoRenting);
                                break; 
                            case 6:
                                minmenu = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }             
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

