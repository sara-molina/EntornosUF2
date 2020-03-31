

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Refactor {
	
	private static final String EMPLEADO = "empleado";
	private static final String JEFE = "jefe";

	public static void main (String[] args) {
	Map<String,String> datos = new HashMap<>();
	List<String> empleados = new ArrayList<>();
	List<String> jefes = new ArrayList<>();
	
	datos.put("Marga",JEFE);
	datos.put("Ana",JEFE);
	datos.put("Paco",EMPLEADO);
	datos.put("Mario",EMPLEADO);
	datos.put("Antonio",EMPLEADO);
	datos.put("José",EMPLEADO);
	datos.put("Tamara",EMPLEADO);
	
	
	for(Map.Entry<String, String> entry : datos.entrySet()) {
		
		if (entry.getValue().equals(EMPLEADO)) {
			empleados.add(entry.getKey());
		}
		if (entry.getValue().equals(JEFE)) {
			jefes.add(entry.getKey());
		}
	}

	mostrarEmpelados(empleados);
	
	mostrarJefes(jefes);

	}

	private static void mostrarJefes(List<String> jefes) {
		System.out.println("Los jefes son: ");

		for(String jefe : jefes) {
			
			System.out.println(jefe);
		}
	}

	private static void mostrarEmpelados(List<String> empleados) {
		System.out.println("Los empleados son: ") ;
		
		for(String empleado : empleados) {
			
			System.out.println(empleado);
		}
	}
}
