class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content =  new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write (String str) {
        content.append(str);
    }
    //creates the memento
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    //restores into its earlier state
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.filename;
        this.content = memento.content;
    }

    private class Memento {
        private String filename;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content){
            this.filename = fileName;
            //Notice the deep copy so that Memento and FileWriterUtil
            //content variables don't refer to the same objectS
            this.content =new StringBuilder(content);
        }
    }
}