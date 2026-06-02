import java.util.ArrayList;

public class Informe {

	// Overloaded printers (by single object)
	public static void imprimir(Clientes c) {
		if (c == null) return;
		System.out.println(c);
	}

	public static void imprimir(Vehiculo v) {
		if (v == null) return;
		System.out.println(v);
	}

	public static void imprimir(contratoRenting ct) {
		if (ct == null) return;
		System.out.println("ID contrato: " + ct.getIdContrato());
		System.out.println("Cedula cliente: " + ct.getCedulaCliente());
		System.out.println("Placa: " + ct.getPlaca());
		System.out.println("Fecha inicio: " + ct.getFechaInicio());
		System.out.println("Fecha fin: " + ct.getFechaFinal());
		System.out.println("Total dias: " + ct.getTotalDias());
		System.out.println("Valor total: " + ct.getValorTotal());
		System.out.println("---------------------------");
	}

	// High level printers for lists
	public static void imprimirClientes(ArrayList<Clientes> clientes) {
		System.out.println("==== Informe de Clientes ====");
		if (clientes == null || clientes.isEmpty()) {
			System.out.println("No hay clientes registrados");
			return;
		}
		for (Clientes c : clientes) {
			imprimir(c);
		}
	}

	public static void imprimirVehiculos(ArrayList<Vehiculo> vehiculos) {
		System.out.println("==== Informe de Vehículos ====");
		if (vehiculos == null || vehiculos.isEmpty()) {
			System.out.println("No hay vehículos registrados");
			return;
		}
		for (Vehiculo v : vehiculos) {
			imprimir(v);
		}
	}

	public static void imprimirContratos(ArrayList<contratoRenting> contratos, String titulo) {
		System.out.println("==== " + titulo + " ====");
		if (contratos == null || contratos.isEmpty()) {
			System.out.println("No hay contratos en esta categoría");
			return;
		}
		for (contratoRenting ct : contratos) {
			imprimir(ct);
		}
	}

	public static void imprimirAll(ArrayList<Clientes> clientes, ArrayList<Vehiculo> vehiculos, ArrayList<contratoRenting> contratosActivos, ArrayList<contratoRenting> contratosFinalizados) {
		System.out.println("\n===== INFORME GENERAL =====\n");
		imprimirClientes(clientes);
		System.out.println();
		imprimirVehiculos(vehiculos);
		System.out.println();
		imprimirContratos(contratosActivos, "Contratos Activos");
		System.out.println();
		imprimirContratos(contratosFinalizados, "Contratos Finalizados");
		System.out.println();

		// Calcular ingresos totales a partir de contratos finalizados
		double totalIngresos = 0.0;
		if (contratosFinalizados != null) {
			for (contratoRenting ct : contratosFinalizados) {
				totalIngresos += ct.getValorTotal();
			}
		}
		System.out.println("Total ingresos generados por renting (contratos finalizados): " + totalIngresos);
		System.out.println("\n===== FIN DEL INFORME =====\n");
	}
}
