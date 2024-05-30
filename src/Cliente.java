import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nome;
    private String CPF;
    int telefone;

    Set<Conta> contas = new HashSet<Conta>();


    public Cliente(String nome, String CPF) {

        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
