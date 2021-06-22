

import java.sql.*;

public class loginDAO {
	public static boolean value(String roll, String name) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","Hr7301$%");
		PreparedStatement st = con.prepareStatement("select * from student where rollno = ? and sname = ?");
		st.setString(1,roll);
		st.setString(2,name);
		ResultSet rs = st.executeQuery();
		
		if(rs.next()){
			return true;
		}else{
			return false;
		}
		
		
	}
}
