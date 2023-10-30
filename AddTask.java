package TodoApp;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class AddTask {
    public static void addTask() {
        Scanner sc = new Scanner(System.in);

        while (true) {
        	//enter new task na tapos naglagay ako while para pag gusto pa yes lang ng yes
        	JustText.newTask();
            String task = sc.nextLine();
            
            //tapos yan gamit lang method para makagawa object tapos nasa just text kasunod
            SimpleDateFormat dateFormat = JustText.dateFrmt();
            Date dueDate = null;
            boolean validDueDate = false;

            while (!validDueDate) {
            	//pag mali yung date format balik ulit sa input date
            	JustText.validDate();
                String dueDateStr = sc.nextLine();

                try {
                    dueDate = dateFormat.parse(dueDateStr);
                    validDueDate = true;
                } catch (ParseException e) {
                	JustText.parseE();
                	//to naman pag mali date format, e na para lahatan
                }
            }

            TaskList.addTask(task, dateFormat.format(dueDate));
            JustText.TaskAdd();
            //task added na
            
            JustText.anotherTask();
            String anotherTask = sc.nextLine().toLowerCase();
            if (anotherTask.equals("no")) {
            	//tanong kung gusto ba mag input pa
            	//pag yes balik sa umpisa
                break;
            }
 
        }
    }
}
