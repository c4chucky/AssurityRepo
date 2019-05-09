package assurityApi;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;

public class main {
	
	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	    List<String> suites = Lists.newArrayList();
	    suites.add(CurrentWorkingDirectory() + "/RunAssurityApiTest.xml");
	    testng.setTestSuites(suites);
	    testng.run();
	}
	    
	   public static String CurrentWorkingDirectory() {
	        
	        String cwd = System.getProperty("user.dir");
	        System.out.println("Current working directory : " + cwd);

	        return cwd;
	}

}
