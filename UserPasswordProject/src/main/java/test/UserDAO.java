package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO 
{
public int k=0;
public int insert(BeanClass bc)
{
Connection con=DBConnection.getCon();
try {
	PreparedStatement ps=con.prepareStatement("insert into u58 values(?,?)");
	ps.setString(1, bc.getUserName());
	ps.setString(2, bc.getPassWord());
	k=ps.executeUpdate();
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return k;
}

}
