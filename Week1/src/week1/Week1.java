package week1;

import com.mdweb.verzamelapp.Bierdopje;
import com.mdweb.verzamelapp.Postzegel;
import com.mdweb.verzamelapp.Set;
import com.mdweb.verzamelapp.SetManager;
import com.mdweb.verzamelapp.Voorwerp;
import java.util.Scanner;

public class Week1 {
    public static SetManager manager = SetManager.getSingletonObject();
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("Welkom bij de (MD Web) verzamelapp\n"
                + "---\n"
                + "Maak eerst een nieuwe collectie aan.");
        addSet();
    }
    
    private static void goToMenu(){
        System.out.println("Wat wilt u doen:\n"
                + "Voor voorwerp toevoegen toets 1\n"
                + "Voor collectie bekijken toets 2\n"
                + "Voor collectie toevoegen toets 3\n"
                + "Voor afsluiten toets 4");
        int choice = scanner.nextInt();
        if(choice == 4) System.exit(0);
        if(choice == 3){
            addSet();
        }
        else{
        Set set = chooseSets();
        if(set == null) goToMenu();
        else{
            switch (choice) {
                case 1:
                    addVoorwerp(set);
                    break;
                case 2:
                    showVoorwerpen(set);
                    break;
                default:
                    goToMenu();
                    break;
            }
        }
        }
    }
    
    private static Set chooseSets(){
        System.out.println("Kies een collectie:");
        for(Set s : manager.setList){
            System.out.println("Voor " + s.getNaam() + " toets " + s.getId());
        }
        int choice = scanner.nextInt();
        for(Set s : manager.setList){
            if(s.getId() == choice) return s;
        }
        
        return null;
    }
    
    private static void addSet(){
        System.out.println("Voer de naam van uw collectie in:");
        String collectieNaam = scanner.next();
        System.out.println("Voer het jaar van uw collectie in:");
        int jaar = scanner.nextInt();
        
        Set set = new Set(collectieNaam,jaar);
        manager.addSet(set);
        System.out.println("Collectie aangemaakt!");
        
        System.out.println("Wilt u een meteen een voorwerp toevoegen? (y/n)");
        String answer = scanner.next();
        if(answer.toLowerCase().equals("y")) addVoorwerp(set);
        else goToMenu();
    }
    
    private static void addVoorwerp(Set set) {
        System.out.println("Kies een voorwerp:\n"
                + "Voor postzegel toets 1\n"
                + "Voor bierdopje toets 2");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Kies een lengte:");
                int lengte = scanner.nextInt();
                System.out.println("Kies een breedte:");
                int breedte = scanner.nextInt();
                set.addVoorwerp(new Postzegel(lengte,breedte));
                break;
            case 2:
                System.out.println("Kies een merk:");
                String merk = scanner.next();
                set.addVoorwerp(new Bierdopje(merk));
                break;
            default:
                goToMenu();
                break;
        }
        System.out.println("---");
        goToMenu();
    }
    
    private static void showVoorwerpen(Set set){
        for(Voorwerp v : set.getVoorwerpen()) {
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
        goToMenu();
    }
}
