public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;
    private Agencia agencia;

    public Conta(int numero,double saldo,double limite,Cliente cliente, Agencia agencia){
        this.numero=numero;
        this.saldo=saldo;
        this.limite=limite;
        this.cliente=cliente;
        this.agencia=agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }
    public boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        else{return false;}
    }

    public void extrato(){
        System.out.print("\nconta: "+this.numero);
        System.out.print(" Saldo: "+this.saldo);
        System.out.print(" Limite: "+this.limite);

    }
    public double saldo(){
        return this.saldo;
    }

    public boolean transferir(double valor,Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        else{return false;}
    }
    public String toString(){
        return "conta [numero="+numero+"| Saldo="+saldo+"| limite="+limite+"| "+cliente+"|"+agencia+"]";
    }

}
