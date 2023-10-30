package TodoApp;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class MarkedDoneTask {
    public static void markDone() {
        Scanner sc = new Scanner(System.in);
        TaskList.viewTasks();
        //output ulit sa task list
        
        JustText.MarkedDone();
        //tanong ulit anog task ang i mamark as done
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber >= 1 && taskNumber <= TaskList.getTaskCount()) {
        	//tapos ito ulit yung checker kung greater equals 1 or lessthan equals 1
        	
        	JustText.TimeDone();
        	//kung kelan natapos
            String doneDateStr = sc.nextLine();

            SimpleDateFormat dateFormat = JustText.dateFrmt();
            Date doneDate = null;

            try {
                doneDate = dateFormat.parse(doneDateStr);
            } catch (ParseException e) {
            	JustText.parseE();
            	//pag mali date format dito ulit papasok
            	return;
            }
            
            // Call markTaskAsDone method from TaskList to mark the task as done.
            TaskList.markTaskAsDone(taskNumber, doneDate);
            JustText.Done();
        } 
        
        else {
        	JustText.invalid();
        	//pag wala ulit sa pag pipilian invalid task number
        }
    }
}
