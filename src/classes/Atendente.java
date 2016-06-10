package classes;

import java.util.ArrayList;

public class Atendente extends Pessoa{

	private int cargaHoraria;
	private int qtdCliente;
        private ArrayList<Cliente> clientes;
	
	public Atendente(String nome, String cpf, String telefone, String email, String endereco, int cargaHoraria, int qtdCliente) {
		super(nome, cpf, telefone, email, endereco);
		this.cargaHoraria = cargaHoraria;
		this.qtdCliente = qtdCliente;
                this.clientes = new ArrayList<>();
  
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getQtdCliente() {
		return qtdCliente;
	}

	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	

        public void AtenderProximoCliente(){
            clientes.add(Heap.removerTopo());
        }
        
        public void RemoverClienteLista(int indice){
            clientes.remove(indice);
        }
        
        public String EnviarMensagem(int indice, String mensagem){
            Cliente cliente = clientes.get(indice);
            cliente.enviarMensagem(mensagem);
            //return mensagem;
        }
        
}
