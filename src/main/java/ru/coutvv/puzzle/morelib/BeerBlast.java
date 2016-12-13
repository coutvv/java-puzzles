package ru.coutvv.puzzle.morelib;

import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.Reader;

import com.sun.xml.internal.ws.util.ReadAllStream;

//незаконченый пазл
/**
 * why   ? deadlock он самый, да. Недостаточно буфера для песенки(например если уменьшим вывод -- всё норм станет)
 * fix	 ? фигачим паралельный поток, который читает из потока
 *
 * moral : 
 * 			- необходимо дренировать(что?) поток вывода дочернего процесса чтобы обеспечить его завершение
 * 			тоже самое относится и к его потоку вывода ошибок
 *   
 * @author coutvv
 */
public class BeerBlast {

	static final String COMMAND = "java -cp target/classes ru.coutvv.puzzle.morelib.BeerBlast slave";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		if(args.length == 1 && args[0].equals("slave")) {
			for(int i = 99; i > 0; i--) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down, pass it around,");
				System.out.println((i-1) + " bottles of beer on the wall");
				System.out.println();
			}
		} else {
			// Master
			Process process = Runtime.getRuntime().exec(COMMAND);
//			drainInBackground(process.getInputStream()); // fix
			int exitValue = process.waitFor(); 
			System.out.println("exit value = " + exitValue);
		}
	}
	
	//fix
	static void drainInBackground(final InputStream is) {
		new Thread(new Runnable() {
			public void run() {
				try {
					int c = is.read();
					while(c >= 0){
//						System.out.print((char)c); //если хочется вывести что выведет процесс
						c = is.read();
					};
				} catch (Exception e) {
					// this idiom so bad(I mean try/catch with silence in catch block
				}
			}
		}).start();
	}
	
}
