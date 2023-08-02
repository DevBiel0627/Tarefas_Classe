public class Aluno {
    /*Variaveis da Classe Aluno*/
    private double nota1, nota2, nota3, nota4;
    
    /*Criando a referencia do proprio objeto*/
    public Aluno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    /*Calculando a Media do Aluno*/
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    /*Metodo de Criar a situação de Aprovado ou Reprovado*/
    public String getSituacao() {
        double media = calcularMedia();

        if (media >= 6) {
            return "Aprovado";
        } 
            return "Reprovado";
    }
}
