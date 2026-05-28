 import java.util.Scanner;

public class Menuprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al garroItm");
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
                    System.out.println("Pagina en mantenimieto");
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

