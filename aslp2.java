/*
  ###PROGRAMMKOPF###
  
  Lineare Programmierung
     Aufgabe 2
  ###BROKEN###
  FS23
  Marc Freytag
  Version: 1
  20121017
  Zinszahlung

*/

public class aslp2
{
  // ###HAUPTFUNKTION###
  public static void main(String[] args )
  {
    // ###DEKLARATIONSTEIL###
    int hundert = 100;
    float einzahlung = 0f;
    float zinsen = 0f;
    float zinsen2 = 0f;
    float jahre = 0f;
    float ergebnis = 0f;
    
    
    // gibt Text auf Bildschirm aus
    System.out.print("Einzahlung (€): ");
    // wartet auf Eingabe einer Zahl
    einzahlung = Tastatur.liesInt();
    // gibt Text auf Bildschirm aus
    System.out.print("Zinsen (%): ");
    // wartet auf Eingabe einer Zahl
    zinsen = Tastatur.liesInt();
    // gibt Text auf Bildschirm aus
    System.out.print("Jahre: ");
    // wartet auf Eingabe einer Zahl
    jahre = Tastatur.liesInt();
    
    // Platzhalter
    System.out.print("\n\n");
    
    zinsen2 = zinsen / hundert;
    
    // Ausgabe des Ergebnisses
    System.out.print("Bezugspreis: " + bezugspreis + "\n");
    System.out.print("===================================");
    
  }
}