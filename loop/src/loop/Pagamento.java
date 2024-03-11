/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;

/**
 *
 * @author João Henrique
 */
public class Pagamento {
    
    private int codigoPagamento;
    private String data, valorTotal, tipoPagamento;
    private boolean statusPagamento;

    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    
    
}
