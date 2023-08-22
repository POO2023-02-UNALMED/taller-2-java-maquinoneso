package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    // Constructor
    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }

    // Metodo cambiarRegistro
    public void cambiarRegistro(int newRegistro) {
        this.registro = newRegistro;
    
    }

    //Metodo para cambiar el tipo de motor
    public void asignarTipo(String toTipo) {
        this.tipo = toTipo;
    }
}
