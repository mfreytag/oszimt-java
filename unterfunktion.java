/*   freytagm.fs23
     20120219
     Addiert zwei Zahlen mit Hilfe von Unterfunktionen
*/

public class addition
{
  public static void hinweis()
  {
    System.out.println("Hinweis: ");
    System.out.println("Das Programm addiert zwei eingegebene Zahlen ");  
  }  
  public static double eingabe(int i)
  {
    double u_zahl;
    System.out.println( i + ". Zahl:");
    u_zahl = Tastatur.liesDouble();
    return u_zahl;
  }  
  public static double verarbeitung(double u_zahl1, double u_zahl2)
  {
    double u_erg;
    u_erg = u_zahl1 + u_zahl2;
    return u_erg;
  }
  public static void ausgabe(double u_erg, double u_zahl1, double u_zahl2)
  {
    System.out.println("Ergebnis der Addition");
    System.out.println( u_erg + " = " + u_zahl1 + " + " + u_zahl2);
  }  
  public static void main(String[] args)
  {
    double zahl1 = 0.0, zahl2 = 0.0, erg = 0.0;
    //Programmhinweis
    addition.hinweis();
    //Eingabe
    zahl1 = addition.eingabe(1);
    zahl2 = addition.eingabe(2);
    //Verarbeitung
    erg = addition.verarbeitung(zahl1, zahl2);
    //Ausgabe
    addition.ausgabe(erg, zahl1, zahl2);
  }
}



Methoden
Funktionen/Methoden werden nicht nur in Java, sondern auch in vielen anderen Programmiersprachen verwendet. Wenn Sie von einer anderen Sprache nach Java gewechselt haben, kennen Sie Methoden möglicherweise auch unter den Namen Subroutine, Unterprogramm oder Subfunktion.

Was sind Methoden/Funktionen?
Methoden sind kleine Unterprogramme, mit denen Sie Teilprobleme einer größeren Aufgabe lösen können. In der Praxis können SIe sich das so vorstellen: Eine Funktion führt eine komplizierte Berechnung aus, eine andere Funktion schreibt das Ergebnis der Berechnung in eine Datei und wieder eine andere überprüft das Ergebnis auf Fehler. Die parallele Ausführung von Methoden ist allerdings nicht möglich. Methoden werden also in der Regel wie normale Anweisung auch nur sequenziell, das heißt nacheinander, ausgeführt.

Weshalb Methoden?
Methoden haben eine Menge Vorteile, einige der wichtigsten sind:
Mit Methoden lässt sich der Quellcode besser lesen
Der Code kann durch Erstellen einer Klassenbibliothek wieder verwertet werden
Ständig sich wiederholende Routinen können in eine Methode gepackt werden und müssen nicht immer wieder neu geschrieben werden.
Fehler und Veränderungen lassen sich daher auch schneller finden bzw. ausbessern, da der Code nur an einer Stelle bearbeitet werden muss
Im Laufe dieses Textes wird noch ein wenig genauer auf die Vorteile eingegangen

Definition von Methoden
Die allgemeine Syntax für Methoden sieht folgendermaßen aus:
public static Rückgabetyp Methodenname(Parameterliste) //Methodenkopf
{
  /* Methodenrumpf mit Anweisungen */
}
Wenn Sie sich die Syntax ansehen, erkennen Sie darin vielleicht auch die Hauptfunktion main():
public static void main(String[] args)
Eine Methodendefinition setzt sich auch dem Methodenkopf und dem Methodenrumpf zusammen. Der Methodenkopf gliedert sich in folgende Bereiche auf:
Rückgabetyp - Hier legen Sie den Datentyp des Rückgabewertes fest. Dabei dürfen alle bisher kennen gelernten Datentypen verwendet werden. Eine Funktion ohne Rückgabewert wird als void deklariert.
Methodenname - Dies ist ein eindeutiger Methodenname, mit dem Sie die Methode von einer anderen Stelle aus im Programmcode aufrufen können. Für den Methodennamen selbst gelten dieselben Regeln wie für Variablen.
Parameterliste - Die Parameter einer Methode sind optional. Sie werden durch Datentyp und Namen spezifiziert und durch ein Komma getrennt. Wird kein Parameter verwendet, dürfen Sie zwischen die Klammern nichts schreiben.
Der Methodenrumpf oder Anweisungsblock behält dieselbe Funktion wie immer (in der main()-Funktion). In diesem werden also wie gehabt Deklarationen von Variablen und Anweisungen ausgeführt.

