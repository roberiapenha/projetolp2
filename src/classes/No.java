package classes;

/**
 * Classe que representa um n� de uma �rvore bin�ria
 * @author nonet
 * @version 1.0
 */
public class No {
	/**
	 * Conte�do do n�
	 */
	Atendente atendente;
	
	/**
	 * Filho esquerdo do n�
	 */
	No noEsquerda;
	
	/**
	 * Filho direito do n�
	 */
	No noDireita;

	/**
	 * M�todo construtor da classe
	 */
	public No() {
	}

	/**
	 * M�todo construtor de um n� com elemento inicial
	 * @param valor - Elemento que ficar� guardado no n�
	 */
	public No(Atendente valor) {
		this.atendente = valor;
	}

	/**
	 * Representa a raiz da �rvore
	 */
	public No raiz;

	/**
	 * M�todo modificador de inser��o de um novo elemento na �rvore
	 * @param valor - Elemento que ficar� guardado no n�
	 */
	public void inserir(Atendente valor) {
		inserir(raiz, valor);
	}

	/*
	 * Regras para inserir 1 - Se ainda nÃ£o hÃ¡ um nÃ³ raiz, entÃ£o o novo elemento
	 * Ã© o nÃ³ raiz 2 - Se hÃ¡ um nÃ³ raiz, entÃ£o compara o elemento com o nÃ³ raiz.
	 * Caso o elemento seja menor, Ã© inserido da sub-arvore a esquerda, caso
	 * contrÃ¡rio na sub-arvore a direita. Importante: Utilizar RecursÃ£o para
	 * cada inserÃ§Ã£o
	 */
	
	/**
	 * M�todo modificador de inser��o de um novo elemento em um determinado n� da �rvore
	 * @param node - N� em que o elemento pode ser guardado
	 * @param atendente - Elemento que ficar� guardado no n�
	 */
	public void inserir(No node, Atendente atendente) {
		if(node == null){
			raiz = new No(atendente);
		} else {
			if(node.atendente.getQtdCliente() > atendente.getQtdCliente()){
				if(node.noEsquerda == null)
					node.noEsquerda = new No(atendente);
				else
					inserir(node.noEsquerda, atendente);
			} else {
				if(node.noDireita == null)
					node.noDireita = new No(atendente);
				else
					inserir(node.noDireita, atendente);
			}
		}
	}

	/*
	 * Regras para deletar 1 - Caso o nÃ³ nÃ£o possua nenhum filho, apenas remove
	 * este nÃ³. 2 - Caso o nÃ³ possua apenas um filho, remove o pai e coloca o
	 * filho no lugar (neste caso 2, move toda a sub-arvore que vem com ele. 3 -
	 * Caso o nÃ³ possua dois filhos:
	 * a) Substituir pelo maior nÃ³ da sub-arvore da esquerda
	 * b) Substituir pelo menor nÃ³ da sub-arvore da direita 
	 * -> depois deletar o nÃ³ utilizado na substituiÃ§Ã£o usando o caso 1 ou o caso 2
	 */
	
	/**
	 * M�todo modificador de remo��o de um elemento da �rvore
	 * @param atendente - Elemento que ser� removido da �rvore
	 */
	public void deletar(Atendente atendente) {

		No pai = null;
		No removente = this.raiz;

		while(removente != null && removente.atendente.getQtdCliente() != atendente.getQtdCliente()){
			pai = removente;
			removente = (removente.atendente.getQtdCliente() > atendente.getQtdCliente()) ? removente.noEsquerda : removente.noDireita;
		}


		if(removente != null && removente.atendente == atendente){

			if(removente.noDireita != null){

				No paiSucessor = removente;
				No sucessor = removente.noDireita;

				while(sucessor.noEsquerda != null){
					paiSucessor = sucessor;
					sucessor = sucessor.noEsquerda;
				}

				sucessor.noEsquerda = removente.noEsquerda;

				if(paiSucessor.noEsquerda == sucessor)
					paiSucessor.noEsquerda = (sucessor.noDireita != null) ? sucessor.noDireita : null;
				else
					paiSucessor.noDireita = (sucessor.noDireita != null) ? sucessor.noDireita : null;

				sucessor.noDireita = removente.noDireita;
				
				if(pai == null){
					this.raiz = sucessor;
				} else {
					if(pai.noEsquerda == removente)
						pai.noEsquerda = sucessor;
					else
						pai.noDireita = sucessor;
				}
			} else {
				if(pai == null){
					this.raiz = this.raiz.noEsquerda;
				} else {
					if(pai.noEsquerda == removente)
						pai.noEsquerda = removente.noEsquerda;
					else
						pai.noDireita = removente.noEsquerda;
				}
			}
		}
	}
	
	/*
	 * Vista todas as sub-Ã¡rvores da esquerda e depois visita todos os
	 * da direita
	 * 
	 */
	
	/**
	 * M�todo de acesso que percorre a �rvore em Pr�-ordem imprimindo os valores
	 * @param node - N� que ser� impresso
	 */
	public void preordem(No node) {
		if(node == null) return;
		
		System.out.print(node.atendente + ", ");
		preordem(node.noEsquerda);
		preordem(node.noDireita);
	}

	/*
	 * Imprime primeiro a sub-arvore da esquerda Depois a raiz Depois a
	 * sub-arvore da direita
	 */
	
	/**
	 * M�todo de acesso que percorre a �rvore em ordem imprimindo os valores
	 * @param node - N� que ser� impresso
	 */
	public void ordem(No node) {
		if(node == null) return;
		
		ordem(node.noEsquerda);
		System.out.print(node.atendente + ", ");
		ordem(node.noDireita);
	}

	/*
	 * Vista primeiro os mÃ©todos da esquerda Depois toda a sub-arvore da direita
	 * Por Ãºltimo imprime a raiz
	 */
	
	/**
	 * M�todo de acesso que percorre a �rvore em P�s-ordem imprimindo os valores
	 * @param node - N� que ser� impresso
	 */
	public void posordem(No node) {
		if(node == null) return;
		
		posordem(node.noEsquerda);
		posordem(node.noDireita);
		System.out.print(node.atendente + ", ");
	}

	/*
	 * MÃ©todos para testar sua implementaÃ§Ã£o
	 */
	public void imprime() {
		
		if (raiz == null) {
			System.out.println("Árvore Vazia!");
		} else {
			imprime(raiz);
		}
	}

	public void imprime(No node) {
		if (node.noEsquerda != null) {
			imprime(node.noEsquerda);
		}
		if (node.noDireita != null) {
			imprime(node.noDireita);
		}
		System.out.println("Nó: "+node.atendente);
	}
	
	

}
