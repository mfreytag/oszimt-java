/*
  ###PROGRAMMKOPF###
  
  Lineare Programmierung
     Aufgabe 4
  
  FS23
  Marc Freytag
  Version: 1
  20121017
  Berechnung Benzinverbrauch

*/
public class aslp4
{
  // ###HAUPTFUNKTION###
  public static void main(String[] args )
  {
    // ###DEKLARATIONSTEIL###
    float past = 0f, present = 0f, liter = 0f, ergebnis = 0f, kilometer = 0f, zwischenergebnis = 0f;
    
    // Dateneingabe
    System.out.print("km-Stand bei letztem Tanken: ");
    past = Tastatur.liesFloat();
    System.out.print("km-Stand beim Tanken.......: ");
    present = Tastatur.liesFloat();
    System.out.print("Benzinverbrauch (Liter)....: ");
    liter = Tastatur.liesFloat();
    
    // Berechnung
    kilometer = present - past;
    zwischenergebnis = kilometer / 100;
    ergebnis = liter / zwischenergebnis;
    
    // Ausgabe Ergebnis
    System.out.print("\n");
    System.out.print("Der PKW hat " + ergebnis + " Liter auf 100km verbraucht.");
    System.out.print("\n");
  }
  
}   