public class Book {
  private int bookId;
  private String details;

  public Book(){}
  public Book(int bookId, String details){
    this.bookId = bookId;
    this.details = details;
  }

  public void setBookId(int id){
    bookId = id;
  }
  public int getBookId(){
    return bookId;
  }

  public void setDetails(String details){
    this.details = details;
  }

  public String getDetails(){
    return details;
  }
}