public static void hilfe()
{
  System.out.println("Ich bin die Hilfsfunktion\n");
}
Die Methode hat keinen Rückgabetyp und keine(n) Parameter. Aufgerufen wird sie zum Beispiel mit
  Klassenname.hilfe();
innerhalb der main()-Funktion. Sehen Sie sich den Quellcode dazu an:
public class Modularisierung
{
  public static void hilfe(void)
  {
     System.out.println("Ich bin die Hilfsfunktion\n");
  }
  public static  void main(String[] args)
  {
     Modularisierung.hilfe();
  }
}

Durch den Aufruf von hilfe() in der main()-Methode wird die Methode hilfe ausgeführt und gibt einen Text auf dem Bildschirm aus.

Merke: Ein Java-Programm beginnt immer mit der main()-Funktion. Ohne die main()-Methode wäre ein Programm nicht lauffähig.
Eine Grafik soll dies veranschaulichen:

Durch den Methodenaufruf wird zuerst zur ersten Anweisung der Methode gesprungen. Nach der letzten Anweisung in der Methode können Sie sich einen Rücksprungbefehl hinzu denken. Mit diesem Rücksprungbefehl wird zur nächsten Anweisung nach dem Methodenaufruf zurückgesprungen.

Lokale Variablen

Die lokalste Variable ist immer die Variable in der jeweiligen Methode. Lokale Variablen, die in einer Methode deklariert wurden, sind außerhalb dieser Methode nicht gültig. Sehen Sie sich kurz ein Beispiel an:

public class Modularisierung
{
  public static void aendern()
  {
     int zahl = 111;
     System.out.println("In der Methode aendern: " + zahl);
  }
  public static void main(String[] args)
  {
     int zahl = 333;
     System.out.println(i);
     Modularisierung.aendern();
     System.out.println(i);
  }
}
Die neu definierte Variable zahl in der Methode aendern() hat keinen Einfluss auf die gleichnamige Variable zahl in der main()-Funktion. Bringen Sie zum Beispiel die Methode in die folgende Form:
  void aendern(void)
  {
     zahl = 111;
     System.out.println("In der Methode aendern: " + zahl);
  }

In diesem Fall würde sich das Programm nicht übersetzen lassen, da die Variable zahl noch nicht deklariert wurde. In einer Methode müssen Sie eine Variable vor ihrer Verwendung zuerst deklarieren.

Datenaustausch zwischen Methoden
Eine Methode soll so programmiert werden, dass diese auch für eine allgemeine Verwendung ausgelegt ist. Dafür gibt es in der Regel drei Möglichkeiten.
Methoden mit Wertrückgabe
Methoden mit Wertparameterübergabe
Methoden mit der Übergabe eines Arrays oder Objekts
Mit der Wertrückgabe geben Sie Daten aus einer Methode heraus (Datenfluss aus der Methode heraus), und mit der Wertparameterübergabe durch Parameter übergeben Sie einer Methode Daten (Datenfluss in die Methode hinein). Mit der Übergabe eines Arrays wird ein bidirektionaler Datenaustausch (Datenfluss in die Methode und wieder heraus) realisiert. Die Methode wirkt sich somit auf das Original.

Wertparameterübergabe an Methoden (call-by-value)

Es folgt ein Beispiel, wie Sie einer Methode Daten übergeben können:
public class Modularisierung
{
  public static void halbieren(int zahl)
  {
     zahl = zahl / 2;
     System.out.println("Halbiert: " + zahl );
  }
  public static void verdoppeln(int zahl)
  {
     zahl = zahl * 2;
     System.out.println("Verdoppelt: " + zahl);
  }
  public static void main(String[] args)
  {
     int wahl, z;
     System.out.println("Bitte geben Sie eine Zahl ein: ");
     z = Tastatur.liesInt();
     System.out.println("Wollen Sie diese Zahl?\n");
     System.out.println("\t1.) verdoppeln\n\t2.) halbieren\n\nIhre Wahl: ");
     wahl = Tastatur.liesInt();
     switch(wahl)
     {
        case 1 : Modularisierung.verdoppeln(z);
           break;
        case 2 : Modularisierung.halbieren(z);
           break;
        default : System.out.println("Unbekannte Eingabe\n");
     }
  }
}

