
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SmokeClass2  {
    SoftAssert softAssert;

    @BeforeClass
    public void beforeClass()
    {
        System.out.println(getClass().getName());
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println(getClass().getName());
    }


    @Test(groups = "sanity", priority = 0, description = "search customer")
    public void searchCustomer()
    {
        System.out.println("Project Structure sanity-1 - Search For Customer");
        softAssert=new SoftAssert();
        softAssert.assertTrue(false);
        softAssert.assertAll();

    }

    @Test(groups = {"sanity","regression"}, priority = 0, description = "search product")
    public void searchProduct()
    {
        System.out.println("Project Structure sanity & regression -1 - Search For Product");
    }

    @Test(groups = "sanity")
    public void searchCustomer1()
    {
        System.out.println("Project Structure sanity -1 - Search For Customer");
    }

    @Test(groups = "regression")
    public void searchProduct1()
    {
        System.out.println("Project Structure regression -1 -Search For Product");
    }
}