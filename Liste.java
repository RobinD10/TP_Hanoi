/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;

/**
 *
 * @author dijou
 */
public class Liste {

    private ArrayList<Object> Liste;
    private int position;

    public Liste() {                                                       //Constructeur de Liste
        this.Liste = new ArrayList<>();                                    //On crée l'objet Liste comme une ArrayList d'objets
    }

    public void Premier() {                                                //Se positionne sur le premier objet de la liste
        position = 0;
    }

    public void Dernier() {                                                //Se positionne sur le dernier objet de la liste
        position = this.Liste.size() - 1;
    }

    public Object Suivant() {                                              //Retourne l’objet suivant de celui sur lequel on est positionné.
        if (this.position > this.Liste.size() || this.position < 0) {      //Si jamais on se trouve sur le dernier objet ou que la liste est vide
            System.out.println("La liste est vide ou pleine");             //Alors on retourne un message d'erreur et un objet vide
            return null;
        } 
        else {
            this.position++;
            return this.Liste.get(position);
        }
    }

    public Object Supprimer() {                                            //Supprime et retourne l'objet sur lequel on est positionné
        Object element = null;
        if (this.Liste.size() <= 0) {                                      //Si la liste est vide
            System.out.println("La liste est vide");                       //Alors on retourne un message d'erreur et un objet vide
            return null;
        } 
        else {
            element = Liste.remove(position);
            return element;
        }
    }

    public void Ajouter(Object element) {                                  //Ajoute un objet à la suite de l'élément sur lequel on est positionné
        this.Liste.add(position + 1, element);
    }
}

