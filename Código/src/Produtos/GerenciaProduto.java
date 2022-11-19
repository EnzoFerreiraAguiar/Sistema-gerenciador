/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;
import java.util.ArrayList;
public class GerenciaProduto {
    
    
    
private ArrayList <Produto> listaProduto;


Produto p = new Produto ("Bola de Futebol" , "432" , (float) 30,(float) 15,"7/05/2022");
Produto p2 = new Produto ("Bola de Basquete", "931" , (float) 20, (float)10,"13/04/2022");



public GerenciaProduto(){
    listaProduto= new ArrayList();
    
    listaProduto.add(p);
    listaProduto.add(p2);
    
    
    }
}


    
    
    

