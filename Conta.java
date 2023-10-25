public class Conta {
    private int numeroAgencia;
    private int numeroConta;
    protected double saldo;
    private Cliente cliente; // Uma conta só pode ter um cliente associado
    protected Transacao transacao;
    private Notificacao notificacao;

    public Conta(int numeroAgencia, int numeroConta, double saldo, Cliente cliente){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        cliente.adicionarConta(this); // Associa a conta ao cliente
        this.transacao = new Transacao(); // Inicialize o objeto de transação
    }
}