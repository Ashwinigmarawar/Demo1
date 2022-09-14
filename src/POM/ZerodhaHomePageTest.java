package POM;

public class ZerodhaHomePageTest 
{
   public void Zerodhalogin() throws InterruptedException
   {
	   ZerodhaTest zerodhatest=new ZerodhaTest();
	   zerodhatest.LoginWithCorrectCredentials();
   }
   public void Zerodhahomepage()
   {
	   ZerodhaHomeTest zerodhahometest=new ZerodhaHomeTest();
	   //zerodhahometest.ForHomePage();
   }
   public static void main(String[] args) throws InterruptedException 
  {
	   ZerodhaHomePageTest zerodhahomepagetest=new ZerodhaHomePageTest();
	   zerodhahomepagetest.Zerodhalogin();
	   Thread.sleep(3000);
	   zerodhahomepagetest.Zerodhahomepage();
  }
}
