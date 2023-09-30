package entities;

public class Pessoa {

	private String nome;
	private Integer kilos;
	private Double altura;
	
	public Pessoa(String nome, Integer kilos, Double altura) {
		super();
		this.nome = nome;
		this.kilos = kilos;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getKilos() {
		return kilos;
	}

	public void setKilos(Integer kilos) {
		this.kilos = kilos;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + " kilos=" + kilos + ", altura=" + altura + "]";
	}	
}
