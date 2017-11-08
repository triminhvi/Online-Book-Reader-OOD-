public class OnlineReaderSystem {
  private Library library;
  private UserManager userManager;
  private Display display;

  private Book activeBook;
  private User activeUser;

  public Library getLibrary(){
    return library;
  }

  public UserManager getUserManager(){
    return userManager;
  }

  public Display getDisplay() {
    return display;
  }

  public Book getActiveBook(){
    return activeBook;
  }

  public void setActiveBook(Book book){
    activeBook =  book;
  }

  public User getActiveUser(){
    return activeUser;
  }

  public void setActiveUser(User user){
    activeUser = user;
  }
}