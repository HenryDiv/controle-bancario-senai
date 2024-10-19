public class CartaoCredito {
    private String numero;
    private String dataValidade;
    private int cvv;
    private Cliente cliente;

    public CartaoCredito(String numero,String dataValidade,int cvv, Cliente cliente){
        this.numero=numero;
        this.dataValidade=dataValidade;
        this.cvv=cvv;
        this.cliente=cliente;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return "Cartão de credito [número="+numero+"| dataValidade="+dataValidade+"| cvv="+cvv+"|" +cliente+"]";
    }
}
