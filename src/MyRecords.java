public class MyRecords {
    private int recordNumber;
    private String title;
    private  String author;
    private int year;
    private  String genre;
    public MyRecords(int recordNumber, String title, String author, int year, String genre){
        this.recordNumber =recordNumber;
        this.title=title;
        this.author=author;
        this.year=year;
       this.genre = genre;
    }
    public int getRecordNumber(){
        return recordNumber;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear(){
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public String toString() {
        return "RecordNumber: " + recordNumber + ", Title: " + title + ", Author: " + author + ", Year: " + year + ", Genre: " + genre;
    }
}
