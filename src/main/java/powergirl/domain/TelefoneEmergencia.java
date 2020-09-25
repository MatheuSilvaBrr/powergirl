package powergirl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class TelefoneEmergencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome da pessoa de emergência é obrigatório")
	private String nome;
	
	@NotNull
	@NotBlank(message="Número de telefone é obrigatório") 
	private String numero;

	
	public TelefoneEmergencia(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public boolean enviaMensagemEmgercia(String mensagem){
		return true;
	}
	
	public void realizaChamada() {
		
	}
}
