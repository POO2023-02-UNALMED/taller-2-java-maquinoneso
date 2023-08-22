package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	// Constructor
    public Asiento(String color, int precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }
    
 // Metodo para cambiar el color del asiento
    public void cambiarColor(String myColor) {
    	if (myColor == "rojo" ||
        	myColor == "verde" ||
            myColor == "amarillo" ||
            myColor == "negro" ||
            myColor == "blanco" ) {
                
            this.color = myColor;
          
    }  
}
}
