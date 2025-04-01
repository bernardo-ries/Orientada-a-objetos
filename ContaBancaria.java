public class ContaBancaria {
    double saldo;
    double limite;

    public ContaBancaria() {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    double saque(double valor) {
        if(valor >limite) {
            System.out.println("Saldo Insuficiente");
        }else{
            saldo -= valor;
            System.out.println("Seu novo saldo é: " + saldo);
        }
        return valor;
    }
}

