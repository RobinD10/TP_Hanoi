/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuToursHanoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import tp2.PileEntiers;

/**
 *
 * @author dijou
 */
public class Hanoi {

    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers("P1");                                       //On crée l'objet P1 qui est une pile d'entiers de PileEntiers
        PileEntiers P2 = new PileEntiers("P2");                                       //On crée l'objet P2 qui est une pile d'entiers de PileEntiers
        PileEntiers P3 = new PileEntiers("P3");                                       //On crée l'objet P3 qui est une pile d'entiers de PileEntiers
                     
        int n = Initialisation();                                                     //On affecte à n le nombre d'entiers que nous retourne la méthode Initialisation

        Remplissage(P1, n);                                                           //On appelle la méthode Remplissage créé en dessous
        Deplacement(n, P1, P2, P3);                                                   //On appelle la méthode Déplacement créé en dessous 
    }
    
    private static int Initialisation() {                                             //Cette méthode permet saisir le nombre n de disques souhaité par l'utilisateur
        Scanner in = new Scanner(System.in);
        System.out.println("Donnez un nombre de disques : ");
        
        int n = in.nextInt();

        while (n <= 0) {                                                              //Si jamais cette utilisateur donne un nombre inférieur ou égal à 0
            System.out.print("Veuillez saisir un nombre supérieur à 0" + "\n");       //Alors cela retourne un message d'erreur
            n = in.nextInt();
        }
        return n;                                                                     //Une fois le nombre de disques valable, la méthode nous retourne n
    }

    private static void Remplissage(PileEntiers P1, int n) {                          //Cette méthode nous permet de remplir la première pile, ici P1, avec n entiers 
                                                                                    
        ArrayList<Integer> Pile = P1.getList();

        Random nombre = new Random();                                

        for (int i = 0; i < n; i++) {                                                 //Un entier étant égal à un disque, on génère donc autant de nombres aléatoires qu'il n'y a de disques
            P1.Empiler(nombre.nextInt(100));                                          //Ces entiers sont compris entre 0 et 100, et on les affecte à la première pile P1
        }
        Collections.sort(Pile, Collections.reverseOrder());                           //Permet de trier ces entiers par ordre décroissant (soit de mettre les disques du plus grand au plus petit)
    }

    private static void Deplacement(int n, PileEntiers P1, PileEntiers P2, PileEntiers P3) {            //Cette méthode nous permet de résoudre le jeu en utilisant le raisonnement par récursivité
        if (n == 1) {
            System.out.println("Déplace le disque " + n + " de la tour " + P1 + " à la tour " + P3);    //On affiche chacune des étapes d'empilement et de dépilement 
        } else {
            Deplacement(n - 1, P1, P3, P2);
            System.out.println("Déplace le disque " + n + " de la tour " + P1 + " à la tour " + P3);
            Deplacement(n - 1, P2, P1, P3);
        }
    }
}
