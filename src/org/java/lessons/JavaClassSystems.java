package org.java.lessons;

/*
- Slasse in cui salviamo quanti studenti usano windows, mac e linux
- Calcoliamo la percentuale del totale degli studenti
- INPUT: quanti utenti windows mac linux
- OUTPUT: percentuale utenti windows mac linux
 */

public class JavaClassSystems {
    public static void main(String[] args) {
// variabili di cui avrò biosgno
 int totalUsers;
 int windowsUsers;
 int macUsers;
 int linuxUsers;

 double percWindows;
 double percMac;
 double percLinux;

 // assegno il valore delle variabili
        windowsUsers = 23;
        macUsers = 2;
        linuxUsers =2;
        totalUsers = 27;

 // calcolo il numero totale degli utenti
        totalUsers = windowsUsers + macUsers + linuxUsers;
        System.out.println("Windows users: " + windowsUsers);
        System.out.println("Mac users: " + macUsers);
        System.out.println("Linux users: " + linuxUsers);
        System.out.println("Total users: " + totalUsers);

 //calcolo percentuale (numero/totale)
        percWindows = (double) windowsUsers/totalUsers*100;
        percMac = (double) macUsers/totalUsers*100;
        linuxUsers = (double) linuxUsers/totalUsers*100;

        System.out.println("Percentuale Windows: " + percWindows);
        System.out.println("Percentuale Mac: " + percMac);
        System.out.println("Percentuale Linux: " + percLinux);
        //per sapere se il calcolo ha funzionato devo farlo io a parte
       // - valori attesi: %Windows= 85,185 %Mac e %Linux =7,40


    }
}
