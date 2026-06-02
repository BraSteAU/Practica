 import java.util.ArrayList;
 import java.util.LinkedList;
import java.util.Scanner;

public class Menuprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estructurasdinamicas estructura = new Estructurasdinamicas();
        gestionClientes gc = new gestionClientes();
        GestionVehiculos gv = new GestionVehiculos();
        Metodoscontratos mc = new Metodoscontratos();
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
                                estructura.vector_clientes = gc.registrarClientes(estructura.vector_clientes, sc);
                                break;
                            case 2:
                                estructura.vector_clientes = gc.modificarClientes(estructura.vector_clientes, sc);
                                break;
                            case 3:
                                estructura.vector_clientes = gc.eliminarClientes(estructura.vector_clientes, estructura.vector_contratos, sc);
                                break;
                            case 4:
                                gc.buscarClientes(estructura.vector_clientes, sc);
                                break;
                            case 5:
                                gc.mostrarClientes(estructura.vector_clientes);
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
                    boolean submenuVehiculos = true;
                    while (submenuVehiculos) {
                        System.out.println("Gestion de vehiculos");
                        System.out.println("1) Registrar vehiculo");
                        System.out.println("2) Modificar vehiculo");
                        System.out.println("3) Eliminar vehiculo");
                        System.out.println("4) Buscar vehiculo");
                        System.out.println("5) Ver todos los vehiculos");
                        System.out.println("6) Regresar al menu principal");
                        int opcionVeh = sc.nextInt();
                        switch (opcionVeh) {
                            case 1:
                                estructura.vector_vehiculos = gv.registrarVehiculo(estructura.vector_vehiculos, sc);
                                break;
                            case 2:
                                estructura.vector_vehiculos = gv.modificarVehiculos(estructura.vector_vehiculos, sc);
                                break;
                            case 3:
                                estructura.vector_vehiculos = gv.eliminarVehiculos(estructura.vector_vehiculos, estructura.vector_contratos, sc);
                                break;
                            case 4:
                                gv.buscarVehiculos(estructura.vector_vehiculos, sc);
                                break;
                            case 5:
                                gv.mostrarVehiculos(estructura.vector_vehiculos);
                                break;
                            case 6:
                                submenuVehiculos = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean submenuContratos = true;
                    while (submenuContratos) {
                        System.out.println("Gestion de contratos de renting");
                        System.out.println("1) Registrar contrato");
                        System.out.println("2) Modificar contrato");
                        System.out.println("3) Finalizar contrato");
                        System.out.println("4) Buscar contrato");
                        System.out.println("5) Ver todos los contratos");
                        System.out.println("6) Regresar al menu principal");
                        int opcionContrato = sc.nextInt();
                        switch (opcionContrato) {
                            case 1:
                                estructura.vector_contratos = mc.Registrarnuevocontrato(estructura.vector_contratos, sc);
                                break;
                            case 2:
                                System.out.println("Ingrese el id del contrato a modificar:");
                                String idContratoMod = sc.next();
                                estructura.vector_contratos = mc.Modificarcontrato(idContratoMod, estructura.vector_contratos, sc);
                                break;
                            case 3:
                                System.out.println("Ingrese el id del contrato a finalizar:");
                                String idContratoFin = sc.next();
                                estructura.vector_contratos = mc.Finalizarcontrato(idContratoFin, estructura.vector_contratos, sc);
                                break;
                            case 4:
                                System.out.println("Ingrese el id del contrato a buscar:");
                                String idContratoBus = sc.next();
                                contratoRenting resultado = mc.BuscarContrato(idContratoBus, estructura.vector_contratos);
                                if (resultado != null) {
                                    System.out.println("Contrato encontrado:");
                                    System.out.println(resultado);
                                } else {
                                    System.out.println("Contrato no encontrado");
                                }
                                break;
                            case 5:
                                mc.MostrarLista(estructura.vector_contratos);
                                break;
                            case 6:
                                submenuContratos = false;
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

