package parcial.examenfinal;

public class Independiente extends Usuario {
    public Independiente(String nombre, String apellido, int edad, String id) {
        super(nombre, apellido, edad, id);
    }

    @Override
    public void abrirCuentaAhorro(double montoInicial) {
        // Implementación para abrir cuenta de ahorro
    }

    @Override
    public void solicitarCredito(double monto, int plazo, Usuario codeudor) {
        // Implementación para solicitar crédito
    }
}
