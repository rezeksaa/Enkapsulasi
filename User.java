/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author mrezk
 */
public class User {
    private String username;
    private String password;
    private int id;
    private boolean status;
    
    public User(String Username, String Password, int id, boolean status){
        this.username = Username;
        this.password = Password;
        this.id = id;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
  
    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status ? "Menikah" : "Belum Menikah";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}   