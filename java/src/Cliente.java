public class Cliente {

    private String nome;
    private String cpf;
    private int idade;

  

   
    public void setNome(String nome) {
      
        if (nome != null && nome.contains(" ")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. Deve conter nome e sobrenome.");
           
    }}

    public void setCpf(String cpf) {
      
        if (cpf != null && cpf.matches("5")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve conter 5 números.");
          
        }
    }

    public void setIdade(int idade) {
    
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Deve estar entre 0 e 120 anos.");
           
        }
    }

   
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getIdade() {
        return this.idade;
    }
}

