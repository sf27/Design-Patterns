package iterator;

public class Book {

    private String name;
    private String title;
    private int    year;

    public Book(String newName, String newTitle, int newYear) {
        this.name = newName;
        this.title = newTitle;
        this.year = newYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

}
