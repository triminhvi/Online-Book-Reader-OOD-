public class User {
  private int userId;
  private String details;
  private int accountType;

  public User (int id, String details, int accountType){
    this.userId = id;
    this.details = details;
    this.accountType = accountType;
  }

  public void renewMemebership(){

  }

  public int getUserId(){
    return userId;
  }

  public void setUserId(int id){
    this.userId = id;
  }

  public String getDetails(){
    return details;
  }

  public void setDetails(String details){
    this.details = details;
  }

  public int getAccountType(){
    return accountType;
  }

  public void setAccountType(int accountType){
    this.accountType = accountType;
  }
}