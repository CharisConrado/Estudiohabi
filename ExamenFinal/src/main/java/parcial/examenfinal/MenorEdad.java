
package parcial.examenfinal;

public class MenorEdad extends Usuario {
    private Usuario acudiente;

    public MenorEdad(String nombre, String apellido, int edad, String id, Usuario acudiente) {
        super(nombre, apellido, edad, id);
        this.acudiente = acudiente;
    }

    @Override
    public void abrirCuentaAhorro(double montoInicial) {
        // Implementación para abrir cuenta de ahorro
    }

    @Override
    public void solicitarCredito(double monto, int plazo, Usuario codeudor) {
        // Los menores no pueden solicitar crédito
        throw new UnsupportedOperationException("Los menores no pueden solicitar crédito.");
    }
}