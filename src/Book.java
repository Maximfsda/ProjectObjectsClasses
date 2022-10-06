public class Book {

    private String name;
    private Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return author.toString() + ": " + name + ": " + yearPublication;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Book)) return false;
        Book p = (Book) obj;
        if (name.equals(p.name)) {
            if (author.equals(p.author)) {
                if (yearPublication == (p.yearPublication)) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name,author,yearPublication);
    }
}


