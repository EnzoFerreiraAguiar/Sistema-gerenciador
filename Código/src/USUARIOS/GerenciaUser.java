/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USUARIOS;

import java.util.ArrayList;
public class GerenciaUser {
    
  
    
    private ArrayList<User> listaUser ;
    
    public GerenciaUser(){
        listaUser = new ArrayList();
    }
    
    
    public void adicionar(User user){
        listaUser.add(user);
    }  
    
    
    
    
}
