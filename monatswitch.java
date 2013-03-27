/*
  ### PROGRAMMKOPF ###
  Uebungen zu Fallauswahl
  Beispielprogramm
  
  FS23
  Marc Freytag;
  Version 1
  20121106
  
  ### ENDE PROGRAMMKOPF ###
*/

// class monatswitch wird eingeleitet
public class monatswitch
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args)
  {
    // ### DEKLARATIONSTEIL ###
    int monat;
    // ### ENDE DEKLARATIONSTEIL ###
    System.out.print( "\nGeben Sie einen Monat ein:  ");
    // Auswahl über Tastatur der Variablen monat zuweisen
    monat = Tastatur.liesInt();
    // Anfang switch-Anweisung
    switch (monat) 
    {
      // falls 1 gewaehlt, gib folgendes aus
      case 1: 
      System.out.println("Sie haben Januar gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 1 gewaehlt
      break;
      // falls 2 gewaehlt, gib folgendes aus   
      case 2: 
      System.out.println("Sie haben Februar gewaehlt");
      System.out.println("Anzahl der Tage: 28");
      // beendet switch-Aufgabe falls 2 gewaehlt
      break;
      // falls 3 gewaehlt, gib folgendes aus
      case 3: 
      System.out.println("Sie haben Maerz gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 3 gewaehlt
      break;
      case 4: 
      System.out.println("Sie haben April gewaehlt");
      System.out.println("Anzahl der Tage: 30");
      // beendet switch-Aufgabe falls 4 gewaehlt
      break;
      case 5: 
      System.out.println("Sie haben Mai gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 5 gewaehlt
      break;
      case 6: 
      System.out.println("Sie haben Juni gewaehlt");
      System.out.println("Anzahl der Tage: 30");
      // beendet switch-Aufgabe falls 6 gewaehlt
      break;
      case 7: 
      System.out.println("Sie haben Juli gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 7 gewaehlt
      break;
      case 8: 
      System.out.println("Sie haben August gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 8 gewaehlt
      break;
      case 9: 
      System.out.println("Sie haben September gewaehlt");
      System.out.println("Anzahl der Tage: 30");
      // beendet switch-Aufgabe falls 9 gewaehlt
      break;
      case 10: 
      System.out.println("Sie haben Oktober gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 10 gewaehlt
      break;
      case 11: 
      System.out.println("Sie haben November gewaehlt");
      System.out.println("Anzahl der Tage: 30");
      // beendet switch-Aufgabe falls 11 gewaehlt
      break;
      case 12: 
      System.out.println("Sie haben Dezember gewaehlt");
      System.out.println("Anzahl der Tage: 31");
      // beendet switch-Aufgabe falls 12 gewaehlt
      break;
      // falls nicht 1-12, gib folgendes aus
      default: 
      System.out.println("Fehleingabe: Es gibt nur 12 Monate");
    }     // Ende der switch-Anweisung
    
    // Auswirkung einer fehlenden break Funktion:
    // Es werden Befehle des nächsten case-Blocks ausgefuehrt,
    // bis zum naechsten break
    
    
    
  } 
  // ### ENDE HAUPTFUNKTION
} 