/*
  ###PROGRAMMKOPF###
  
  Berechnung Zimmergröße
  
  FS23
  Marc Freytag
  Version: 1
  20121016
  Berechnung der Quadratmeter zweier Längenwerte

*/

public class aslp1
{
  // ###HAUPTFUNKTION###
  public static void main(String[] args )
  {
    // ###DEKLARATIONSTEIL###
    float zahl1 = 0f, zahl2 = 0f;
    float quadratmeter = 0f;
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie die Länge des Raumes ein:");
    // wartet auf Eingabe einer Zahl
    zahl1 = Tastatur.liesFloat();
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie die Breite des Raumes ein:");
    // wartet auf Eingabe einer Zahl
    zahl2 = Tastatur.liesFloat();
    // multipliziere zahl1 und zahl2 und speichere es in quadratmeter
    quadratmeter = zahl1 * zahl2;
    // gibt Text auf Bildschirm aus
    System.out.print("Ergebnis der Berechnung lautet: \n");
    // gibt die Ergebnisse untereinander aus
    System.out.print("Länge (m): " + zahl1 + "\n");
    System.out.print("Breite (m): " + zahl2 + "\n");
    System.out.print("Das Zimmer hat " + quadratmeter + "qm" + "\n");
  }
}