/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi;

/**
 *
 * @author mrezk
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User rezeke = new User("a","b",1,true);

        rezeke.setUsername("rezeke");
        rezeke.setPassword("apaKabar");
        rezeke.setId(123832748);
        rezeke.setStatus(true);

        System.out.println("Username: " + rezeke.getUsername());
        System.out.println("Password: " + rezeke.getPassword());
        System.out.println("Id: " + rezeke.getId());
        System.out.println("Status: " + rezeke.getStatus());
    }

}
