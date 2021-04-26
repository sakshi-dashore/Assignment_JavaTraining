import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Type4Demo {
	public static void main(String aa[]) {
		try {
			FileReader reader = new FileReader("db.properties");

			Properties properties = new Properties();
			properties.load(reader);

			Class.forName(properties.getProperty("driver"));

			Connection con = DriverManager.getConnection(properties.getProperty("url"),
					properties.getProperty("username"), properties.getProperty("password"));

			Statement st = con.createStatement();

//			ResultSet rs = st.executeQuery("Select * from emp");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//			}

//			int rs = st.executeUpdate("insert into emp values (3,'Nikhil',299)");
			int rs = st.executeUpdate("update emp set name='Rajeev', salary=100000 where id=3");

			if (rs == 1)
				System.out.println("updated.");
			else
				System.out.println("Not updated.");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
