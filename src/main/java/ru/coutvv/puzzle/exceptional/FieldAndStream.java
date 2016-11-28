package ru.coutvv.puzzle.exceptional;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * why   ?  если при закрытии in'a произойдёт экзепшн, out не закроется
 * fix	 ?  оборачивать закрытие как и показано в ченчебл секции
 *
 * moral : 
 * 			- всегда закрывающие методы в блоке finally обмазывай try/catch
 * 			- отлавливай все возможные экзепшены в блоке finally  
 *   
 * @author coutvv
 */
public class FieldAndStream {

	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			///original:
//			if(in != null) in.close();
//			if(out != null) out.close();
			closeIgnoringException(in);
			closeIgnoringException(out);
		}
	}
	
	/// changeble
	private static void closeIgnoringException(Closeable c) {
		if(c != null) {
			try {
				c.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			copy("input.txt", "output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
