import java.io.File;

public interface Command {
    void execute();

    //could add an undo or redo commands
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;
    //Some previous state for undo, string somState


    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
    //save previous state, in case undo called someState = .....;
        this.fileSystem.openFile();
    }

//    public void undo() {
//        //restore previous state
//        // myMemberVariable = previousState;
//
//    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
