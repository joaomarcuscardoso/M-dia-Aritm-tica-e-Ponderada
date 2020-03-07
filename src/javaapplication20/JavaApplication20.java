/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.util.Scanner;




/**
 *
 * @author User
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas você quer digitar: ");
        int qt_nota = entrada.nextInt();
        
        // Declaração de variavéis;
        double soma = 0;
        double media_total = 0;
        int peso_total = 0;
        
        // Informação das medias;
        System.out.println("Digite o tipo de média você quer calcular. \n"
        + "0- Média ponderada \n"
        + "1- Média aritmética");
        int info_media = entrada.nextInt();
        
        if(info_media > 1) {
            System.out.println("Você digitou a média errada, por favor reinicie o sistema!!");

        } else {
        
            for(int i=1;i<=qt_nota;i++) {
                System.out.println("Qual foi a nota"+i+": ");

                double nota_i = entrada.nextInt();
                //soma += nota_i; 

                if(info_media == 0) {
                    System.out.println("Qual é o peso"+i+ ": ");
                    int peso_i = entrada.nextInt();
                    
                    soma += nota_i * peso_i;
                    peso_total += peso_i;

                    media_total = soma / peso_total;
                   

                } else {
                    soma += nota_i;
                    media_total = soma / qt_nota;



                } 

            }
            
            if(media_total >= 7) {
                System.out.println("Você passou com média "+ media_total +", parabéns!!!");
                
            } else {
                if(media_total >= 1.9) {
                    System.out.println("Você está em exame, e ficou com média "+media_total+", estude mais!!"); 
                } else {
                    
                    System.out.println("Você foi reprovado!!, e ficou com média "+media_total+", estude mais!!");
            
                }
                
            } 
        

        }


        
        
         
        
        
        
        
    }
    
}
