package work10;
import java.io.*;
import java.util.Scanner;
public class text2 {
	//��ȡ�ĵ��е�����
	public static void main(String[] args) throws IOException {
        InputStream file = new FileInputStream("src/work10/input.txt");
        OutputStream file1 = new FileOutputStream("src/work10/output.txt");
        int i;
        while((i = file.read()) != -1){
            System.out.print((char)i);
            file1.write(i);
        }
    }
}
