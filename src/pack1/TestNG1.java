package pack1;

import org.testng.annotations.*;

public class TestNG1 {
	@Test
	public static void Test1() {
		System.out.println("Test running");

	}
	@BeforeTest
	public static void BTest1() {
		System.out.println("preparing Test run");

	}
	@AfterTest
	public static void ATest1() {
		System.out.println("Closing Test run");

}

}
