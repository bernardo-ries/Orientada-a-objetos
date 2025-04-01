public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Pessoa p =  new Pessoa("Ricardo", 40, "12345678");


        p.apresentaDados();

        int idade, ano;
        idade = p.getIdade();
        ano = 2025 - idade;
        System.out.println("Ano de nascimento: " + ano);
        p.setIdade(35);
        p.apresentaDados();
        idade = -20;

        p.setIdade(idade);
        p.apresentaDados();
        p.setNome("Rodrigo");
        p.apresentaDados();
    }
}