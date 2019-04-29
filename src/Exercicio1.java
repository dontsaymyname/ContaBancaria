public class Exercicio1 {
    public static void main(String[] args) {

        //Primeiro cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Michael");
        cliente1.setSobrenome("Pires");

        //Primeira conta
        Conta conta1 = new Conta();
        conta1.setNumeroDaConta("000");
        conta1.setSaldo(500F);
        conta1.setTitular(cliente1);

        //Segundo cliente
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Mike");
        cliente2.setSobrenome("Pinheiro");

        //Segunda conta
        Conta conta2 = new Conta();
        conta2.setNumeroDaConta("111");
        conta2.setSaldo(100F);
        conta2.setTitular(cliente2);


        conta1.sacar(1000F);
        conta1.depositar(1200F);


        System.out.println(" ");
        System.out.println("Alternando conta...");
        System.out.println("Aguarde um momento...");
        System.out.println(" ");

        conta2.sacar(10000F);
        conta2.depositar(1000F);


        conta1.imprimir();

    }
}
