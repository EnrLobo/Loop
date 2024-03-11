package loop;

import java.util.ArrayList;
import java.util.List;


public class Jogo {
   private  int codigoJogo;
   private String nomeJogo, requisitos, descricao, tipo, dataLancamento;
   private double precoJogo, avaliacao;
   Desenvolvedora dev = new Desenvolvedora();
   Categoria cat = new Categoria();
   private List<Jogo> Loja;
   
   Jogo(){
       
       this.Loja = new ArrayList<>();
       
   }
   
   public void cadastroJogo(Jogo jogo) {
        Loja.add(jogo);
    }

    public void descadastrarJogo(Jogo jogo) {
        Loja.remove(jogo);
    }

    public List<Jogo> getLoja() {
        return Loja;
    }
   
   Jogo(String nome, String data){
       this.dataLancamento = data;
       this.nomeJogo = nome;
   }
   
    public int getCodigoJogo() {
        return codigoJogo;
    }

    public void setCodigoJogo(int codigoJogo) {
        this.codigoJogo = codigoJogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getPrecoJogo() {
        return precoJogo;
    }

    public void setPrecoJogo(double precoJogo) {
        this.precoJogo = precoJogo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
