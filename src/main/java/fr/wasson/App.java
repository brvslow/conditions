package fr.wasson;

import java.util.Scanner;   // Import de la librairie pour utiliser un scanner

public class App {
    
    public static void main(String[] args) {

        // Initialisation des variables
        final int QUOTA = 10; // Constante : nombre de ventes
        int salaireDeBase = 400; 
        int prime = 250;
        int salaireFinal = 0;
        int ventesManquantes = 0;

        // Récuperer le nombre de ventes
        System.out.print("Quel est votre nombre de ventes ? "); // Affichage

        Scanner sc = new Scanner(System.in); // Initialisation du scanner
        int nbVente = sc.nextInt(); // Interaction de l'utilisateur, l'utilisateur entre son nombre de vente
        sc.close(); // Fermeture du scanner

        // Test : prime ou pas ?
        if (nbVente >= QUOTA) { // le nombre de ventes supérieur à 10 ;)

            salaireFinal = salaireDeBase + prime; // La prime est ajouté au salaire de base
            
            // Affichages
            System.out.println("Félititation ! Vous avez remplie le quota de vente !");
            System.out.println("Votre salaire est de : " + salaireFinal + "€");

        } else { // Le nombre de ventes est inférieur à 10 :'(

            salaireFinal = salaireDeBase;
            ventesManquantes = QUOTA - nbVente; // Calcul du nombre de ventes manquants pour atteindre le quota de vente minimum pour toucher la prime

            // Affichages
            System.out.println("Hello World !"); // Commentaite bidon
            
            System.out.println("Malheuresement, vous n'avez pas remplie le quota de vente !");
            System.out.println("Votre salaire est de : " + salaireFinal + "€");
            System.out.println("Il vous manque : " + ventesManquantes + " vente(s)");

        }
    }
}
