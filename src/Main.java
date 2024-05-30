// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //SERVIÇÕES OFERECIDOS PELO BANCO
        /*1) Criar uma conta(nécessario de um cliente)
        * 2) Criar um perfil de Cliente
        * 3) Adcionar as contas a lista de cliente */

        System.out.println("Exemplo 1");

        // Criando um Cliente
        Cliente c = new Cliente("Jose", "897560-45");
        //Criando uma conta
        Conta c1 = new Conta("3", c, 200);

        // Fazendo um déposito na conta
        c1.depositar(100);
        //Fazendo um saque na conta
        c1.sacar(34);
        // fazendo uma transferencia
        c1.transferir(50);
        // Mostrando o saldo da conta na tela
        System.out.println("Saldo conta: R$" + c1.getSaldoConta());
        // Imprimindo o historico de entradas
        c1.historicoEntradas();
        //Imprimindo o historico de saídas
        c1.historicoSaidas();

        System.out.println("Exemplo 2");
        //Criando um novo cliente
        Cliente c2 = new Cliente("Ana Maria Teixeira", "687.908.543-50");
        Conta cc2 = new Conta("123", c2, 100);
        Conta cc3 = new Conta("123", c2, 300);

        // Tentando fazer um saque e trasferencia invalidos
        cc2.sacar(200);
        cc2.transferir(500);
        System.out.println("Saldo conta: "+cc2.getSaldoConta());






    }
    public void teste(Cliente cc, Conta c){
        if(c.getCliente().getCPF()==cc.getCPF())
            cc.contas.add(c);
    }
}