package loop;


public class Pedido {
    
    private int codigoP;
    private String dataPedido;
    
    public Pedido(){
       this.setCodigoP((int)(Math.random() * 900000)+100000);
    }
    
    public Pedido(int codigoP, String dataPedido){
        
        this.codigoP = codigoP;
        this.dataPedido = dataPedido;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    
    
}