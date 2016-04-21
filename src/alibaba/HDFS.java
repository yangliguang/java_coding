package alibaba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Author:Young
 * Class Comment:
 * Hadoop是当下大数据处理的事实标准之一，具有广泛的应用场景。作为Hadoop生态基础的HDFS分布式文件系统，它具有极高的容错性，适合部署在廉价的机器上，并能提供高吞吐量的数据访问能力，专为大规模数据存取而设计。
请用Java程序来模拟HDFS的三个应用场景：写文件、读文件、Node节点单点故障。场景1为必选，场景2和3可选但必需延续场景1的实现方案。程序请使用JDK原生API来实现。
问题1：请用文字阐述你的设计方案。
问题2：请用Java程序来分别实现你的方案。
 * Date: 2016年4月20日下午8:36:36
 */
public class HDFS {
	public static void main(String[] args) {
		write();
		readFileByLines();
	}
	public static synchronized void write() {  
        try {  
            FileWriter fw = new FileWriter("C:/a.txt", true);
            fw.write("hello alibaba");  
            fw.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    } 
	public static void readFileByLines() {
        File file = new File("C:/a.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}
