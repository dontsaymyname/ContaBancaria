public class Conta {


    //atributos
    private String numeroDaConta;
    private float saldo;
    private Cliente titular;




    //metodos


    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float deposito){
        saldo = saldo + deposito;
        System.out.println("Depósito de R$" + deposito + " realizado.");
        System.out.println("Saldo: R$" + saldo);

    }

    public void sacar(float saque){
        if (saque > saldo ){
            System.out.println("Saldo insuficiente");

        } else if (saque <= saldo){
            saldo = saldo - saque;
            System.out.println( titular.getNome() + "efetuou um saque de R$" + saque + " realizado com sucesso.");
            System.out.println("Saldo: R$" + saldo );
        }

    }
    public void imprimir(){
        System.out.println(numeroDaConta);
        System.out.println(saldo);
        System.out.println(titular);
    }



}
