/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Random;

/**
 *
 * @author dijou
 */
public class TP2 {        
    
    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers("Pile 1");                   //On crée l'objet P1 qui est une pile d'entiers de PileEntiers
        PileEntiers P2 = new PileEntiers("Pile 2");                   //On crée l'objet P2 qui est une pile d'entiers de PileEntiers
        PileEntiers P3 = new PileEntiers("Pile 3");                   //On crée l'objet P3 qui est une pile d'entiers de PileEntiers
      
        Random nombre = new Random();
        
        for (int i = 0; i < 5; i++) {                                 //On génère 5 nombres entiers aléatoires, compris entre 0 et 100, que l'on affecte à P1
           P1.Empiler(nombre.nextInt(100));
        }
         
        for (int i = 0; i < P1.Pile.size(); i++){                     //On trie chacun de ces nombres selon s'ils sont pairs ou impairs
            if ((Integer) P1.Pile.get(i) % 2 == 0){                   //Si l'entier est pair
               P2.Empiler(P1.Pile.get(i));                            //Alors on l'affecte à P2
            }
            else{
                P3.Empiler(P1.Pile.get(i));                           //Sinon on l'affecte à P3
            }
        }
        
        System.out.println("P1 : " + P1.Pile);                        //On affiche chacune des piles P1, P2 et P3
        System.out.println("P2 : " + P2.Pile);
        System.out.println("P3 : " + P3.Pile);
        }
}
    



    

