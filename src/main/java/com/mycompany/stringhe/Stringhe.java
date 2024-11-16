/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringhe;
import java.util.Scanner;


public class Stringhe {
    
    //metodo che conta  quante volte appare a
    public static int A(String testo) { 
        int conta=0;//variabile per contare le a
        
        for(int i=0;i<testo.length();i++){
            char parola=testo.charAt(i); //passa la parola a i
            if(parola=='a' || parola=='A'){ //confronto se e' a o A
                conta++; //incremento del conteggio
            }
        }
        return conta; //ritorna al numero da a trovate
    }
    //metodo che stampa le A in maiuscolo trovate dalla variabile conta
    public static void StampaA(int n){
        for(int i=0;i<n;i++){
            System.out.println("A"); //stampa A
        }
        System.out.println(); //per andare a capo ogni A stamnpata
    }
    //main
    public static void main(String[] args) {
        System.out.println("----EMANUELE GHEORGHIU 4INFD----");
        System.out.println("----QUESTO PROGRAMMA STAMPA LE a CONTENUTE IN UNA FRASE CHE L'UTENTE INSERISCE, E POI LE STAMPA IN MAIUSCOLO----");
        Scanner input=new Scanner(System.in);
        System.out.print("----INSERISCI UNA FRASE:----");
        System.out.println(); //legge la stringa inserita del utente
        String frase=input.nextLine();
        int NumA=A(frase); //conta le a nelle frase
        //stampa il numero di a trovate
        System.out.println("----LA LETTERE a APPARE " +NumA+ " volte");
        
        System.out.println("----IN MAIUSCOLO----");
       
        //stampa tutte le a trovate in maiuscolo
        StampaA(NumA);
       
    }
}
