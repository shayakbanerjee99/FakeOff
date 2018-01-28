/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package newspoll;

/**
 *
 * @author shayak
 */
public class User {
    private String username, fullName, password;
    private int credits;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setFullName(String fullName){
        this.fullName = (fullName);
        
    }
    
    public void setCredits(int c){
        credits = c;
    }
    
    public int getCredits(){
        return credits;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public String getUsername(){
        return username;
    }
}
