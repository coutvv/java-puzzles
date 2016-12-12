package ru.coutvv.puzzle.morelib;

import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.Reader;

import com.sun.xml.internal.ws.util.ReadAllStream;

//незаконченый пазл
/**
 * why   ? 
 * fix	 ?   
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class BeerBlast {

	static final String COMMAND = "java ru.coutvv.puzzle.morelib.BeerBlast slave";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		if(args.length == 1 && args[0].equals("slave")) {
			for(int i = 999; i > 0; i--) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down, pass it around,");
				System.out.println((i-1) + " bottles of beer on the wall");
				System.out.println();
			}
		} else {
			// Master
			Process process = Runtime.getRuntime().exec(COMMAND);
//			drainInBackground(process.getInputStream());
			int exitValue = process.waitFor(); 
			System.out.println("exit value = " + exitValue);
		}
	}
	
	static void drainInBackground(final InputStream is) {
		new Thread(new Runnable() {
			public void run() {
				try {
					char c = (char) is.read();
					while(c >= 0) {
						c = (char) is.read();
//						System.out.print(c);
					}
						
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}).start();
	}
	
}
