package com.example;

import java.util.Arrays;
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

        // En fonction de la valeur choisie par l'ûtilisateur
        switch (choice) {
            // Si c'est 1
            case 1:
                // Attend une saisie de l'utilisateur
                System.out.println("Entrez un code de couleur hexadécimal");
                scanner.nextLine();
                String hexString = scanner.nextLine();
                // Convertit le code couleur entré par l'utilisateur en trois valeurs rouge, vert, bleu
                // Affiche le résultat dans la console
                System.out.println(Arrays.toString( hexToRgb(hexString) ));
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
                // Convertit les trois valeurz de rouge, vert, bleu entrées par l'utilisateur en code hexadécimal
                // Afiche le résultat dans la console
                System.out.println( rgbToHex(red, green, blue) );
                break;

            // Si ce n'est ni 1, ni 2
            default:
                System.out.println("Saisie invalide!");
        }
    }

    /**
     * Transforme un code de couleur hexadécimal en rouge, vert, bleu
     * 
     * @param hexString Le code hexadécimal à convertir
     * @return Un tableau de trois valeurs rouge, vert, bleu
     */
    public static int[] hexToRgb(String hexString) {
        int[] rgbArray = new int[] {
            Integer.valueOf(hexString.substring(0, 2), 16),
            Integer.valueOf(hexString.substring(2, 4), 16),
            Integer.valueOf(hexString.substring(4, 6), 16),
        };
        return rgbArray;
    }

    /**
     * Transforme des valeurs de rouge, vert, bleu en code hexadécimal
     * 
     * @param red   Valeur du canal rouge
     * @param green Valeur du canal vert
     * @param blue  Valeur du canal bleu
     * @return Le code hexadécimal correspondant aux trois canaux rouge, vert bleu
     */
    public static String rgbToHex(int red, int green, int blue) {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}
