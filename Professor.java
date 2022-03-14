package heranças;

public class Professor extends Pessoa{

	
		
		 public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		public String departamento;
		 public String nomeCurso;
		 public double salario;
		 
		 //void exibirOiProfessor() {
				//System.out.println("VC ESTA USANDO A CLASSE Professor!!!!");
		 //}
		 
		 public void calcularSalarioLiquido(double salario) {
			 System.out.println(" " + salario);
		 }
		

	

}
