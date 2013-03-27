/*
  ### PROGRAMMKOPF ###
  
  Schleifen
     Aufgabe 1c
     
  FS23
  Marc Freytag
  Version: 1.2
  20121130
  bestimmt arithmetisches Mittel von eingegebenen Zahlen
  Berechnung durch Eingabe einer 0

  ### ENDE PROGRAMMKOPF ###
*/

public class while1c
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args )
  {
    // ### DEKLARATIONSTEIL ###
    float eingabe = 0, ergebnis = 0, zaehler = -1;
    // ### ENDE DEKLARATIONSTEIL ###
    System.out.println("Geben Sie Zahlen ein: ");
    // leitet fussgesteuerte Schleife ein
    do
    {
      // zaehler erhoeht sich um 1 pro Durchlauf
      zaehler = zaehler + 1;
      // Eingabe einer Zahl pro Durchlauf
      eingabe = Tastatur.liesInt();
      // eingegebene Zahl wird zu ergebnis addiert
      ergebnis = ergebnis + eingabe;
      // Ende der Schleife wird eingeleitet mit der Bedingung
      // sie zu wiederholen, wenn eingabe ungleich 0
    }while( eingabe != 0);
    System.out.println("Berechne arithmetisches Mittel");
    // zaehler ist die Anzahl der eingegebenen Zahlen
    // Summe der eingegebenen Zahlen dividiert durch Anzahl
    ergebnis = ergebnis / zaehler;
    // Ausgabe des arithmetischen Mittels
    System.out.println("Ergebnis: " + ergebnis);
  }
  // ### ENDE HAUPTFUNKTION ###
}