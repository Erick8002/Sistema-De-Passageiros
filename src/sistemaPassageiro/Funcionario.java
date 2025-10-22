package sistemaPassageiro;

import java.util.Date;

public class Funcionario extends Pessoa{
    private int codigo;
    private String contaCorrente;

    public Funcionario(long id, String nome, String email, String telefone, Date dataNascimento, String usuario, String senha, Endereco endereco, int codigo, String contaCorrente) {
        super(id, nome, email, telefone, dataNascimento, usuario, senha, endereco);
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
