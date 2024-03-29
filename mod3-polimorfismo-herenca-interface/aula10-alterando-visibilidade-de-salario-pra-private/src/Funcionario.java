
public class Funcionario {

	private String nome;
	private String cpf;
	//protected double salario; // Não queremos usar o protected
	private double salario;
	
	/* Cada caso é um caso, mas o ideal é colocar a visibilidade dos atributos PRIVATE,
	 * nao liberando o acesso nem para os filhos.
	 * */
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
