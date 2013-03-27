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

public class while1a
{
  // ### HAUPTFUNKTION ###
  public static void main(String[] args )
  {
    int sum = 0;
    int n;
    n = Tastatur.liesInt();
    if (n > 0) 
    {
      do
      {
        sum = sum + n;
        n = n-1;  
      }while(n != 0);
      System.out.println("Summe = " + sum);
    }
    else 
    {  
      System.out.println("Nur positive ganze Zahlen");
    }
    System.out.println("Ende des Programms");  
  }
  // ### ENDE HAUPTFUNKTION ###
}