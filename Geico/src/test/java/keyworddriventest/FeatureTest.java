package keyworddriventest;
import keyworddriven.Features;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;
public class FeatureTest extends Features {
    @Test
    public void keyWordTest() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertEquals(selectFeature("Login"),"GEICO Online Service Center, Car Insurance, Auto Insurance, Motorcycle Insurance");
        Assert.assertEquals(selectFeature("Search"),"Site Search | GEICO");
        Assert.assertEquals(selectFeature("Customer Feedback"),"An Insurance Company For Your Car And More | GEICO");
        Assert.assertEquals(selectFeature("Information Menu"),"An Insurance Company For Your Car And More | GEICO");
        Assert.assertEquals(selectFeature("Insurance Menu"),"An Insurance Company For Your Car And More | GEICO");
    }
    @Test(dataProvider = "DP")
    public void getKeyWordFromExternalSource(String Keyword) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectFeature(Keyword);
    }
}
