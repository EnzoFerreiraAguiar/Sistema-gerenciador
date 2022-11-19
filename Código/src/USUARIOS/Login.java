/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USUARIOS;

/**
 *
 * @author Enrico Ferreira
 */
public class Login {
    private String login; 
    private String senha;

    public Login(String login, String senha) {
       this.login = login;
       this.senha = senha;
    }
    public Login(){};

 
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String imprimir(){
        return "----------------"
                +"\nLogin : " + login
                +"\nSenha : " + senha;
    }
    
    
}
