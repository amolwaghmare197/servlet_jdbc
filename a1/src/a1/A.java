package a1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.*;
import java.sql.*;

@WebServlet("/add")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
        String fname =req.getParameter("fname");
        System.out.println(fname);
        String lname =req.getParameter("lname");
        System.out.println(lname);
        String address =req.getParameter("address");
        System.out.println(address);
        int no = Integer.parseInt(req.getParameter("no"));
		System.out.println(no);
		//--------------------------
		try {
			String url ="jdbc:mysql://localhost:3306/amol";
			String user="root";
			String pass="Amol@9331";
			//-----------------
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.executeUpdate("insert into basedata values('"+id+"','"+fname+"','"+lname+"','"+address+"','"+no+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
