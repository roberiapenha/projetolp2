package classes;

import java.util.ArrayList;

public class ArvoreBinariaBusca {
	private No raiz;
        
        public void inserir(Atendente a){
            if(raiz == null)
                raiz = new No(a);
            else
                raiz.inserir(a);
        }
        
        
        public void remover(Atendente a){
            
        }
        
        
        public ArrayList<Atendente> getNodesInOrder(){
            ArrayList<Atendente> atendentes = new ArrayList<>();
            
            if(raiz == null)
                return null;

            raiz.noEsquerda.getAtendentesEmOrdem(atendentes);
            atendentes.add(raiz.atendente);
            raiz.noDireita.getAtendentesEmOrdem(atendentes);
            
            return atendentes;
        }
        
        public void printPreOrder(){
            if(raiz == null) return;

            System.out.print(raiz.atendente.getNome());
            if(raiz.noEsquerda != null) raiz.noEsquerda.printPreOrder();
            if(raiz.noDireita != null) raiz.noDireita.printPreOrder();
            System.out.println(".");
        }
        
        public void printInOrder(){
            if(raiz.noEsquerda != null) raiz.noEsquerda.printEmOrdem();
            System.out.print(raiz.atendente.getNome() + ", ");
            if(raiz.noDireita != null) raiz.noDireita.printEmOrdem();
            System.out.println();
        }
        
        public void printPosOrder(){
            if(raiz.noEsquerda != null) raiz.noEsquerda.printPosOrdem();
            if(raiz.noDireita != null) raiz.noDireita.printPosOrdem();
            System.out.println(raiz.atendente.getNome() + ".");
        }
}
