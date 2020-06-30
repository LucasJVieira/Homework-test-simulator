package Model;

import java.util.Arrays;

public class Aluno {

    private byte[] resposta;
    private String nome;
    private int ra;
    private String login;
    private int senha;

    //construtor
    public Aluno() {
        this.resposta = new byte[10];
    }

    //métodos de acesso
    public byte[] getRespostas() {
        return resposta;
    }

    public void setRespostas(byte[] resposta) {
        this.resposta = resposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getLogin() {
        return login = "alunoqi";
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha = 12345;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Respostas: " + Arrays.toString(this.resposta);
    }

    public void cadastrarRespostas(int i, byte resposta) { //"armazenar respostas"
        this.resposta[i] = resposta;
    }

   

}
