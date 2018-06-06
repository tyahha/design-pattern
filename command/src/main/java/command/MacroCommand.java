package command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        for ( Command c: commands) {
            c.execute();
        }
    }

    public void append(Command cmd) {
        commands.push(cmd);
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
