package pesquisa.contatos;

import java.util.Objects;

public class Contato {

	private String nome;
	private int numeroTelefone;
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroTelefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome) && numeroTelefone == other.numeroTelefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]";
	}
	
	
	
}
