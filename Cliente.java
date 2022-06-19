package Model;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private Long rg;
    private LocalDate dataNascimento;
    private Long cpf;
    private Conta conta;

    public Cliente(String nome){
        this.nome = nome;
    }

    public  Cliente(String nome, Long rg, LocalDate dataNascimento, Long cpf){
        this.nome = nome;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
//    public void criarConta(Enum<TipoConta> tipoConta, Long numeroConta, int agencia){
//        Conta conta = new Conta();
//        conta.tipoConta = tipoConta;
//        conta.numeroConta = numeroConta;
//        conta.agencia = agencia;
//        conta.saldo = BigDecimal.ZERO;
////        this.conta = conta;
//
//    }
    //Obtem o valor do nome (get - getter)
    public String getNome(){
        return this.nome;
    }
    //Altera o valor de nome (set - setter)
    public void setNome (String nome) {
        this.nome = nome;
    }

    public Long getRg(){
        return this.rg;
    }

    public void setRg (Long rg) {
        this.rg = rg;
    }

    public Long getCpf(){
        return this.cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Conta getConta(){
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}