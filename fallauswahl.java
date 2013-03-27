/*
  ### PROGRAMMKOPF ###
  Uebungen zu Fallauswahl
  Beispielprogramm
  
  FS23
  Marc Freytag;
  Version 1.1
  20121107
  
  ### ENDE PROGRAMMKOPF ###
*/

// class fallauswahl wird eingeleitet
public class fallauswahl
{
   // ### HAUPTFUNKTION ###
   public static void main(String[] args)
   {
      // ### DEKLARATIONSTEIL ###
      int wahl;
      // ### ENDE DEKLARATIONSTEIL ###
      // gibt drei Auswahlmoeglichkeiten
      System.out.println( "1 fuer Textausgabe A  ");
      System.out.println( "2 fuer Textausgabe B  ");
      System.out.println( "3 fuer Textausgabe C  ");
      System.out.print( "\nWaehlen Sie aus:  ");
      // Auswahl ueber Tastatur der Variablen wert zuweisen
      wahl = Tastatur.liesInt();
      // Anfang switch-Anweisung
      switch (wahl) 
         {
         // falls 1 gewaehlt, gib folgendes aus
         case 1: 
         System.out.println("Sie haben die Textausgabe A gewaehlt");
         // beendet switch-Aufgabe falls 1 gewaehlt
         break;
         // falls 2 gewaehlt, gib folgendes aus   
         case 2: 
         System.out.println("Sie haben die Textausgabe B gewaehlt");
         // beendet switch-Aufgabe falls 2 gewaehlt
         break;
         // falls 3 gewaehlt, gib folgendes aus
         case 3: 
         System.out.println("Sie haben die Textausgabe C gewaehlt");
         // beendet switch-Aufgabe falls 3 gewaehlt
         
         // falls weder 1 noch 2 noch 3, gib folgendes aus
         default: 
         System.out.println("Fehleingabe");
         }     // Ende der switch-Anweisung
         
         // Auswirkung einer fehlenden break Funktion:
         // Es werden Befehle des nächsten case-Blocks ausgefuehrt,
         // bis zum naechsten break
         
         
         
   } 
} 