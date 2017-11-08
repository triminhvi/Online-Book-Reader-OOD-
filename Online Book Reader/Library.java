import java.awt.print.Book;
import java.util.HashMap;

public class Library {
  private HashMap<Integer, Book> books;

  //Add Book
  public Book addBook(int id, String details){
    if(books.containsKey(id)){
      return null;
    }
    Book book = new Book(id, details);
    books.put(id, book);
    return book;
  }

  //Remove Book

  public boolean remove(Book b){
    return remove(b.getID());
  }

  public boolean remove(int id){
    if(!books.containsKey(id)){
      return false;
    }
    books.remove(id);
    return true;
  }

  public Book findBook(int id){
    return books.get(id);
  }
}