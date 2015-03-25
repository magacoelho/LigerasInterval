package saludos;

public class Principal {

	public static void main(String[] args) {
	   Persona juan = new Hombre("Juan");
	   Persona jose = new Hombre("Jose");
	   Persona maria = new Mujer("María");
	   Persona ana = new Mujer("Ana");
	   
	  Saludador saludadorHombre = new SaludadorHombre();
	  System.out.println(juan.accept(saludadorHombre));
	  System.out.println(jose.accept(saludadorHombre));
	  
	  
	  Saludador saludadorMujer= new SaludadorMujer();
	  
	  
	  
	 	}

}
