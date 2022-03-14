package heranças;

 public class Aluno extends Pessoa {

	
		
		
		 private String curso;
		 private String nota;
		 private double media;
		 
		public double getMedia() {
			return media;
		}
		public void setMedia(double media) {
			this.media = media;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getNota() {
			return nota;
		}
		public void setNota(String nota) {
			this.nota = nota;
		}
		
		//void exibirOiAluno() {
			//System.out.println("VC ESTA USANDO A CLASSE ALUNO!!!!");
		//}
		
		public void calcularMedia(double nota2) { //METODO: CALCULAR MEDIA
			String media = this.nota + nota2 /2;
			
			System.out.println("O calculo da sua media é : " + media);
			
			
		}
		public void verificarAprovado(double resultado) {   //METODO VERIFICAR APROVADO
			System.out.println("O aluno foi aprovado: " + resultado);
			
		}
		 
		 
		

	

}
