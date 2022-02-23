/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author manav
 */
public class TestUserprofile {
    public static void main(String []args){
        UserProfile newprofile=new UserProfile();
        newprofile= new UserProfile("9891", "Comedy");
        System.out.println(newprofile.getUserID());
        System.out.println(newprofile.getGenre());
        
    }
}
