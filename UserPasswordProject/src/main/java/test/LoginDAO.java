package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LoginDAO 
{
public int k=0;
public int insert(BeanClass bc)
{
	Connection con=DBConnection.getCon();
try
{
	PreparedStatement ps=con.prepareStatement("insert into u58 values(?,?)");
	ps.setString(1, bc.getUserName());
	ps.setString(2, bc.getPassWord());
k=ps.executeUpdate();
} catch(Exception e) {{e.printStackTrace();}

}
return k;
}}

