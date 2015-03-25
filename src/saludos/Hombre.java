package saludos;

public class Hombre extends Persona{
   
	public Hombre(String name) {
		super(name);
		
	}

	@Override
	public String  accept(Saludador saludador) {
		
        return this.getName()+ 		 saludador.saludar(this);
	}

	
	
}
