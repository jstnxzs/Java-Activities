/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author PRIX
 */
public class advanced {
    
    public static void main(String[] args) {
        
        String username = "justinexd123";
        String password = "justineqt123";
        boolean accountlocked = true;

        if (username.equals("justinexd123")) {
            if (password.equals("justineqt123")) {
                if (accountlocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        // Test 1: Wrong username
        username = "justine123";
        password = "justineqt123";
        accountlocked = true;

        if (username.equals("justinexd123")) {
            if (password.equals("justineqt123")) {
                if (accountlocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        // Test 2: Wrong password
        username = "justinexd123";
        password = "justine1223";
        accountlocked = true;

        if (username.equals("justinexd123")) {
            if (password.equals("justineqt123")) {
                if (accountlocked) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }

        // Test 3: Account is not locked
        username = "justinexd123";
        password = "justineqt123";
        accountlocked = true;

        if (username.equals("justinexd123")) {
            if (password.equals("justineqt123")) {
                if (accountlocked) {
                    System.out.println("Login successful!: Account is not locked");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }
    }
}

        
    
    
