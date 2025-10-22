package exercicios;

import java.util.Date;

public class Passageiro extends Pessoa{
    private String numeroCartao;
    private String documento;

    public Passageiro(long id, String nome, String email, String telefone, Date dataNascimento, String usuario, String senha, Endereco endereco, String numeroCartao, String documento) {
        super(id, nome, email, telefone, dataNascimento, usuario, senha, endereco);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
