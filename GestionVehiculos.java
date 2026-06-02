import java.util.ArrayList;
import java.util.Scanner;

public class GestionVehiculos {
    Validaciones validaciones = new Validaciones();
    public ArrayList<Vehiculo> registrarVehiculo(ArrayList<Vehiculo> vehiculos, Scanner sc){
        if (vehiculos == null) {
            vehiculos = new ArrayList<>();
        }
        boolean condicion = true;
        while (condicion) {
            System.out.println("Seleccione el tipo de vehiculo");
            System.out.println("1) Carro sedan ");
            System.out.println("2) Camioneta SUV");
            int opcion = validaciones.validarEnteroPositivo(sc);
            Vehiculo v = null;
            switch (opcion) {
                case 1:
                    carroSedan sedan = new carroSedan();
                    System.out.println("Ingrese la placa del vehiculo: ");
                    sedan.setPlaca(validaciones.validarNumerosAlfabeto(sc, "Placa"));
                    System.out.println("Ingrese la marca: ");
                    sedan.setMarca(validaciones.validarTexto(sc));
                     System.out.println("Ingrese el modelo:");
                    sedan.setModelo(validaciones.validarEnteroPositivo(sc));
                    System.out.println("Ingrese el precio diario:");
                    sedan.setPrecioDiario(validaciones.validarFloatPositivo(sc, "Precio"));
                    System.out.println("Ingrese el estado:");
                    sedan.setEstado(validaciones.validarEstado(sc));
                    System.out.println("Ingrese el tipo de combustible:");
                    sedan.setTipoCombustible(validaciones.validarCombustible(sc));
                    System.out.println("Ingrese la transmision:");
                    sedan.setTransmision(validaciones.validarTransmision(sc));
                    v = sedan;
                    break;
            
                case 2:
                    camionetaSUV camioneta = new camionetaSUV();
                    System.out.println("Ingrese la placa:");
                    camioneta.setPlaca(validaciones.validarNumerosAlfabeto(sc, "Placa"));
                    System.out.println("Ingrese la marca:");
                    camioneta.setMarca(validaciones.validarTexto(sc));
                    System.out.println("Ingrese el modelo:");
                    camioneta.setModelo(validaciones.validarEnteroPositivo(sc));
                    System.out.println("Ingrese el precio diario:");
                    camioneta.setPrecioDiario(validaciones.validarFloatPositivo(sc, "Precio"));
                    System.out.println("Ingrese el estado:");
                    camioneta.setEstado(validaciones.validarEstado(sc));
                    System.out.println("Ingrese el tipo de traccion:");
                    camioneta.setTipoTraccion(validaciones.validarTraccion(sc));
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
    
    public ArrayList<Vehiculo> modificarVehiculos(ArrayList<Vehiculo> vehiculos,Scanner sc){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados ");
            return vehiculos;
        }
        
        System.out.println("Ingrese la placa del vehiculo a modificar: ");
        String placa = validaciones.validarNumerosAlfabeto(sc,"Placa");
        for(Vehiculo v : vehiculos){
            if(v.getPlaca().equals(placa)){
                System.out.println("Ingrese la nueva marca: ");
                v.setMarca(validaciones.validarTexto(sc));
                System.out.println("Ingrese el nuevo modelo: ");
                v.setModelo(validaciones.validarEnteroPositivo(sc));
                System.out.println("Ingrese el nuevo precio: ");
                v.setPrecioDiario(validaciones.validarFloatPositivo(sc, "Precio"));
                System.out.println("Ingrese el nuevo estado: ");
                v.setEstado(validaciones.validarEstado(sc));

                if(v instanceof carroSedan){
                    carroSedan sedan = (carroSedan) v;
                    System.out.println("Ingrese el nuevo tipo de combustible: ");
                    sedan.setTipoCombustible(validaciones.validarCombustible(sc));
                    System.out.println("Ingrese la nueva transmision: ");
                    sedan.setTransmision(validaciones.validarTransmision(sc));
                }
                else if (v instanceof camionetaSUV){
                    camionetaSUV camioneta = (camionetaSUV) v;
                    System.out.println("Ingrese el nuevo tipo de traccion:");
                    camioneta.setTipoTraccion(validaciones.validarTraccion(sc));
                    System.out.println("Ingrese la nueva capacidad de pasajeros:");
                    camioneta.setCapacidadPasajeros(sc.nextInt());
                }
                System.out.println("Vehiculo modificado correctamente");

            }
        }
        return vehiculos;

    }

    public ArrayList<Vehiculo> eliminarVehiculos(ArrayList<Vehiculo> vehiculos, ArrayList<contratoRenting> contratosActivos, ArrayList<contratoRenting> contratosFinalizados, Scanner sc){
        if(vehiculos == null || vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return vehiculos;
        }
        System.out.println("Ingrese la placa del vehiculo a eliminar: ");
        String placa = sc.next();
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if(v.getPlaca().equals(placa)){
                vehiculos.remove(i);
                if (contratosActivos != null) {
                    contratosActivos.removeIf(ct -> placa.equals(ct.getPlaca()));
                }
                if (contratosFinalizados != null) {
                    contratosFinalizados.removeIf(ct -> placa.equals(ct.getPlaca()));
                }
                System.out.println("Vehiculo eliminado correctamente");
                System.out.println("Cualquier contrato asociado al vehiculo tambien fue eliminado.");
                return vehiculos;
            }
        }
        System.out.println("Vehiculo no encontrado");
        return vehiculos;
    }

    public void buscarVehiculos(ArrayList<Vehiculo> vehiculos,Scanner sc){
        if(vehiculos == null || vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return;
        }
        System.out.println("Ingrese la placa del vehiculo que quiere ver: ");
        String placa = validaciones.validarNumerosAlfabeto(sc,"Placa");
        for(Vehiculo v : vehiculos){
            if(v.getPlaca().equals(placa)){
                System.out.println(v);
                return;
            }
        }
        System.out.println("Vehiculo no encontrado");
    }

    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos){
        if(vehiculos == null || vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
            return;
        }
        for(Vehiculo v : vehiculos){
            System.out.println(v);
            System.out.println("---------------------------");
        }
    }
}
