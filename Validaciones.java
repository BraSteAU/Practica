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
}
