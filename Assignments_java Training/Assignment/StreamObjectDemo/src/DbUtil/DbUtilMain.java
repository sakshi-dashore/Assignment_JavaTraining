package DbUtil;

import java.sql.SQLException;

public class DbUtilMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//DbUtil db = DbUtil.getInstance();
	

		DbUtil db = DbUtil.getInstance();
//		DbUtil db1 = DbUtil.getInstance();
//		DbUtil db2 = DbUtil.getInstance();
		db.getConnection();
	


	}

}
