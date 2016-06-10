package classes;

public class Cliente extends Pessoa{

	private String assinatura;
	private int status;
	private int anoAssinatura;
	
	public Cliente(String nome, String cpf, String telefone, String email, String endereco, String assinatura, int status, int anoAssinatura) {
		super(nome, cpf, telefone, email, endereco);
		this.assinatura = assinatura;
		this.status = status;
		this.anoAssinatura = anoAssinatura;	
	}

	public String getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getAnoAssinatura() {
		return anoAssinatura;
	}

	public void setAnoAssinatura(int anoAssinatura) {
		this.anoAssinatura = anoAssinatura;
	}
	
	
	

}
