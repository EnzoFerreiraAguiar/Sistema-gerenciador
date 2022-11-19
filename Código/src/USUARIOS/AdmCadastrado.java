/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USUARIOS;

/**
 *
 * @author dsdd
 */
public class AdmCadastrado {
    
private String nome;
private int idade;
private String email;
private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

public AdmCadastrado(){};

public AdmCadastrado(String usuario,String nome,String email,int idade){
    this.usuario = usuario;
    this.nome = nome;
    this.idade = idade;
    this.email = email;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String imprimir(){
        return "-----------------------"
                +"\nUsuario " + usuario
                +"\nNome : " + nome
                +"\nIdade : " + idade
                +"\nEmail : " + email;
    }


    
}
