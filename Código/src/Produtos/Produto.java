/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;


public class Produto {
    String codigo; 
    float preco; 
    String nome;
    float precoCompra;
    String dtaCadastroProd;

    public String getDtaCadastroProd() {
        return dtaCadastroProd;
    }

    public void setDtaCadastroProd(String dtaCadastroProd) {
        this.dtaCadastroProd = dtaCadastroProd;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
    
    public Produto (){};
    public Produto(String nome,String codigo,float preco, float precoCompra){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.precoCompra = precoCompra;
        
    }
    public Produto(String nome,String codigo,float preco, float precoCompra,String dtaCadastroProd){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.precoCompra = precoCompra;
        this.dtaCadastroProd = dtaCadastroProd;
    }
    
    public String imprimir(){
        return 
                nome + " / "+ " R$" + preco + " /  " + codigo + " / " + dtaCadastroProd;       
    }
    
    public float imprimirRelatorioLucro(float preco , float precoCompra){
        return 
            preco - precoCompra;
              
    }
    
    

 

               
    }

    
   
    
    
    
    
    
    
