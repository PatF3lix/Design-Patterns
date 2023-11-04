public class Client {

    public static void print(IteratorInterface iterator){
        while(!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }



    public static void main(String[] args)
    {
        System.out.println("\n***Iterator Pattern Demo");
        SubjectInterface Sc_subject = new Science();
        SubjectInterface art_subject = new Art();

        IteratorInterface sc_Iterator = Sc_subject.createIterator();
        IteratorInterface art_Iterator = art_subject.createIterator();

        System.out.println("\nScience subjects:");
        print(sc_Iterator);
        System.out.println("\nArt subjects:");
        print(art_Iterator);


    }
}