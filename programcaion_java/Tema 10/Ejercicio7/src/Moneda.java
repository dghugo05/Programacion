public class Moneda{
    private String[] valor = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private String[] posicion = {"cara", "cruz"};
    private String valorMoneda, posicionMoneda;

    public Moneda(){
        this.valorMoneda = valor[(int) (Math.random() * valor.length)];
        this.posicionMoneda = posicion[(int) (Math.random() * posicion.length)];
    }

    public String toString(){
        return this.valorMoneda + " - " + this.posicionMoneda;
    }
}