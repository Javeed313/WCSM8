package Assignment;

import java.io.File;

import qsp.qsp2;

public class Pracitice extends qsp2{

	public static void main(String[] args) throws InterruptedException {
		File file = new File("./Javed/10914210444872992-919168798707 (1).json");
		
		String absolutepath = file.getAbsolutePath();
		System.out.println(absolutepath);
	}
	
}
 