package james;

import java.util.Properties;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年4月27日下午4:19:49
 */
public class Main1 {
	public static void main(String[] args) {
		Properties props = new Properties();// 传输用的协议smtp
		props.put("mail.transport.protocol", "smtp");
		   // 利用那个邮件服务发送
		   props.put("mail.smtp.host", "192.168.0.34");//自己的ip
		   // 发送的端口号
		   props.put("mail.smtp.port", "25");
		   // 是否要验证
		   props.put("mail.smtp.auth", "true");
		//收邮件更加容易：
		/*Session session = Session.getInstance(p, null);
		  Store store = null;
		   store = session.getStore("pop3");
		   store.connect("192.168.0.34", "liuxiang","1234");*/
	}
}
