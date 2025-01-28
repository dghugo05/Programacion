public abstract class CuentaBancaria implements Operaciones{
    protected double tipoInteres;
    protected double saldo;
    protected String titular;
    protected long TiempoCreacion;

    public CuentaBancaria() {
        this.saldo = 0;
        this.TiempoCreacion = System.currentTimeMillis();
    }

    public void depositar(double cantidad) {
        double anteriorSaldo = this.saldo;
                this.saldo += cantidad;
                System.out.printf("        Su saldo bancario es de %.2f + %.2f = %.2f\n", anteriorSaldo, cantidad, this.saldo);
    }

    public void retirar(double cantidad) {
        double anteriorSaldo = this.saldo;
        this.saldo -= cantidad;
        System.out.printf("        Su saldo bancario es de %.2f - %.2f = %.2f", anteriorSaldo, cantidad, this.saldo);
    }

    public String obtenerSaldo(){
        return "        El saldo de la cuenta es: " + this.saldo;
    }

    @Override
    public void calculoInteres(int tiempoTranscurrido){
        double interesGanado = (saldo * tiempoTranscurrido) * tipoInteres /100;
        depositar(interesGanado);
        System.out.println("        Intereses calculados y añadidos: " + interesGanado);
        this.TiempoCreacion = System.currentTimeMillis();
    }

    @Override
    public void mostrarSaldo(){
        System.out.println(obtenerSaldo());
    }
}
