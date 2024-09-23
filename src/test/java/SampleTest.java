import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;



public class SampleTest {

  HomePage homePage = new HomePage();



  @Before
    public void setUp(){
      homePage.loadWebPage();
  }

  @Test
    public void test1(){
    homePage.loginUser();

  }


  @After
  public void tearDown(){

  }

}
