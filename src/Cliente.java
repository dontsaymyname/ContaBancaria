public class Cliente {



    // atributos
    private String nome;
    private String sobrenome;

    public Cliente(){
    // construtor default
    }
    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    // getters and setters
    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}


