package conpectos;

public class Jefe extends Empleado {

	private double incentivo;

	public Jefe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jefe(String nom, double sou, String seccio, double incentiu) {
		super(nom, sou, seccio);
		this.incentivo = incentiu;

	}

	public void EstableceIncentivo(double incen) {

		this.incentivo = incen;
		
	}

	
	public double dameSueldo(double incen)
	{		
		return super.dameSueldo() + incen;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	
	
}
