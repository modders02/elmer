package TodoApp;

import java.util.Scanner;

public class ModifyTask {
    public static void modifyTask() {
        Scanner sc = new Scanner(System.in);
        //i output muna list ng task
        TaskList.viewTasks();
        
        //tsnong kung what number want i modify
        JustText.Mod();
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber >= 1 && taskNumber <= TaskList.getTaskCount()) {
        	/*dito sa block ay dinedefine kung ang 
        	 * taskNumber ay mas mataas o equals sa 1 o
        	 * mas mababa o kaparehas ng number ng mga tasks sa listahan
        	 * na nakuha gamit ang TaskList.getTaskCount().
        	 */
        	JustText.description();
        	//enter new discription
            String newDescription = sc.nextLine();
            
            JustText.validDate();
            //Tapos yung date ulit
            String newDueDate = sc.nextLine();
            
            //icacall natin yung nasa loon ng Tasklist
            //para ma proccess yung modification
            TaskList.modifyTask(taskNumber, newDescription, newDueDate);
            
            JustText.TaskMod();
            //task modified na
        } else {
        	JustText.invalid();
        	//pag wala sa listahan invalid task number sya
        }
    }
    
}
