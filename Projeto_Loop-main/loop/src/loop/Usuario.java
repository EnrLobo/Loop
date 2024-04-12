package loop;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int codigoU, telefone;
    private String nome, nickname, email, senha, endereco, cpf;
    private double saldo;
    private List<Jogo> biblioteca;
    Jogo jogoU = new Jogo();
    
   
    
    public Usuario() {
       
        this.biblioteca = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        biblioteca.add(jogo);
    }

    public void removerJogo(Jogo jogo) {
        biblioteca.remove(jogo);
    }

    public List<Jogo> getBiblioteca() {
        return biblioteca;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    public int getCodigoU() {
        return codigoU;
    }

    public void setCodigoU(int codigoU) {
        this.codigoU = codigoU;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void dadosConta(){
        
        System.out.println("Codigo da conta: "+this.codigoU);
        System.out.println("Nome de usuario: "+this.nome);
        System.out.println("E-mail: "+this.email);
        System.out.println("Senha: "+this.senha);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endenreco: "+this.endereco);
        System.out.println("Saldo disponivel na carteira Loop: "+this.saldo);
        
        
    }
    
    
    
}
