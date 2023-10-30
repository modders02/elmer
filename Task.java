package TodoApp;
import java.util.Date;

public class Task {
    private String description;
    private String dueDate;
    private Date dueDateObj;
    private Date doneDate;
    private Date timestamp;


    public Task(String description, String dueDate, Date dueDateObj, Date timestamp) {
        this.description = description;
        this.dueDate = dueDate;
        this.dueDateObj = dueDateObj;
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Date getDueDateObj() {
        return dueDateObj;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public Date getTimestamp() {
        return timestamp;
    }
}
