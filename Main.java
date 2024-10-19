public class Main {
    public static void main(String[] args) {
    Cliente c1=new Cliente(1,"Henry");
    Cliente c2=new Cliente(2,"tody");

        System.out.println(c1);
        System.out.println(c2);

        //Cartões gerados pelo 4dev
        CartaoCredito cartao01=new CartaoCredito("5210-4407-8470-5579","09/06/2026",809,c1);
        CartaoCredito cartao02=new CartaoCredito("6062-8271-9809-0597","09/03/2025",632,c2);
        System.out.println(cartao01);
        System.out.println(cartao02);
        cartao01.setDataValidade("09/26");
        cartao02.setDataValidade("03/25");
        System.out.println("\n--------------CARTAO1-------------------");
        System.out.println(cartao01);
        System.out.println("\n--------------CARTAO2-------------------");
        System.out.println(cartao02);

        Agencia a1=new Agencia(1001);
        Agencia a2=new Agencia(1002);

        System.out.println("\n--------------AGENCIA1-----------------");
        System.out.println(a1);
        System.out.println("\n--------------AGENCIA2-----------------");
        System.out.println(a2);
        Conta conta1=new Conta(33367,345.00,2500.00,c1,a1);
        Conta conta2=new Conta(67890,3000.00,5000.00,c2,a2);
        System.out.println("\n--------------------CONTA1--------------");
        System.out.println(conta1);
        System.out.println("----------------------CONTA2------------");
        System.out.println(conta2);

        //DEPOSITO
        conta1.depositar(440);
        conta2.sacar(200);
        System.out.println("\n--------------EXTRATO CONTA1--------------");
        conta1.extrato();
        System.out.println("\n--------------EXTRATO CONTA2------------");
        conta2.extrato();

        //Transferencia
        conta1.transferir(100,conta2);
        System.out.println("\n--------------EXTRATO CONTA1--------------");
        conta1.extrato();
        System.out.println("\n--------------EXTRATO CONTA2------------");
        conta2.extrato();

    }
}
