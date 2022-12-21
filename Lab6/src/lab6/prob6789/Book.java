package lab6.prob6789;

public class Book implements Printable{
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Название - " + title + ", автор - " + author);
    }
}
