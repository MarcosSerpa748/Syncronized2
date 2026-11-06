package org.example;

public class Bilheteria {
    private String nomeFilme;
    private Integer quantidadeIngressos;


    public Bilheteria(String nomeFilme,Integer quantidadeIngressos){
        this.nomeFilme = nomeFilme;
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public synchronized void comprarIngresso(){
        try{Thread.sleep(1000);}catch (InterruptedException e){IO.println("Thread "+Thread.currentThread().getName()+" interrompida");}

        if (this.quantidadeIngressos > 0){
            this.quantidadeIngressos--;
            IO.println("Ingresso comprado com sucesso para o filme "+this.nomeFilme+". Ingressos restantes:"+this.quantidadeIngressos);
        }else{
            IO.println("Não foi possível realizar a compra! Ingressos esgotados para o filme "+this.nomeFilme);
        }
    }
}
