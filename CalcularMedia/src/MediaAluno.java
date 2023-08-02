public class MediaAluno {
    public static void main(String[] args) throws Exception {
        /*Criando a instancia da Classe Aluno para a Classe principal*/
        Aluno aluno = new Aluno(7, 5, 8, 6);
        double media = aluno.calcularMedia();
        String situacao = aluno.getSituacao();

        /*Comandos de saída*/
        System.out.println("Pablo Gabriel");
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}
