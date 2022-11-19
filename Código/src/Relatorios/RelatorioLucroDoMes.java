package Relatorios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Produtos.Produto;
public class RelatorioLucroDoMes {
Produto p = new Produto ("Bola de Futebol" , "432" , (float) 30,(float) 15);
Produto p2 = new Produto ("Bola de Basquete", "931" , (float) 20, (float)10);
    
    
float lucroBolaBasquete = p2.getPreco() - p2.getPrecoCompra();
float lucroBolaFutebol = p.getPreco() - p.getPrecoCompra();






    
    
    public RelatorioLucroDoMes (){};

     public RelatorioLucroDoMes(float lucroBolaBasquete , float lucroBolaFutebol) {
        this.lucroBolaBasquete = lucroBolaBasquete;
        this.lucroBolaFutebol = lucroBolaFutebol ;
        
}
     
}
  
    
    
      
    

