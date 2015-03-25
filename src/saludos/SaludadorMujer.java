package saludos;

public class SaludadorMujer implements Saludador {

	@Override
	public String saludar(Hombre hombre) {
	
		return "Saludo con besos cariņososo a" + hombre.getName();
	}

	@Override
	public String saludar(Mujer mujer) {
		
		return "Saludo con abrazo  "+ mujer.getName();
	}

	

	
}
