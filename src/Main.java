//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        Library arr;
        arr = new Library(maxSize);
        arr.insertMethod(new MyRecords(234, "How to get rich by mistake", "Shako Boy", 2013, "fiction"));
        arr.insertMethod(new MyRecords(324, "Mirrors", "Nicolas A Imalwa", 1998, "Horror"));
        arr.insertMethod(new MyRecords(244, "Comp Theory", "P Nehoa", 2014, "Education non-fiction"));
        arr.insertMethod(new MyRecords(454, "Journey of Tom", "Densel Cohan", 2000, "Autobiography"));
        arr.insertMethod(new MyRecords(104, "Intro to Emerging", "Van Kicke", 2024, "Education non-fiction"));
        arr.insertMethod(new MyRecords(54, "Advanced Coding", "Roberto K", 1999, "Education non-fiction"));
        arr.insertMethod(new MyRecords(24, "Mystery", "Will Ferris", 1978, "Fantasy"));
        System.out.println("\n Library Record list:");
        arr.display();
        System.out.println("\nSize of the library record at  initial: " + arr.size());
//REMOVE
        System.out.println("\nSearch for a record");
        String search = "Mirrors";
        MyRecords found = arr.find(search);
        if (found != null) {

            System.out.println("\nRecord found: " + found);
        }
        else{System.out.println("\nRecord you are searching does not exist.");}
            System.out.println("\nremove a Record");
            int indexToRemove = 1;
            boolean removed = arr.remove(indexToRemove);
            if (removed) {
                System.out.println("\nRecord deleted.");
                System.out.println("\nnew Updated record list:");
                arr.display();
                System.out.println("\nSize of the library after deletion: " + arr.size());
            }
            else{System.out.println("\nRecord you want to delete does not exist.");}
    }
}
