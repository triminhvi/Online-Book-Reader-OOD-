import java.util.HashMap;

public class UserManager {
  private HashMap<Integer, User> users;

  // addUser
  public User addUser(int id, String details, int accountType){
    if(users.containsKey(id)){
      return null;
    }
    User user = new User(id, details, accountType);
    users.put(id, user);
    return user;
  }

  //find User
  public User find(int id){
    return users.get(id);
  }

  //remove User
  public boolean remove(User u){
    return remove(u.getID());
  }

  public boolean remove(int id){
    if(!users.containsKey(id)){
      return false;
    }
    users.remove(id);
    return true;
  }
}