package saludos;

public abstract class Persona {
	 private String name;
	 
     
	 public Persona(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract String accept(Saludador saludador);


	
      
}
