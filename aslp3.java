/*
  ### PROGRAMMKOPF ###
  
  Lineare Programmierung
     Aufgabe 3
  
  FS23
  Marc Freytag
  Version: 1.3
  20121019
  Berechnung des Bezugspreises für Einzelhändler

  ### ENDE PROGRAMMKOPF ###
*/

// class aslp3 wird eingeleitet
public class aslp3
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args )
  {
    // ### DEKLARATIONSTEIL ###
    // Variablen werden deklariert
    // int steht für Integerzahlen
    // float für Kommazahlen
    // double Variablen sind doppelt so groß wie float
    // allen float Variablen wird der Wert 0f (f für float) zugewiesen
    // int hundert bekommt den Wert 100
    int hundert = 100;
    float listeneinkaufspreis = 0f;
    float lieferantenrabatt = 0f;
    float lieferantenskonto = 0f;
    float bezugskosten = 0f;
    float zieleinkaufspreis = 0f;
    float bareinkaufspreis = 0f;
    float bezugspreis = 0f;
    float lrabatt = 0f;
    float lrab = 0f;
    float lskonto = 0f;
    float lsko = 0f;
    // ### ENDE DEKLARATIONSTEIL ###
    
    // gibt Text auf Bildschirm aus, System.out.println() auch möglich
    System.out.print("Listeneinkaufspreis (EUR): ");
    // wartet auf Eingabe eines Eurobetrags via Tastatur.lies.Int/Float
    listeneinkaufspreis = Tastatur.liesFloat();
    // gibt Text auf Bildschirm aus
    System.out.print("Lieferantenrabatt     (%): ");
    // wartet auf Eingabe einer Prozentzahl
    lieferantenrabatt = Tastatur.liesFloat();
    // gibt Text auf Bildschirm aus
    System.out.print("Lieferantenskonto     (%): ");
    // wartet auf Eingabe einer Prozentzahl
    lieferantenskonto = Tastatur.liesFloat();
    // gibt Text auf Bildschirm aus
    System.out.print("Bezugskosten        (EUR): ");
    // wartet auf Eingabe eines Eurobetrags
    bezugskosten = Tastatur.liesFloat();
    
    // Platzhalter: \n fügt einen Zeilenumbruch ein
    System.out.print("\n\n");
    // weitere Steuerungszeichen:
    //  /a  Bell
    //  /b  Backspace
    //  /f  Form Feed (Seitenvorschub)
    //  /r  Carriage Return
    //  /t  Tabulator horizontal
    //  /v  Tabulator vertikal
    //  \\  Backslash
    //  \'  Apostroph
    //  \"  Anführungszeichen
    //  \?  Fragezeichen
    //
    
    // Berechnung Lieferantenrabatt
    // Java rechnet von rechts nach links, Ergebnisvariable also immer links
    // Divisionszeichen: "/"
    lrabatt = listeneinkaufspreis / hundert;
    // Multiplikationszeichen: "*"
    lrab = lrabatt * lieferantenrabatt;
    
    // formatierte Ausgabe der vorhergehenden Berechnung
    // System.out.printf bzw System.out.format geben Variablen formatiert aus
    // Bsp: %10.2f
    // % an dieser Stelle wird die Variable formatiert eingefügt
    // 10 Stellen für Formatierung reserviert
    // .2f float Variable wird auf zwei Nachkommastellen gerundet
    System.out.printf(" Listeneinkaufspreis: %10.2f Euro \n", listeneinkaufspreis);
    System.out.printf(" - Lieferantenrabatt: %10.2f Euro \n \n", lrab);
    
    // Berechnung Zieleinkaufspreis und Lieferantenskonto
    zieleinkaufspreis = listeneinkaufspreis - lrab;
    lskonto = zieleinkaufspreis / hundert;
    lsko = lskonto * lieferantenskonto; 
    
    // formatierte Ausgabe der vorhergehenden Berechnungen
    System.out.printf(" Zieleinkaufspreis:   %10.2f Euro \n", zieleinkaufspreis);
    System.out.printf(" - Lieferantenskonto: %10.2f Euro \n \n", lsko);
    
    // Berechnung Bareinkaufspreis
    // Subtraktionszeichen: "-"
    bareinkaufspreis = zieleinkaufspreis - lsko;
    
    // formatierte Ausgabe
    System.out.printf(" Bareinkaufspreis:    %10.2f Euro \n", bareinkaufspreis);
    System.out.printf(" + Bezugskosten:      %10.2f Euro \n \n", bezugskosten);
    
    // Berechnung Bezugspreis
    // Additionszeichen: "+"
    bezugspreis = bareinkaufspreis + bezugskosten;
    // weitere Operatoren:
    //  %   Restwert (Rest der ganzzahligen Division)
    //  +   Positives Vorzeichen, z.B. +4
    //  -   Negatives Vorzeichen, z.B. -4
    //  ++  Inkrement, z.B. ++a entspricht a+1 und erhöht a um 1
    //  --  Dekrement, z.B. a-- entspricht a und verringert a um 1
    
    // formatierte Ausgabe des Ergebnisses
    System.out.printf(" Bezugspreis:         %10.2f Euro \n", bezugspreis);
    System.out.print("=====================================");
    
  }
  // ### ENDE HAUPTFUNKTION ###
}