package br.com.unbank.transferencia.modelo;

public interface Contas {

    boolean abrir(Conta conta);

    Conta buscar(String numero);

}
