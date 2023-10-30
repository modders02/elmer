package TodoApp;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
    	
    	/*so every sysout you will see is stored on JustText because wala lang trip ko lang HAHAHAHA*/
        Scanner sc = new Scanner(System.in);
        
        //Dito i used printformat para gumitna yung title
        JustText.MainHeader();

        while (true) {
        	JustText.Arr();
        	//dito naman i used String.join see Just Text for more info

            int choice = sc.nextInt();
            sc.nextLine();
            
            //syempre better parin switch case kesa if else
            //yan puro methods nayan 
            switch (choice) {
                case 1:
                    AddTask.addTask();
                    break;
                case 2:
                    ViewTask.viewTasks();
                    break;
                case 3:
                    MarkedDoneTask.markDone();
                    break;
                case 4:
                    ModifyTask.modifyTask();
                    break;
                case 5:
                	JustText.Case5();
                    System.exit(0);
                    break;
                default:
                	JustText.def();
                    break;
            }
        }
    }
}
