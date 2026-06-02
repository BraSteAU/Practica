
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Scanner;

public class Metodoscontratos {

    public LinkedList<contratoRenting> Registrarnuevocontrato(LinkedList<contratoRenting> l, Scanner sc) {
        Validaciones validaciones = new Validaciones();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        boolean pedir = true;
        while (pedir) {
            contratoRenting o = new contratoRenting();
            System.out.println("Ingrese el numero de cedula");
            o.setCedulaCliente(sc.nextInt());

            System.out.println("Ingrese la fecha de inicio del contrato (YYYY/MM/DD)");
            o.setFechaInicio(LocalDate.parse(validaciones.validarFormatoFecha(sc), formatter));


            System.out.println("Ingrese la fecha de fin del contrato (YYYY/MM/DD)");
            o.setFechaFinal(LocalDate.parse(validaciones.validarFormatoFecha(sc), formatter));

            System.out.println("Ingrese el id del contrato");
            o.setIdContrato(sc.next());

            if (validaciones.ValidarIdContrato(l, o.getIdContrato())) {
                System.out.println("El contrato ya existe, por favor valide");
                continue;
            }

            int dias = (int) ChronoUnit.DAYS.between(o.getFechaInicio(), o.getFechaFinal());
            if (dias < 0) {
                System.out.println("La fecha de fin debe ser posterior a la fecha de inicio.");
                continue;
            }
            o.setTotalDias(dias);

            l.add(o);
            System.out.println("Desea seguir ingresando? 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                pedir = false;
            }
        }
        return l;
    }

    public void MostrarLista(LinkedList<contratoRenting> l) {
        if (l.isEmpty()) {
            System.out.println("No hay contratos registrados");
            return;
        }

        for (contratoRenting o : l) {
            System.out.println("Cédula: " + o.getCedulaCliente());
            System.out.println("Fecha de inicio: " + o.getFechaInicio());
            System.out.println("Fecha de fin: " + o.getFechaFinal());
            System.out.println("Total de dias de contrato: " + o.getTotalDias());
            System.out.println("--------------------------------------");
            System.out.println();
        }
    }

    public contratoRenting BuscarContrato(String idContrato, LinkedList<contratoRenting> l) {
        for (contratoRenting O : l) {
            if (O.getIdContrato().equals(idContrato)) {
                return O;
            }
        }
        return null;
    }

    public LinkedList<contratoRenting> Modificarcontrato(String idContrato, LinkedList<contratoRenting> l, Scanner sc) {
        Validaciones validaciones = new Validaciones();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        boolean encontrado = false;
        for (contratoRenting O : l) {
            if (O.getIdContrato().equals(idContrato)) {
                System.out.println("Contrato encontrado");
                System.out.println("Cedula (no modificable): " + O.getCedulaCliente());
                System.out.println("ID Contrato (no modificable): " + O.getIdContrato());
                System.out.println("Placa (no modificable): " + O.getPlaca());
                System.out.println("\nIngrese la nueva fecha de inicio del contrato (YYYY/MM/DD)");
                O.setFechaInicio(LocalDate.parse(validaciones.validarFormatoFecha(sc), formatter));
                System.out.println("Ingrese la nueva fecha de fin del contrato (YYYY/MM/DD)");
                O.setFechaFinal(LocalDate.parse(validaciones.validarFormatoFecha(sc), formatter));
                int dias = (int) ChronoUnit.DAYS.between(O.getFechaInicio(), O.getFechaFinal());
                if (dias >= 0) {
                    O.setTotalDias(dias);
                    System.out.println("Contrato modificado correctamente");
                } else {
                    System.out.println("La fecha de fin debe ser posterior a la fecha de inicio.");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contrato no encontrado");
        }
        return l;
    }

    public boolean ValidarIdContrato(LinkedList<contratoRenting> l, String idContrato) {
        for (contratoRenting o : l) {
            if (o.getIdContrato().equals(idContrato)) {
                return true;
            }
        }
        return false;
    }

     public LinkedList<contratoRenting> Finalizarcontrato(String idContrato, LinkedList<contratoRenting> l, Scanner sc) {
        boolean eliminado = false;
        for (int i = 0; i < l.size(); i++) {
            contratoRenting o = l.get(i);
            if (o.getIdContrato().equals(idContrato)) {
                l.remove(i);
                eliminado = true;
                System.out.println("Contrato finalizado y eliminado de la lista.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Contrato no encontrado para finalizar.");
        }
        return l;
    }
}

