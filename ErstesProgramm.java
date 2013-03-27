/*
  ###PROGRAMMKOPF###
  
  Grundrechenarten
  
  FS23
  Marc Freytag
  Version: 1
  20121016
  addiert, subtrahiert, multipliziert und dividiert zwei ganze Zahlen

*/

public class ErstesProgramm
{
  // ###HAUPTFUNKTION###
  public static void main(String[] args )
  {
    // ###DEKLARATIONSTEIL###
    int zahl1 = 0, zahl2 = 0;
    int ergebnisaddition = 0;
    int ergebnissubtraktion = 0;
    int ergebnismultiplikation = 0;
    int ergebnisdivision = 0;
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine ganze Zahl ein:");
    // wartet auf Eingabe einer Zahl
    zahl1 = Tastatur.liesInt();
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine zweite ganze Zahl ein:");
    // wartet auf Eingabe einer Zahl
    zahl2 = Tastatur.liesInt();
    // addiere zahl1 und zahl2 und speichere es in ergebnisaddition
    ergebnisaddition = zahl1 + zahl2;
    // subtrahiere zahl2 von zahl1 und speichere es in ergebnissubtraktion
    ergebnissubtraktion = zahl1 - zahl2;
    // multipliziere zahl1 und zahl2 und speichere es in ergebnismultiplikation
    ergebnismultiplikation = zahl1 * zahl2;
    // dividiere zahl2 durch zahl1 und speichere es in ergebnisdivision
    ergebnisdivision = zahl1 / zahl2;
    // gibt Text auf Bildschirm aus
    System.out.print("Ergebnisse der Berechnungen lauten: \n");
    // gibt die Ergebnisse untereinander aus
    System.out.print(zahl1 + " + " + zahl2 + " = " + ergebnisaddition + "\n");
    System.out.print(zahl1 + " - " + zahl2 + " = " + ergebnissubtraktion + "\n");
    System.out.print(zahl1 + " * " + zahl2 + " = " + ergebnismultiplikation + "\n");
    System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisdivision + "\n");
  }
}