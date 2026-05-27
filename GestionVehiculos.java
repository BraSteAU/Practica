import java.util.ArrayList;
import java.util.Scanner;

public class GestionVehiculos {
    public ArrayList<Vehiculo> registrarVehiculo(Scanner sc){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        boolean condicion = true;
       while (condicion) {
            System.out.println("Seleccione el tipo de vehiculo");
            System.out.println("1) Carro sedan ");
            System.out.println("2) Camioneta SUV");
            int opcion = sc.nextInt();
            Vehiculo v = null;
            switch (opcion) {
                case 1:
                    carroSedan sedan = new carroSedan();
                    System.out.println("Ingrese la placa del vehiculo: ");
                    sedan.setPlaca(sc.next());
                    System.out.println("Ingrese la marca: ");
                    sedan.setMarca(sc.next());
                     System.out.println("Ingrese el modelo:");
                    sedan.setModelo(sc.nextInt());
                    System.out.println("Ingrese el precio diario:");
                    sedan.setPrecioDiario(sc.nextFloat());
                    System.out.println("Ingrese el estado:");
                    sedan.setEstado(sc.next());
                    System.out.println("Ingrese el tipo de combustible:");
                    sedan.setTipoCombustible(sc.next());
                    System.out.println("Ingrese la transmision:");
                    sedan.setTransmision(sc.next());
                    v = sedan;
                    break;
            
                case 2:
                    camionetaSUV camioneta = new camionetaSUV();
                    System.out.println("Ingrese la placa:");
                    camioneta.setPlaca(sc.next());
                    System.out.println("Ingrese la marca:");
                    camioneta.setMarca(sc.next());
                    System.out.println("Ingrese el modelo:");
                    camioneta.setModelo(sc.nextInt());
                    System.out.println("Ingrese el precio diario:");
                    camioneta.setPrecioDiario(sc.nextFloat());
                    System.out.println("Ingrese el estado:");
                    camioneta.setEstado(sc.next());
                    System.out.println("Ingrese el tipo de traccion:");
                    camioneta.setTipoTraccion(sc.next());
                    System.out.println("Ingrese la capacidad de pasajeros:");
                    camioneta.setCapacidadPasajeros(sc.nextInt());
                    v = camioneta;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            vehiculos.add(v);
            System.out.println("Desea ingresar otro vehiculo: ");
            System.out.println("1) Si\n2) No");
            int opt = sc.nextInt();
            if(opt == 2){
                condicion = false;
            }
       }
       return vehiculos;
    }
}
