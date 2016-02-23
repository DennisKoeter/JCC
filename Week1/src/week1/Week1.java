/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import com.mdweb.verzamelapp.Set;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Week1 {

    public static Set verzamelApp;
    
    public static void main(String[] args) {
        System.out.println("Welkom bij de (MD Web) verzamelapp");
        System.out.println("---");
        System.out.println("Voer de naam van uw collectie in:");
        Scanner scanner = new Scanner(System.in);
        String collectieNaam = scanner.next();
        
        System.out.println("Voer het jaar van uw collectie in:");
        int jaar = scanner.nextInt();
        verzamelApp = new Set(collectieNaam,jaar);
        System.out.println("Collectie aangemaakt!");
    }
    
}
