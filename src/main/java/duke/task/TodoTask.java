package duke.task;

public class TodoTask extends Task {
    public TodoTask(String description, boolean isDone) {
        super('T', description, isDone);
        assert !description.isBlank();
    }
}
