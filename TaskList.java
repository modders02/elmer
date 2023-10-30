package TodoApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class TaskList {
	//most here nasa method ng Task naka define
    private static ArrayList<Task> toDoList = new ArrayList<>();

    public static void addTask(String description, String dueDate) {
        SimpleDateFormat dateFormat = JustText.dateFrmt();
        Date dueDateObj = null;

        try {
            dueDateObj = dateFormat.parse(dueDate);
        } catch (ParseException e) {
            JustText.parseE();
            return;
        }
        
        //dito sa block, organizer depend of timestamp or sa oras ng input ng user kung ano nauna ayun ang mauuna

        Date timestamp = new Date();

        Task task = new Task(description, dueDate, dueDateObj, timestamp);
        toDoList.add(task);

        Collections.sort(toDoList, new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return task1.getTimestamp().compareTo(task2.getTimestamp());
            }
        });
    }

    public static void viewTasks() {
    	/*
    	 * dito ishoshow nya yung task pero nasa loob ng box
    	 */
        if (toDoList.isEmpty()) {
            JustText.noTask();
        } else {
            for (int i = 0; i < toDoList.size(); i++) {
                Task task = toDoList.get(i);
                String formattedText = formatTextInBox(i + 1 + ". " + task.getDescription(), "Due: " + task.getDueDate());
                System.out.println(formattedText);
            }
        }
    }

    private static String formatTextInBox(String text, String dueDate) {
    	/*
    	 * ito naman ang mag poprocess ng box para sa list ng task
    	 */
        int maxLength = Math.max(text.length(), dueDate.length());
        StringBuilder horizontalLine = new StringBuilder("+");
        for (int i = 0; i < maxLength + 4; i++) {
            horizontalLine.append("-");
        }
        horizontalLine.append("+");

        StringBuilder formattedText = new StringBuilder("| ");
        formattedText.append(text);
        int padding1 = maxLength - text.length();
        for (int i = 0; i < padding1; i++) {
            if (i % 2 == 0) {
                formattedText.insert(0, ' ');
            } else {
                formattedText.append(' ');
            }
        }
        formattedText.append(" | ");

        int padding2 = maxLength - dueDate.length();
        formattedText.append(dueDate);
        for (int i = 0; i < padding2; i++) {
            if (i % 2 == 0) {
                formattedText.insert(formattedText.length(), ' ');
            } else {
                formattedText.append(' ');
            }
        }

        formattedText.append(" |");
        return horizontalLine.toString() + "\n" + formattedText.toString() + "\n" + horizontalLine.toString();
    }





	public static void markTaskAsDone(int taskNumber, Date doneDate) {
		/*
		 * ito yung method na icacall sa MarkTask as done 
		 * ito ang mag po process para mamarked ng done
		 */
        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
            Task task = toDoList.get(taskNumber - 1);
            task.setDoneDate(doneDate);
            toDoList.remove(taskNumber - 1);
        } 
        
        else {
        	JustText.invalid();
        }
    }

    public static void modifyTask(int taskNumber, String newDescription, String newDueDate) {
    	/*
    	 * ito naman yung icacall natin na mag po process ng modification
    	 */
        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
            Task task = toDoList.get(taskNumber - 1);
            task.setDescription(newDescription);
            task.setDueDate(newDueDate);

            // Reorganize ulit ng tasks by due date and time after modification.
            Collections.sort(toDoList, new Comparator<Task>() {
                @Override
                public int compare(Task task1, Task task2) {
                    return task1.getDueDateObj().compareTo(task2.getDueDateObj());
                }
            });
        } 
        
        else {
        	JustText.invalid();
        }
    }

    public static int getTaskCount() {
        return toDoList.size();
    }
    public static void displayTaskList() {
        int maxLength = 0;
        for (Task task : toDoList) {
            if (task.getDescription().length() > maxLength) {
                maxLength = task.getDescription().length();
            }
        }

        
    }
}