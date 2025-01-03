import java.util.*;
public class Tatak {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        //Store the task you add 
        ArrayList <String> tatak = new ArrayList <>();
        boolean gawas = false;
        
        while (!gawas) {
            //Menu of the program
            System.out.println("\nTatak-Buhat");
            System.out.println("\nPress 1 to Tatak task");
            System.out.println("\n1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("\nPick a number: ");
            int choosen = scan.nextInt();
            scan.nextLine();  
            
            switch (choosen) {
                //You can add task if you choose 1
                case 1:
                    System.out.print("Enter your Task: ");
                    String task = scan.nextLine();
                    tatak.add(task);
                    System.out.println("\nTask added");
                    System.out.println("If you want to see your task, press 2 to view");
                    break;
                case 2:
                    //You can view your task if you choose 2
                    System.out.println("Task: ");
                    for (int i = 0; i < tatak.size(); i++) {
                        System.out.println((i + 1 ) + ". " + tatak.get(i));
                        
                }
                    System.out.println("If you want to remove your task, press 3 to remove");
                    break;
                case 3:
                    //You can remove your task if you choose 3
                    System.out.print("Enter Task number to remove: ");
                    int tasknum = scan.nextInt();
                    if (tasknum > 0 && tasknum <= tatak.size()) {
                        tatak.remove(tasknum - 1);
                        System.out.println("Task removed");
                    }
                    else {
                        System.out.println("Invalid Task number");
                    }
                    break;
                case 4:
                    //Choose 4 to exit the program
                    gawas = true;
                    System.out.println("Exiting the program. Have a nice day!");
                    break;
                    
                default:
                    System.out.println("Invalid number. Please try again");
                
                    
            }
            
        }
        
    }
}