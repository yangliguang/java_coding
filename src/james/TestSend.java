package james;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * Author:Young
 * Class Comment:
 * Date: 2016年5月4日下午3:57:04
 */
public class TestSend {
	/*public static void main(String[] args) {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName("smtp.yanglg.top"); // 邮件服务器域名
		mail.setSmtpPort(25); // 邮件服务器smtp协议端口
		mail.setAuthentication("admin", "123456"); // 邮箱账户
		mail.setCharset(Mail.ENCODEING); // 邮件的字符集

		mail.setSSLOnConnect(false); // 是否启用SSL
//		mail.setSslSmtpPort(sslSmtpPort); // 若启用，设置smtp协议的SSL端口号

		try {
			mail.setFrom("admin@yanglg.top");
			// 发件人地址
			String[] toList = {"admin@yanglg.top", "admin2@yanglg.top", "yanglg1992@163.com"};
			for (String to : toList) {
				mail.addTo(to); // 收件人地址，可以设置多个
			}
			mail.setSubject("aaaa"); // 邮件主题
			mail.setHtmlMsg("bbbb"); // 邮件正文
			mail.send(); // 发送邮件
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}*/
	
	
	public static void main(String[] args) {
		Mail mail = new Mail();
		mail.setHost("yanglg.top"); // 设置邮件服务器,如果不用163的,自己找找看相关的
		mail.setSender("admin@yanglg.top");
		mail.setReceiver("admin2@yanglg.top"); // 接收人
		mail.setUsername("admin"); // 登录账号,一般都是和邮箱名一样吧
		mail.setPassword("123456"); // 发件人邮箱的登录密码
		mail.setSubject("test");
		mail.setMessage("test message");
		new MailUtil().send(mail);
	}	
}
