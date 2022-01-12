package com.example;

import java.util.Scanner;

/**
 * Point d'entrée de l'application
 */
public class App {
    /**
     * Processus principal de l'applcation
     * 
     * @param args La liste des arguments passés en ligne de commande
     */
    public static void main(String[] args) {
        // Crée un gestionnaire qui permet d'écouter les saisies utilisateur dans la console
        Scanner scanner = new Scanner(System.in);

        // Attend une saisie de l'utilisateur
        System.out.println("1. Entrer un code de couleur hexadécimal");
        System.out.println("2. Entrer trois valeurs rouge, vert, bleu");
        int choice = scanner.nextInt();

        Color color;
        // En fonction de la valeur choisie par l'ûtilisateur
        switch (choice) {
            // Si c'est 1
            case 1:
                // Attend une saisie de l'utilisateur
                System.out.println("Entrez un code de couleur hexadécimal");
                scanner.nextLine();
                String hexString = scanner.nextLine();
                // Convertit le code couleur entré par l'utilisateur en trois valeurs rouge, vert, bleu
                color = new Color(hexString);
                break;

            // Si c'est 2
            case 2:
                // Attend une saisie de l'utilisateur
                System.out.println("Entrez une valeur de rouge:");
                int red = scanner.nextInt();
                // Attend une saisie de l'utilisateur
                System.out.println("Entrez une valeur de vert:");
                int green = scanner.nextInt();
                // Attend une saisie de l'utilisateur
                System.out.println("Entrez une valeur de bleu:");
                int blue = scanner.nextInt();
                // Convertit les trois valeurs de rouge, vert, bleu entrées par l'utilisateur en code hexadécimal
                color = new Color(red, green, blue);
                break;

            // Si ce n'est ni 1, ni 2
            default:
                // Libère le gestionnaire de saisies utilisateur
                scanner.close();
                // Termine prématurément l'application avec un message d'erreur
                throw new IllegalArgumentException("Invalid user input.");
        }
        
        // Libère le gestionnaire de saisies utilisateur
        scanner.close();
        // Affiche le résultat dans la console
        System.out.println( color.asRgb() );
        System.out.println( color.asHex() );

    }
}
