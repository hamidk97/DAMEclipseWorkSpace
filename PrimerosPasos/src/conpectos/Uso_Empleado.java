package conpectos;

public class Uso_Empleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado emp1 = new Empleado("Pepe", 132.15);
		Empleado emp2 = new Empleado();
		Empleado emp3 = new Empleado();

		System.out.println(emp1.dameSeccion());
	}

}
