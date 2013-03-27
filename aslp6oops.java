/*
  ### PROGRAMMKOPF ###
  
  Lineare Programmierung
     Aufgabe 6
     
  FS23
  Marc Freytag
  Version: 1
  20121017
  addiert, subtrahiert, multipliziert und dividiert zwei Zahlen

  ### ENDE PROGRAMMKOPF ###
*/

public class aslp6
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args )
  {
    int eingabe = 0, ergebnis = 0, zaehler = 0;
    do
    {
      eingabe = Tastatur.liesInt();
      ergebnis = ergebnis + eingabe;
      zaehler = zaehler + 1;
    }while( eingabe != 0);
    ergebnis = ergebnis / zaehler;
    System.out.println("Ergebnis: " + ergebnis);
  }
  // ### ENDE HAUPTFUNKTION ###
}