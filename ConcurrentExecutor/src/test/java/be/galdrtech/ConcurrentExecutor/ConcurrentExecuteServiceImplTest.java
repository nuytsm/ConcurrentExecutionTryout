package be.galdrtech.ConcurrentExecutor;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import be.galdrtech.ConcurrentExecutor.service.ConcurrentExecuteService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ctx/application-context.xml"})
public class ConcurrentExecuteServiceImplTest {

	@Inject
	private ConcurrentExecuteService concurrentExecuteService;
	
	@Test
	public void testExecuteFiveRunnableswithinTwoSeconds(){
		for (int i = 0; i < 25; i++){
			concurrentExecuteService.execute(createNewRunnable(i));
		}
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Runnable createNewRunnable(final int number){
		return new Runnable() {
			
			public void run() {
				System.out.println("Executing runnable nr " + number + " takes 2 seconds..");
				try {
					Thread.sleep(2000);
					System.out.println("Done executing " + number);
				} catch (InterruptedException e) {
				}
			}
		};
	}
	
}
