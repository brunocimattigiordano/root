/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoiestruturadedados;

import java.util.Stack;

/**
 *
 * @author FATEC
 * 
 */
public class Logicadojogo {

    Stack<Integer> pilhaA = new Stack<>();
    Stack<Integer> pilhaB = new Stack<>();
    Stack<Integer> pilhaC = new Stack<>();
    private int pecanamao=0;
    
    public void novojogo() {
        removepecasdapilha(pilhaA);
        removepecasdapilha(pilhaB);
        removepecasdapilha(pilhaC);
        soltapecadamao();
        enchepilhadepecas(pilhaA);
    }
    
    void removepecasdapilha(Stack<Integer> pilhaatual) {
        pilhaatual.clear();
    }

    public void soltapecadamao(){
        pecanamao=0;
    }

    void enchepilhadepecas(Stack<Integer> pilhaatual) {
        for (int i = 4; i > 0; i--) {
            pilhaatual.push(i);
        }
    }
    
    public boolean naotempecanamao(){
        return pecanamao==0;
    }
    
    public void pegapecadapilha(Stack<Integer> pilhaescolhida){
        pecanamao=pilhaescolhida.pop();
    }

    public boolean pecaatualpodesercolocadanapilhadestino(Stack<Integer>pilhadestino) {
        //olha o topo da pilha destino e se for maior que a peca em maos entao podesercolocada
        return pilhadestino.peek()>pecanamao;
    }
    
    public void poepecanapilha(Stack<Integer> pilhadestino){
        pilhadestino.push(pecanamao);
    }
    
    int emqualposicaoestaapeca(Stack<Integer> pilhaolhada,int peca){
        return pilhaolhada.search(peca);
    }
    
    public int getPecanamao(){
        return this.pecanamao;
    }
    
    public Stack<Integer> getTorreA(){
        return this.pilhaA;
    }
    
    public Stack<Integer> getTorreB(){
        return this.pilhaB;
    }
    
    public Stack<Integer> getTorreC(){
        return this.pilhaC;
    }
    public boolean houvevitoria(){
        return pilhaC.size()==4;
    }
}
