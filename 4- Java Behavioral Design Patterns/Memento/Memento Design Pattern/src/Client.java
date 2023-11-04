

public class Client {

    public static void main(String[] args)

    {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");

        System.out.println("\n***FileWriter Data ****");
        //enter some data
        fileWriter.write("First Set of Data: \nFinal Fantasy 7\nFinal Fantasy 8\nFinal Fantasy 9\n");
        //save data
        caretaker.save(fileWriter);

        //print content
        System.out.println(fileWriter+"\n");

        //now progress and enter a second set of data
        fileWriter.write(("\nSecond Set of Data: \nFinal Fantasy 10"));

        //print content
        System.out.println(fileWriter+"\n");

        //let's undo to last save
        caretaker.undo(fileWriter);

        //print content
        System.out.println(fileWriter+"\n");



    }
}