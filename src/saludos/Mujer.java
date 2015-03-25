package saludos;

public class Mujer extends Persona{

	public Mujer(String name) {
		super(name);
		
	}

	@Override
	public String accept(Saludador saludador) {
		
		return this.getName() +  saludador.saludar(this);
	}

	

}
