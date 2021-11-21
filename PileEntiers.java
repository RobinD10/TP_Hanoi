/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author dijou
 */
public class PileEntiers extends Pile {                            //PileEntiers hérite des caractéristiques de Pile                      
    
    private String nom = null;                                     //On déclare une variable nom comme étant un String
    
    public PileEntiers(String nom){                                //Constructeur de PileEntiers avec un paramètre nom de type String
        this.nom = nom;                                            //La variable nom déclarée précédemment est égale à ce même paramètre nom du PileEntiers 
    }
    
    @Override  
    public Integer Depiler(){                                      //Dépile les entiers de la Pile
        if(this.Pile.size() <= 0){                                 //Si jamais la pile d'entiers est vide
            System.out.println("La pile est vide");                //Alors cela retourne un message d'erreur
            return null;
        }
        else{
            Integer temp = this.Pile.get(this.Pile.size()-1);
            this.Pile.remove(temp);
            return temp;
        }
    }

    @Override
    public String toString(){                                      //Cette méthode nous permet d'attribuer le nom que l'on souhaite à chacune de nos PileEntiers
        return this.nom;                                           //Nous retourne le nom donné, dans le classe Hanoi, pour chacune des PileEntiers P1, P2 et P3 
    }
}
