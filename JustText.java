package TodoApp;

import java.text.SimpleDateFormat;

public class JustText {
	static void MainHeader() {
        System.out.printf("%50s%n", "ToDo List App");

	}
	static void Arr() {
		String[] arr = {"1. Add Task", "2. View Task", "3. Mark Task as Done", "4. Modify Task", "5. Quit"};
        System.out.println(String.join("\n", arr));
        System.out.print("Enter your choice: ");
	}
	static void Case5() {
        System.out.println("Goodbye!");

	}
	static void def() {
        System.out.println("Invalid choice. Please enter a valid option.");
        
	}
	static void newTask() {
        System.out.print("\nEnter a new task: ");
        
	}
	static SimpleDateFormat dateFrmt() {
		return new SimpleDateFormat("dd-MM-HH:mm");
	}
	static void validDate() {
        System.out.print("Enter the due date and time (DD-MM-HH:mm): ");

	}
	static void parseE() {
        System.out.println("Invalid date format. Please use DD-MM-HH:mm format.");

	}
	static void TaskAdd() {
        System.out.printf("\n%50s%n", "Task Added!.\n");

	}
	static void anotherTask() {
        System.out.print("Do you want to add another task? (yes/no): ");

	}
	static void Mod() {
        System.out.print("Enter the task number to modify: ");

	}
	static void description() {
        System.out.print("Enter the new task description: ");

	}
	static void TaskMod() {
        System.out.println("Task modified.");

	}
	static void invalid() {
        System.out.println("Invalid task number.");

	}
	static void MarkedDone() {
        System.out.print("Enter the task number to mark as done: ");

	}
	static void TimeDone() {
        System.out.print("Enter the date and time when the task was done (DD-MM-HH:mm): ");

	}
	static void Done() {
        System.out.println("Task marked as done.");

	}
	
	static void noTask() {
        System.out.println("No tasks in the list.");

	}
	static void Todo() {
        System.out.println("\nTo-Do List:");

	}
	static void line() {
        System.out.println("+-----------------+");

	}

}

