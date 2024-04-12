package loop;

public class NF {
    private int codigoNF, CPF;
    private String dataEmissao;
    Usuario user = new Usuario();
    ItensPedido itens = new ItensPedido();
    Jogo game = new Jogo();
    

    public void mostrarNota(){
        System.out.println("Codigo NF: "+this.getCodigoNF());
        System.out.println("Data da emissao da NF: "+this.getDataEmissao());
        System.out.println("Itens do Pedido: "+itens.getCodigoP());
        System.out.println("Data do pedido: "+itens.getDataPedido());
        System.out.println("Número de itens do Pedido: "+itens.getQtdItens());
        System.out.println("Nome do Jogo: "+game.getNomeJogo());
        System.out.println("Valor: "+itens.getPrecoVenda());
        
    }
    
    public int getCodigoNF() {
        return codigoNF;
    }

    public void setCodigoNF(int codigoNF) {
        this.codigoNF = codigoNF;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
    
    
}