An der Definition der Methode können Sie schon erkennen, dass die Methode einen Parameter vom Datentyp int verwendet.
Ein Blick auf eine Funktion:
  public static void halbieren(int zahl)
  {
     zahl = zahl / 2;
     System.out.println("Halbiert: " + zahl );
  }

Es handelt sich also um eine Funktion, die als Parameter einen int Wert übernimmt. Das bedeutet, dass Sie die Methode halbieren() nur mit einem Argument vom Typ int aufrufen können. Andernfalls meldet der Compiler einen Fehler.

Aufgerufen wird diese Methode (von einer anderen Methode aus) mit einem Argument, auch formaler Parameter genannt. Im gezeigten Beispiel sieht der Methodenaufruf mit Argument folgendermaßen aus:
  halbieren(z);
Der Inhalt der Variablen z aus der main()-Funktion wird an die Methode halbieren übergeben, d.h. der Aufruf erfolgt mit einem Argument. Der Wert wird an den Parameter der Methode übergeben. Mit anderen Worten der Inhalt der Variablen z wird an die Variable zahl der Methode kopiert. Damit steht der Methode das Argument z als Kopie zur Verfügung. Die Methode kann nun mit den Parametern ganz normal arbeiten. Der Parameter einer Methode ist bei einer so genannten call-by-value-Übergabe eine Kopie des Werts, mit dessen Argument Sie die Methode aufgerufen haben. Wird der Wert in der Variablen zahl innerhalb der Methode verändert, so bleibt der Wert der Variablen z in der main()-Funktion unverändert.

Nochmals die vier Schritte, wie der Datenfluss bei Übergabe von Argumenten abläuft:

Bei der Methodendefinition wird die Parameterliste festgelegt (formale Parameterliste).
Die Methode wird von einer anderen Methode mit dem Argument aufgerufen (muss mit dem Typ des formalen Parameters übereinstimmen).
Für die Methode wird ein dynamischer Speicherbereich (im Stack) angelegt.
Jetzt kann die Methode mit den Parametern arbeiten.

Natürlich können Sie auch mehrere Parameter in einer Methode verwenden. Als Anwendungsbeispiel soll im Folgenden der gregorianische Kalender zum julianischen umgerechnet werden. Dieses Verfahren wird vorwiegend in der Astronomie und Raumfahrt genutzt.
Der julianische Kalender beginnt mit der ägyptischen Berechnung seit dem 1.1.4713 vor Christus. Mit dem julianischen Datum lässt sich sehr gut die Sonnen- bzw. Mondfinsternis berechnen:


/* Umrechnung vom gregorianischen zum julianischen Datum */
public class Kalender
{
  public static void gre2jul(int tag, int monat, int jahr)
  {
     int k, l, jd;
     k = (monat -14) / 12;
     l = jahr + k + 4800
     jd = tag - 32075 + 1461 * l / 4 + 367 * ((monat-2-12*k) / 12) - 3 * (( l + 100) / 100 ) / 4;
     System.out.println(" sind " + jd + "Tage vergangen\n");
  }
  public static void main(String[] args)
  {
     int tag, monat, jahr;
     System.out.println("Eingabe (Tag): ");
     Tastatur.liesInt(tag);
     System.out.println("Eingabe (Monat): ");
     Tastatur.liesInt(monat);
     System.out.println("Eingabe (Jahr): ");
     Tastatur.liesInt (jahr);
     System.out.println("Seit dem 1.1.4713 v. Chr. bis " + tag + "." + monat + "." + jahr);
     Kalender.gre2jul(tag, monat, jahr);
  }
}

Wichtig ist dabei, dass Sie darauf achten, die Argumente beim Methodenaufruf in der richtigen Reihenfolge anzugeben. Vertauschte Werte führen zu falschen Berechnungen. Die Parameter könnten auch von unterschiedlichen Datentypen sein, was der Compiler im Fall der Vertauschung in den meisten Fällen aber moniert.

Ergebnisrückgabe von Methoden

Jetzt haben Sie gesehen, wie es möglich ist, Daten an eine Methode zu übergeben. Nun wollen Sie natürlich noch wissen, wie eine Methode so geschrieben wird, dass diese Daten an den Aufrufer zurück gibt.

Zunächst benötigen Sie eine Methodendefinition mit einem Rückgabewert. Als Rückgabewert können Sie jeden beliebigen Datentyp verwenden. Zum Beispiel:

