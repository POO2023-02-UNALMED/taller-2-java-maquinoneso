package test;

public class Auto {
	int catidadCreados = 0;
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	// Constructor
	public Auto(String modelo, int precio, Asiento[] asientos,String marca,Motor motor,int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
    }
	
	// Metodo cantidad de asientos
	
	public void cantidadAsientos(Object[] numAsientos) {
		int cantidadAsientos = 0;
		for (Object elemento : numAsientos) {
			if (elemento instanceof Asiento) {
				cantidadAsientos ++;
			}
			
		}
		System.out.println(cantidadAsientos);	
	}
	
	// Metodo verificar registro
	public void verificarIntegridad(Object Auto) {
		int value = this.registro;
		for(Asiento asiento : asientos) {
			if(asiento != null & asiento.registro != this.registro) {
				System.out.println("Las piezas no son originales");
				value = asiento.registro;
				break;
			}		
		}
		if(value == this.motor.registro) {
			System.out.println("Auto original");
		}
	}	
}
