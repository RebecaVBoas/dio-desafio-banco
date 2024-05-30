import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Conta implements IConta{
    private String numeroConta;
    private Cliente cliente;
    private  double saldoConta;
    private String tipoConta;


    public Conta(String numeroConta, Cliente cliente, double saldoConta) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldoConta = saldoConta;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }


    private List<Double> entradas = new ArrayList<Double>();
    private List<Double> saidas = new ArrayList<Double>();
    @Override
    public void sacar( double valorSaque) {
        if(saldoConta>valorSaque) {
            System.out.println("Saque de R$"+valorSaque+" realizada com sucesso!");
            saldoConta -= valorSaque;
            saidas.add(valorSaque);
        }else
            System.out.println("SALDO INSUFICIENTE PARA ESSA TRANSAÇÕA");
    }

    @Override
    public void depositar( double valorDeposito) {
        System.out.println("Depósito de R$"+valorDeposito+" realizada com sucesso!");
        saldoConta+=valorDeposito;
        entradas.add(valorDeposito);
    }

    //rever as regras denegocio para umas transferencia
    @Override
    public void transferir(double valorTrasnferencia) {
        if(saldoConta>valorTrasnferencia) {
            System.out.println("Transfêrencia de R$"+valorTrasnferencia+" realizada com sucesso!");
            saldoConta -= valorTrasnferencia;
            saidas.add(valorTrasnferencia);
        }else
            System.out.println("SALDO INSUFICINETE PRA ESSA TRANSAÇÃO");
    }
    @Override
    public void historicoEntradas(){
        System.out.println("HÍSTORICOS DE ENTRADAS: ");
        for (Double en:entradas)
            System.out.println("R$"+en);
    }

    @Override
    public void historicoSaidas( ){
        System.out.println("HISTÓRICO DE SAÍDAS");
        for (Double s:saidas)
            System.out.println("R$"+s);
    }
}
