package powergirl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "telefone")
public class Telefone extends BaseEntity{
	
	@NotNull
	@NotBlank(message="Número de telefone é obrigatório") 
	private String numero;
	
	@NotNull
	private String nome;

	public Telefone(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
