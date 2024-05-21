package web.service;

import java.util.*;

public class LoginService {
    
    public boolean login(String username, String password, Date dob) {
        
        if (username.equals("ahsan") && password.equals("ahsan_pass")&& dob.equals("2003-03-30")) {
            

if (dob != null) {
                return true;
            }
        }
        return false;
    }
}
