public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Author)){
            return false;
        }
        Author p = (Author) obj;
        if (name.equals(p.name) && surname.equals(p.surname)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
