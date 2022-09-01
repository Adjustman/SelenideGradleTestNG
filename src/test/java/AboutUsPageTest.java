import org.testng.annotations.Test;
import pages.AboutUsPage;

public class AboutUsPageTest extends BaseTest{

    AboutUsPage aboutPage = new AboutUsPage();

    @Test
    public void checkPageTitle(){
        aboutPage.openAboutPage();
        aboutPage.checkTitle();

    }
}
