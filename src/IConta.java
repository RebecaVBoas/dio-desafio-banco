import java.util.List;

public interface IConta {
    public void sacar( double valorSaque);
    public void depositar( double valorDeposito);
    public void transferir(double valorTransferencia);
    public void historicoEntradas();
    public void historicoSaidas( );

}
