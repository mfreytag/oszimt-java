/*
  ### PROGRAMMKOPF ###
  
  Lineare Programmierung
     Aufgabe 6
     
  FS23
  Marc Freytag
  Version: 1
  20121017
  addiert, subtrahiert, multipliziert und dividiert zwei Zahlen
  wird wiederholt mit while
  ### ENDE PROGRAMMKOPF ###
*/

public class aslp6while
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args )
  {
    // ### DEKLARATIONSTEIL ###
    // float - Variablen werden deklariert und der Wert 0 zugewiesen
    float zahl1 = 0f, zahl2 = 0f;
    float ergebnisaddition = 0f;
    float ergebnissubtraktion = 0f;
    float ergebnismultiplikation = 0f;
    float ergebnisdivision = 0f;
    char repeat;
    // ### ENDE DEKLARATIONSTEIL ###
    
    do
    {
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine Zahl ein:");
    // wartet auf Eingabe einer Zahl
    zahl1 = Tastatur.liesInt();
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine zweite Zahl ein:");
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
    System.out.print("   Addition \n");
    System.out.print(zahl1 + " + " + zahl2 + " = " + ergebnisaddition + "\n");
    System.out.print("   Subtraktion \n");
    System.out.print(zahl1 + " - " + zahl2 + " = " + ergebnissubtraktion + "\n");
    System.out.print("   Multiplikation \n");
    System.out.print(zahl1 + " * " + zahl2 + " = " + ergebnismultiplikation + "\n");
    System.out.print("   Division \n");
    System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisdivision + "\n");
    System.out.println("Wiederholen? j/n");
    repeat = Tastatur.liesChar();  
      
       while(repeat != 'j' && repeat != 'n') 
          {
          System.out.println("Fehleingabe... j/n?");
          repeat = Tastatur.liesChar();
          }
    
    }while(repeat == 'j');
    System.out.println("Ende des Programms");  
  }
  // ### ENDE HAUPTFUNKTION ###
}