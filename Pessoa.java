public class Pessoa {
    private  String nome;
    private int idade;
    public String cpf;

    public void apresentaDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+ idade);
    }
    public Pessoa(String n, int i, String cpf){
        this.nome=n;
        this.idade=i;
        this.cpf=cpf;
    }

    public int getIdade(){
         return idade;
    }
    public void setIdade(int idade)
    {
        if(idade>=0) {
            this.idade = idade;
        }else{
            System.out.println("Idade não pode ser negativo");
        }
    }
    public String getCpf(){
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

