package be.galdrtech.ConcurrentExecutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ctx/application-context.xml");
		
		System.out.println("\n" +	
"  ______ _______        ______   ______ _______ _______ _______ _     _ \n" +                                                                     				
" |  ____ |_____| |      |     \\ |_____/    |    |______ |       |_____| \n" +
" |_____| |     | |_____ |_____/ |    \\_    |    |______ |_____  |     | \n" +
                                                                       "");
		
	}
}
