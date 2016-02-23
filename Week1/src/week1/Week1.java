/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import com.mdweb.verzamelapp.Bierdopje;
import com.mdweb.verzamelapp.Postzegel;
import com.mdweb.verzamelapp.Set;
import com.mdweb.verzamelapp.Voorwerp;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Week1 {

    public static Set verzamelApp;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welkom bij de (MD Web) verzamelapp");
        System.out.println("---");
        System.out.println("Voer de naam van uw collectie in:");
        
        String collectieNaam = scanner.next();
        
        System.out.println("Voer het jaar van uw collectie in:");
        int jaar = scanner.nextInt();
        verzamelApp = new Set(collectieNaam,jaar);
        System.out.println("Collectie aangemaakt!");
        addVoorwerp();
        
    }
    
    private static void addVoorwerp() {
        System.out.println("Wilt u een voorwerp toevoegen? (Y/n)");
        String answer = scanner.next();
        if(answer.toLowerCase().equals("y")) {
            System.out.println("Kies een voorwerp:");
            System.out.println("Voor postzegel toets 1");
            System.out.println("Voor bierdopje toets 2");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Kies een lengte:");
                    int lengte = scanner.nextInt();
                    System.out.println("Kies een breedte:");
                    int breedte = scanner.nextInt();
                    verzamelApp.addVoorwerp(new Postzegel(lengte,breedte));
                    break;
                case 2:
                    System.out.println("Kies een merk:");
                    String merk = scanner.next();
                    verzamelApp.addVoorwerp(new Bierdopje(merk));
                    break;
            }
            System.out.println("---");
            System.out.println("Huidige collectie:");
            for(Voorwerp v : verzamelApp.getVoorwerpen()) {
                String type = "";
                String info = "";
                if(v instanceof Bierdopje) {
                    type = "bierdopje";
                    info = "merk: " + ((Bierdopje) v).getMerk();
                }
                else if(v instanceof Postzegel) {
                    type = "postzegel";
                    info = "lengte: " + ((Postzegel) v).getLengteInMillimeter();
                    info += ", breedte: " + ((Postzegel) v).getBreedteInMillimeter();
                }
                System.out.println("(" + type + ") met ID: "+v.getId() + " met info: "+ info);
            }
        }
        
        addVoorwerp();
    }
}
