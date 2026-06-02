import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Validaciones {
    public String validarNumeros(Scanner sc){
        String cedula = sc.next();
        if(cedula.matches("[0-9]+")){
            return cedula;
        }
        System.out.println("Datos invalidos, solo se permiten numeros");
        return validarNumeros(sc);
    }

    public String validarTexto(Scanner sc){
        String nombre = sc.next();
        if(nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
            return nombre;
        }
        System.out.println("Datos invalidos, solo se permiten letras");
        return validarTexto(sc);
    }

    public String validarDireccion(Scanner sc){
        String direccion = sc.nextLine();
        if(!direccion.trim().isEmpty()){
            return direccion;
        }
        System.out.println("La direccion no puede estar vacia");
        return validarDireccion(sc);
    }

    public String validarNumerosAlfabeto(Scanner sc, String campo){
        String dato = sc.next();
        if(dato.matches("[a-zA-Z0-9]+")){
            return dato;
        }
        System.out.println(campo+" Invalido, no se permiten caracteres especiales");
        return validarNumerosAlfabeto(sc, campo);
    }

    public int validarEnteroPositivo(Scanner sc){
        if(!sc.hasNextInt()){
            System.out.println("Ingrese un numero entero valido");
            sc.next();
            return validarEnteroPositivo(sc);
        }   
        int n = sc.nextInt();
        if(n>0){
            return n;
        }
        System.out.println("El numero debe ser positivo");
        return validarEnteroPositivo(sc);
    }

    public float validarFloatPositivo(Scanner sc, String campo) {
        if (!sc.hasNextFloat()) {
            System.out.println(campo + " Invalido. Ingrese un numero.");
            sc.next();
            return validarFloatPositivo(sc, campo);
        }
        float numero = sc.nextFloat();
        if (numero > 0) {
            return numero;
        }
        System.out.println(campo + " Invalido. Debe ser positivo.");
        return validarFloatPositivo(sc, campo);
    }
    
    public String validarEstado(Scanner sc){
        String estado = sc.next().toLowerCase();
        if(estado.equals("disponible") || estado.equals("alquilado")){
            return estado;
        }
        System.out.println("Estado invalido, debe ser disponoble o alquilado");
        return validarEstado(sc);
    }

    public String validarCombustible(Scanner sc){
        String combustible = sc.next().toLowerCase();
        if(combustible.equals("gasolina") || combustible.equals("diesel") || combustible.equals("electrico")){
            return combustible;
        }
        System.out.println("Tipo de combustible invalido");
        return validarCombustible(sc);
    }

    public String validarTransmision(Scanner sc){
        String transmision = sc.next().toLowerCase();
        if(transmision.equals("manual") || transmision.equals("automatica")){
            return transmision;
        }
        System.out.println("Transmision invalida");
        return validarTransmision(sc);
    }

    public String validarTraccion(Scanner sc){
        String traccion = sc.next();
        if(traccion.equals("4x2") || traccion.equals("4x4")){
            return traccion;
        }
        System.out.println("Traccion invalida. Debe ser 4x2 o 4x4.");
        return validarTraccion(sc);
    }


    public boolean ValidarIdContrato(ArrayList<contratoRenting> l, String idContrato) {
        for (contratoRenting o : l) {
            if (o.getIdContrato().equals(idContrato)) {
                return true;
            }
        }
        return false;
    }

    public String validarFormatoFecha(Scanner sc) {
        String fecha = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try {
            LocalDate.parse(fecha, formatter);
            return fecha;
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha invalido. Ingrese la fecha como YYYY/MM/DD");
            return validarFormatoFecha(sc);
        }
    }
}
