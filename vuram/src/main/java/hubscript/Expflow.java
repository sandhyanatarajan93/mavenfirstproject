package hubscript;

public class Expflow extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BaseClass b = new BaseClass();
		b.initialize("chrome");
		b.getUrl("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		b.SendValue("//input[@id='un']", "vuramitem@vuram.com");
		b.SendValue("//input[@type='password']", "Test1234");
		Thread.sleep(5000);
		b.clickelement("//input[@value='Sign In']");

	}

}
