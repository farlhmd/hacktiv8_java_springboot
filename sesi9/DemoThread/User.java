package sesi9.user;

public class User {
    int id;
    private String Name, Gender, Role;

    public User(){

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getGender(){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getRole(){
        return Role;
    }
    public void setRole(String Role){
        this.Role = Role;
    }
}
