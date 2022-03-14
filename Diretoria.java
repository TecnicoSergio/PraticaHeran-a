package heranças;

public class Diretoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor sergio;
		sergio = new Professor();
		
		Aluno duda;
		duda = new Aluno();
		
		duda.setNome("Eduarda Rodrigues dos Santos");
		duda.setCpf("133.545.455.48");
		duda.setCurso("Curso de Ingles");
		duda.setTelefone("4566-4566");
		duda.setNota("10");
		duda.setEndereco("Rua balandia 34");
		//duda.setMedia(10);
		double nota2 = 6.2;
		duda.calcularMedia(nota2);
		
		
		sergio.setNome("Sérgio Santos");
		sergio.setDepartamento("Tecnologia da Informação");
		sergio.setCpf("123.123.1223.55");
		sergio.setSalario(3500.00);
		
		System.out.println("Ola vc esta na classe PROFESSOR: " + "\n " + "Seu Nome no Cadastro:" + sergio.getNome() + "\n " + "Seu Departamento: " + 
		sergio.getDepartamento() + "\n " + "CPF: " + sergio.getCpf() + "\n" + "Seu Salario mensal: " + 
				sergio.getSalario() + "\n");
		
		System.out.println("Ola vc esta na CLASSE ALUNO" + "\n" + "Nome cadastrado de aluno : " + duda.getNome() + "\n" + "CPF: "+ 
		duda.getCpf() + "\n" + "Seu curso : " + duda.getCurso() + "\n" + "Telefone: " + duda.getTelefone() + "\n" + 
		"Sua nota bimestral " + duda.getNota() + "\n" + " " + duda.getEndereco() + "\n"  );
		
		
		
		
		

	}

}
