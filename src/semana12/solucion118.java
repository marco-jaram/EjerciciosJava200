package semana12;

public class solucion118 extends solucion117 {
    public String chequera;

    public void setChequera(String chequera) {
        this.chequera = chequera;
    }

    public String getChequera() {
        return chequera;
    }

    public static void main(String[] args) {
        solucion118 cuenta = new solucion118();
        cuenta.depositar(2000);
        cuenta.setChequera("CHQ-001");
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Número de chequera: " + cuenta.getChequera());
    }
}
