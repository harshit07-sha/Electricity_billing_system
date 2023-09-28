package electricity.billing.system;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///ebs","root","Nikebrand@1");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
 