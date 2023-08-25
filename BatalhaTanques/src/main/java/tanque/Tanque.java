/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tanque;

/**
 *
 * @author gabriel.omsantos
 */
public class Tanque implements Cores,Posicao,Canhao{
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private int x,y;
    
    public Tanque(){
    }
    
     public Tanque(CoresRGB corTanque, CoresRGB corCanhao, int x, int y) {
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao=corCanhao;
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
       this.corTanque=corTanque;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
         return corCanhao;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;      
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public void atirar() {
        for(int i=1;i<=5;i++){
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(long cadencia) {
         for(int i=1;i<=5;i++){
            System.out.println("Atirando...");
            esperar(1000*cadencia);
        }
    }
    
    private void esperar(long cadencia){ 
       try{
        if(cadencia>5000){
        throw new IllegalArgumentException("Valor inválido");
        }else{
        Thread.sleep(cadencia);
        }
       } catch (InterruptedException e) {
           System.out.println(e.getMessage());
       }
    }
}
