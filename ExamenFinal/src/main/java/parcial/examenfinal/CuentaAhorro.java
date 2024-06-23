package parcial.examenfinal;

public class CuentaAhorro {
    private static final double TASA_INTERES = 0.02; // 2% anual
    private double saldo;
    private Usuario propietario;

    public CuentaAhorro(Usuario propietario, double montoInicial) {
        this.propietario = propietario;
        this.saldo = montoInicial;
    }

    public void abonar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }

    public double calcularIntereses() {
        return saldo * TASA_INTERES;
    }

    public double getSaldo() {
        return saldo;
    }
}
