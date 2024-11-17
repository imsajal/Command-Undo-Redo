package org.example;

import java.util.Stack;

public class Remote {


    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory ;
    private Stack<Command> redoHistory ;

    public Remote(int noOfCommands) {
        this.onCommands = new Command[noOfCommands];
        this.offCommands = new Command[noOfCommands];
        commandHistory = new Stack<>();
        redoHistory = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot){
        commandHistory.push(onCommands[slot]);
        onCommands[slot].execute();
        redoHistory.clear();
    }

    public void pressOffButton(int slot){
        commandHistory.push(offCommands[slot]);
        offCommands[slot].execute();
        redoHistory.clear();
    }

    public void undo(){
        if(commandHistory.size() > 0){
            Command lastCommand = commandHistory.pop();
            redoHistory.push(lastCommand);
            lastCommand.undo();
        }
    }

    // redo is only done when aleast one undo is there
    public void redo(){
        if(redoHistory.size() > 0){
            Command lastUndoCommand = redoHistory.pop();
            commandHistory.push(lastUndoCommand);
            lastUndoCommand.execute();
        }
    }
}
