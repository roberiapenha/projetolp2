package classes;

import java.util.ArrayList;

/**
 * Classe que representa um nó de uma árvore binária
 * @author nonet
 * @version 1.0
 */
public class No {
	/**
	 * Conteúdo do nó
	 */
	Atendente atendente;
	
	/**
	 * Filho esquerdo do nó
	 */
	No noEsquerda;
	
	/**
	 * Filho direito do nó
	 */
	No noDireita;

	/**
	 * Método construtor da classe
	 */
	public No() {
            
	}
            
	/**
	 * Método construtor de um nó com elemento inicial
	 * @param valor - Elemento que fcará guardado no nó
	 */
	public No(Atendente a) {
            this.atendente = a;
	}

	/**
	 * Método modificador de inserção de um novo elemento em um determinado nó da árvore
	 * @param node - Nó em que o elemento pode ser guardado
	 * @param atendente - Elemento que fcará guardado no nó
	 */
	public void inserir(Atendente atendente) {
            if(this.atendente.getQtdCliente() > atendente.getQtdCliente()){
                if(this.noEsquerda == null)
                    this.noEsquerda = new No(atendente);
                else
                    this.noEsquerda.inserir(atendente);
            } else {
                if(this.noDireita == null)
                    this.noDireita = new No(atendente);
                else
                    this.noDireita.inserir(atendente);
            }
	}

	/**
	 * Método modificador de remoção de um elemento da árvore
	 * @param atendente - Elemento que será removido da árvore
	 */
	public void remover(Atendente atendente) {
            
	}
	
	/**
	 * Método de acesso que percorre a árvore em pré-ordem imprimindo os valores
	 * @param node - Nó que será impresso
	 */
	public void printPreOrder() {
            System.out.print(", " + this.atendente.getNome());
            if(this.noEsquerda != null) this.noEsquerda.printPreOrder();
            if(this.noDireita != null) this.noDireita.printPreOrder();
	}

	/**
	 * Método de acesso que percorre a árvore em ordem imprimindo os valores
	 * @param node - Nó que será impresso
	 */
	public void printEmOrdem() {
            if(this.noEsquerda != null) this.noEsquerda.printEmOrdem();
            System.out.print(this.atendente.getNome() + ", ");
            if(this.noDireita != null) this.noDireita.printEmOrdem();
	}
        
        /**
         * Método de acesso que cria um ArrayList com atendentes ordenados pela sua quantidade de usuários atendidos
         * @param node - Nó que será visitado
         * @param atendentes - ArrayList que será retornado
         */
        public void getAtendentesEmOrdem(ArrayList<Atendente> atendentes){
            if(this.noEsquerda != null) this.noEsquerda.getAtendentesEmOrdem(atendentes);
            atendentes.add(this.atendente);
            if(this.noDireita != null) this.noDireita.getAtendentesEmOrdem(atendentes);
        }

	/**
	 * Método de acesso que percorre a árvore em Pós-ordem imprimindo os valores
	 * @param node - Nó que será impresso
	 */
	public void printPosOrdem() {
            if(this.noEsquerda != null) this.noEsquerda.printPosOrdem();
            if(this.noDireita != null) this.noDireita.printPosOrdem();
            System.out.print(this.atendente.getNome() + ", ");
	}

}
