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
public class Pile {

    ArrayList<Integer> Pile;                                   
    Liste maListe;
    
    public Pile(){                                                //Constructeur de Pile
        this.Pile = new ArrayList();                              //On crée l'objet Pile comme une ArrayList d'entiers
        this.maListe = new Liste();                               //On crée l'objet maListe comme une Liste
    }
    
    public void Empiler(Object element){                          //Empile les objets sur la Pile
       this.Pile.add((Integer) element);
    }
            
    public Object Depiler(){                                      //Dépile les objets de la Pile
       if(this.Pile.size() <= 0){                                 //Si jamis la Pile est vide 
           System.out.println("La pile est vide");                //Alors cela nous retourne un message d'erreur
           return null;
       }
       else{
           Object temp = this.Pile.get(this.Pile.size() - 1);
           this.Pile.remove(temp);
           return temp;
       }
    }
    
    public ArrayList<Integer> getList(){                          //Retourne la pile d'entiers contenu dans l'Arraylist
       return Pile; 
    }
}