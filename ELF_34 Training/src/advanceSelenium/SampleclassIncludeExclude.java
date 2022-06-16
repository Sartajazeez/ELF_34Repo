package advanceSelenium;

import org.testng.annotations.Test;

public class SampleclassIncludeExclude {
	@Test(groups = "smoke")
	public void food() {
		System.out.println("Biryani");
		System.out.println("Kabab");
		System.out.println("Tandori");
	}
	
		@Test
		public void movie() {
			System.out.println("Marvel");
			System.out.println("Iron Man");
			System.out.println("Hulk");
		}
			
			
			@Test(groups = "smoke")
			public void subject() {
				System.out.println("Physics");
				System.out.println("Maths");
				System.out.println("Chemistry");
			}
				
				
				
				@Test(groups = "regression")
				public void city() {
					System.out.println("Banglore");
					System.out.println("Mysore");
					System.out.println("Goa");
		}
}
	
