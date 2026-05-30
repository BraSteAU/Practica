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
}
