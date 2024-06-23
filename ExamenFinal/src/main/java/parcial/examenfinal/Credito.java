package parcial.examenfinal;

public class Credito {
    private double monto;
    private int plazo; // en meses
    private Usuario solicitante;
    private Usuario codeudor;

    public Credito(Usuario solicitante, double monto, int plazo, Usuario codeudor) {
        this.solicitante = solicitante;
        this.monto = monto;
        this.plazo = plazo;
        this.codeudor = codeudor;
    }

    // Método para calcular la cuota mensual
    public double calcularCuotaMensual() {
        double tasaInteresMensual = 0.01; // 1% mensual
        return monto * tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -plazo));
    }
}
