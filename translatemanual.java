import java.util.*;

public class translatemanual {

    static HashMap<String, String> dictionary = new HashMap<>();

    public static void display() {
        System.out.println(" DISPLAYING THE WORDS THAT WILL BE TRANSLATED:");
        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }
    }
 static Scanner sc = new Scanner (System.in);
    public static void translateWord(Scanner sc) {
        System.out.println("Enter the English sentence to translate(AS DISPLAYED):");
        String input = sc.nextLine().toUpperCase().trim();
        

        if (dictionary.containsKey(input)) {
            System.out.println("Bengali Translation: " + dictionary.get(input));
        } else {
            System.out.println("Translation not found in dictionary.");
        }
    }

    public static void displayTranslated() {
        System.out.println("ALL TRANSLATED WORDS:");
        for (String key : dictionary.keySet()) {
            System.out.println(key + " : " + dictionary.get(key));
        }
    }

    public static void store(){
        System.out.println("Enter the English word you want to add to the dictionary:");
        String eng= sc.nextLine().toUpperCase().trim();
        System.out.println("Enter the Benagli translation of the word:");
        String ben= sc.nextLine();
        dictionary.put(eng,ben);
        System.out.println("Word added to the dictionary successfully.");

    }

    public static void exitProgram() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        dictionary.put("HELLO", "Namaskar");
        
        dictionary.put("GOOD MORNING", "Shuprobhat");
         
        dictionary.put("HOW ARE YOU?", "Apni kamon achen?");
         
        dictionary.put("WHAT IS YOUR NAME?", "Apnar nam ki?");
         
        dictionary.put("WHERE ARE YOU FROM? ", "Apnar bari kothay?");
         
        dictionary.put("WHAT IS THE TIME NOW ?", "Akhon kota baje?");

        int choice;

        while (true) {

            System.out.println("\n----- MENU -----");
            System.out.println("1. SHOW THE WORDS THAT WILL BE TRANSLATED");
            System.out.println("2. TRANSLATE A WORD INTO BENGALI");
            System.out.println("3. DISPLAY ALL TRANSLATED WORDS");
            System.out.println("4. ADD A NEW WORD TO THE DICTIONARY");
            System.out.println("5. EXIT");

            System.out.print("Enter your choice(1-5 AS DISPLAYED ABOVE): ");
           try{
            choice = Integer.parseInt(sc.nextLine());
            

            switch (choice) {

                case 1:
                    display();
                    break;

                case 2:
                    translateWord(sc);
                    break;

                case 3:
                    displayTranslated();
                    break;

                 case 4:
                    store();
                    break;    

                case 5:
                    exitProgram();
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }}
        
                
            catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        }
    }
}