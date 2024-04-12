package loop;

/**
 *
 * @author 10414032675
 */
public class ItensPedido extends Pedido {
    
    private int qtdItens;
    private double precoVenda;
    private Jogo idJogo = new Jogo();
    
    public ItensPedido(){
        
    }
    
    public ItensPedido(int codigoP, String dataPedido){
        super(codigoP, dataPedido);
    }
    
    
    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Jogo getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Jogo idJogo) {
        this.idJogo = idJogo;
    }
    
    
    
    
    
}