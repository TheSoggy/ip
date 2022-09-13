package duke.task;

import java.time.LocalDateTime;

import duke.Parser;

public class DeadlineTask extends Task {
    private final LocalDateTime deadline;

    public DeadlineTask(String description, LocalDateTime deadline, boolean isDone) {
        super('D', description, isDone);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return String.format("%s (by: %s)", super.toString(),
                deadline.format(Parser.DATETIME_OUTPUT_FORMAT));
    }

    @Override
    public String toData() {
        return String.format("%s | %s", super.toData(),
                deadline.format(Parser.DATETIME_INPUT_FORMAT));
    }
}