public static double addition(double a, double b)
{
  return (a+b);
}
Sie erkennen an dieser Methode durch das Voranstellen des Datentyps, dass hier der Rückgabewert ein double ist. Und in der Methode selbst wird mit der Anweisung

  return (a+b);

das Ergebnis der Addition beider Variablen als Wert an die aufrufende Methode zurückgeliefert. Diese return-Anweisung dient aber nicht nur dazu, der aufrufenden Methode einen Wert zurückzuliefern, sondern setzt zugleich das Ende einer Methode fest. Bei return wird also die Kontrolle an die aufrufende Methode zurückgegeben. Dabei kann ein Wert zurückgegeben werden. Jetzt wird noch der Aufrufer selbst mit seinen Argumenten benötigt:

double erg = 0;
...
erg = addition(wert1, wert2);

Damit wird der Variablen erg, die zwingend vom Datentyp double sein muss, der Rückgabewert der Methode addition() zugewiesen. Das vollständige Programm sähe dann folgendermaßen aus:

public class Modularisierung
{
  public static double addition(double a, double b)
  {
     return (a+b);
  }
  public static void main(String[] args)
  {
     double erg, zahl1, zahl2;
     System.out.println("Bitte geben Sie die 1. Zahl ein: ");
     zahl1 = Tastatur.liesDouble();
     System.out.println("Bitte geben Sie die 2. Zahl ein: ");
     zahl2 = Tastatur.liesDouble();
     erg = Modularisierung.addition(zahl1, zahl2);
     System.out.println("Das Ergebnis der Addition lautet: " + erg);
  }
}

Übergabe eines Arrays oder Objekts

Es folgt ein Beispiel, wie Sie einer Methode alle Daten eines Arrays übergeben können:

public class Modularisierung
{
  public static void ausgabe (double zahl[])
  {
     for(int i = 0; i < zahl.length; i++)
     {
        System.out.println("Array["+ i +"] : " + zahl[i]);
     }
  }
  public static void halbieren (double zahl[])
  {
     for(int i = 0; i < zahl.length; i++)
     {
        zahl[i] = zahl[i] / 2.0;
        System.out.println("Halbiert : "+ zahl[i]);
     }
  }
  public static void main(String[] args)
  {
     double feld[] = {1.5,2.5,3.5};
     Modularisierung.ausgabe(feld);
     Modularisierung.halbieren(feld);
     Modularisierung.ausgabe(feld);
  }
}

An der Definition der Methode ausgabe() können Sie schon erkennen, dass die Methode ein Array als Parameter mit dem Datentyp double verwendet.
Ein Blick auf eine Funktion:
  public static void ausgabe (double zahl[])
  {
     for(int i = 0; i < zahl.length; i++)
     {
        System.out.println("Array["+ i +"] : " + zahl[i]);
     }
  }

Es handelt sich also um eine Funktion, die als Parameter ein Array mit dem Datentyp double übernimmt. Das bedeutet, dass Sie die Methode ausgabe() nur mit einem Array mit dem Datentyp double als Argument aufrufen können. Andernfalls meldet der Compiler eine Fehler. Im gezeigten Beispiel sieht der Methodenaufruf mit Argument folgendermaßen aus:
  Modularisierung.ausgabe(feld);
Das Array aus der main()-Funktion wird an die Methode halbieren übergeben, d.h. der Aufruf erfolgt mit einem Argument. Es wird kein einzelner Wert an den Parameter der Methode übergeben, sondern es wird ein Zugriff auf das originale Array "feld[]" der main()-Funktion ermöglicht. Die Methode kann nun mit den Parametern ganz normal arbeiten. Der Parameter eines Arrays / Objekts ist ein Verweis auf das Originalarray mit dessen Argument Sie die Methode aufgerufen haben. Werden die Werte in dem Array zahl innerhalb der Methode verändert, so werden diese im Originalarray verändert. Es wird mit dem Array feld in der main()-Funktion gearbeitet. Nach dem Aufruf der Methode halbieren() sind die einzelnen Werte vom Array feld halbiert.

Hinweis
Bitte beachten Sie, dass bei der Übergabe eines Arrays oder eines Objekts auf die Originaldaten zugegriffen wird. Änderungen der Daten im Unterprogramm verändern somit die Originaldaten.

