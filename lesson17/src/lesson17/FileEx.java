package lesson17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;

public class FileEx {
	public static void main(String[] args) throws Exception {
		//1gb
		//1024*1024*1024
		//하고나서 f5
//		File file = new File("1gb.txt");
//	
//		FileWriter Writer = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(Writer);
//		for(int i =0; i<1024*1024*1024; i++) {
//			Writer.write('A');			
//		}
//		bw.close();
//		Writer.close();
		
		File folder = new File("1000files");
		folder.mkdirs();
		
		for(int i = 0 ; i <1024 ; i++) {
			File file = new File("1000Files\\"+i+".txt");
			FileWriter Writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(Writer);
			for(int j =0; j<1024*1024; j++) {
				Writer.write('B');			
			}
			bw.close();
			Writer.close();
			System.out.println(file +"생성됨");
			
		}
	}
}
