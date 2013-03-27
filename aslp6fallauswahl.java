/*
  ### PROGRAMMKOPF ###
  
  Lineare Programmierung;
  Fallauswahl
     Aufgabe 3
     
  FS23
  Marc Freytag
  Version: 1.1
  20121106
  addiert, subtrahiert, multipliziert und dividiert zwei Zahlen
  mit Fallauswahl

  ### ENDE PROGRAMMKOPF ###
*/

public class aslp6fallauswahl
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
    float ergebnisdivrest = 0f;
    // char Variable fuer switch-Anweisung
    char wahl = ' ';
    // ### ENDE DEKLARATIONSTEIL ###
    
    
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine Zahl ein: ");
    // wartet auf Eingabe einer Zahl
    zahl1 = Tastatur.liesInt();
    // gibt Text auf Bildschirm aus
    System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
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
    // dividiere zahl2 durch zahl1 und speichere Rest in ergebnisdivrest
    ergebnisdivrest = zahl1 % zahl2;
    // gibt Text auf Bildschirm aus
    System.out.print("Welche Operation soll durchgeführt werden? \n Auswahl: \n1. +\n2. -\n3. *\n4. /\n5. %\n Ihre Eingabe: ");
    wahl = Tastatur.liesChar();
    // Beginn der switch-Anweisung
    switch (wahl) 
    {
      case '+':
      case '1': 
      System.out.print("   Addition gewaehlt\n");
      System.out.print(zahl1 + " + " + zahl2 + " = " + ergebnisaddition + "\n");
      break;
      case '-':
      case '2': 
      System.out.print("   Subtraktion gewaehlt\n");
      System.out.print(zahl1 + " - " + zahl2 + " = " + ergebnissubtraktion + "\n");
      break;
      case '*':  
      case '3': 
      System.out.print("   Multiplikation gewaehlt\n");
      System.out.print(zahl1 + " * " + zahl2 + " = " + ergebnismultiplikation + "\n");
      break;
      case '/':
      case '4': 
      System.out.print("   Division gewaehlt\n");
      System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisdivision + "\n");
      break;
      case '%':
      case '5':
      System.out.print("   Divisionsrest gewaehlt\n");
      System.out.print(zahl1 + " / " + zahl2 + " = " + ergebnisdivrest + "\n");
      break;
      default: 
      System.out.print(" Fehleingabe ");
    } // Ende der switch-Anweisung
    System.out.print(" Ende ");
    
    
    
  }
  // ### ENDE HAUPTFUNKTION ###
}