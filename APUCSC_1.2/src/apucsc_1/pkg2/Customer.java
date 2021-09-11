package apucsc_1.pkg2;

import java.util.ArrayList;
import sun.security.krb5.internal.Ticket;

public class Customer 
{
    private String id,name, email, phoneNo;

    public Customer(String id, String name, String email, String phoneNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    
}
