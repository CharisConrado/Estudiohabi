package parcial.examenfinal;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String id;

    public Usuario(String nombre, String apellido, int edad, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }

    // Métodos abstractos que se implementarán en las clases hijas
    public abstract void abrirCuentaAhorro(double montoInicial);
    public abstract void solicitarCredito(double monto, int plazo, Usuario codeudor);
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }
}
