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
      return author.getName()+ " " + author.getSurname() + ": " + name + ": " + yearPublication;
   }


}


