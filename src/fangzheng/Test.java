package fangzheng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月27日上午10:13:24
 */
public class Test {
	public static void main(String[] args) {
		System.err.println("test1");
		System.err.println("test2");
		System.gc();
//		System.gc();
//		NumberFormatException e = new NumberFormatException();
//		throw e;
	}
	public void testException() throws SQLException{
		File f = new File("test.xml");
		FileInputStream in;
		try {
			in = new FileInputStream(f);
			while(in.read() != -1)
				System.out.println(in.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Connection conn = DriverManager.getConnection("","sa","sa"); 
		Statement stm = conn.createStatement(); 
	    stm.executeUpdate(""); 
		
		
		
		
	}
	public static int testTry(){
		try{
			System.out.println("hehe");
			return 2;
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			System.out.println("hhe");
		}
		return 1;
	}
}
