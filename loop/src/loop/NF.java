package loop;

public class NF {
    private int codigoNF, CPF;
    private String dataEmissao;
    Usuario user = new Usuario();
    ItensPedido itens = new ItensPedido();

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