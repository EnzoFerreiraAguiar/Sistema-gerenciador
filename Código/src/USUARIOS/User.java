
package USUARIOS;


public class User {
    
private String nome;
private String email;
private int idade;
private String dataCadastro;
private String usuario;

public User (){};

public User(String nome,String dataCadastro){
    this.nome = nome;
    this.dataCadastro = dataCadastro;
}

public User (String usuario,String nome,String email,int idade,String dataCadastro){
    this.usuario = usuario;
    this.nome = nome;
    this.email = email;
    this.idade = idade;
    this.dataCadastro = dataCadastro;
}

    

    

 public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
    public String imprimirUser(){
       return  "------------------------" 
              +"\nUsuário: " + usuario
              +"\nNome: " + nome  
              +"\nE-mail: " + email  
              +"\nIdade: " + idade
              +"\nData de Cadastro : "+ dataCadastro;
         
    }
    
   





    
}
