package work10;
import java.io.*;
import java.util.Scanner;
public class text1 {
	 public static void main(String[] args) throws FileNotFoundException {
	        //����"input.txt��output.txt���ļ�"
	        File File1 = new File("src/work10/input.txt");
	        File File2 = new File("src/work10/output.txt");
	        //��"input.txt"��������
	        try(java.io.PrintWriter output1 = new java.io.PrintWriter(File1)){
	            output1.println("Weclcome China");
	        }
	        //�ڡ�output.txt�����
	        Scanner input = new Scanner(File1);
	        try (PrintWriter output2 = new PrintWriter(File2);){
	            while(input.hasNext()){
	                String x = input.nextLine();
	                output2.println(x);
	                System.out.println(x);
	            }
	        }
	        input.close();
	    }
    }