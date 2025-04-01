public class Main2 {
    public static void main(String[] args) {
        Aluno a = new Aluno("Bernardo");
        double nota1= 9;
        double nota2= 7;
        a.setNota1(nota1);
        a.setNota2(nota2);
        a.calculaMedia();
    }
}
