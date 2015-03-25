package saludos;

public class SaludadorHombre implements Saludador{

	@Override
	public String saludar(Hombre hombre) {
		
		return " Saludo apretando manos " +hombre.getName();
	}

	@Override
	public String saludar(Mujer mujer) {
		
		 return " saluda de beso  a "+mujer.getName() +  ""; 
	}

	

	
	

	
	
}
