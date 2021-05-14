package stream;

import java.io.*;

public class FielReaderEx {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\windows\\system.ini");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("입출력 오류");
		}
	}
}
