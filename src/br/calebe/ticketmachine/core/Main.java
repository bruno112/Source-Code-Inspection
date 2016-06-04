package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

//classe alterada
public class Main {
    public static void main(String[] args) throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        
    
    TicketMachine tm = new TicketMachine(10);
    PapelMoeda pm = new PapelMoeda(10,10);
    
    
    tm.inserir(100);
    
    
    
    System.out.println("Saldo Anterior: " + tm.getSaldo());
    tm.inserir(50);
    System.out.println("Saldo atual: " + tm.imprimir());
    
    
    }
    
    
    
    
    
}
