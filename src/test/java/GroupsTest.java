import adapters.MoishopAdapters;
import com.google.gson.Gson;
import lombok.Data;
import object.ResponseStatus;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.TestConstants;

@Data
public class GroupsTest implements TestConstants {
    Gson converter = new Gson();

    @Test(description = "getting any category")
    public void getCategoryForTest(){
        String suiteFromResponse = new MoishopAdapters().get(CATEGORY_PATH, 200);
        ResponseStatus actualStatus = converter.fromJson(suiteFromResponse, ResponseStatus.class);
        Assert.assertEquals(actualStatus.getStatus(), "success" );
    }

    @Test(description = "getting any brand")
    public void getBrandForTest(){
        String suiteFromResponse = new MoishopAdapters().get(BRAND_PATH, 200);
        ResponseStatus actualStatus = converter.fromJson(suiteFromResponse, ResponseStatus.class);
        Assert.assertEquals(actualStatus.getStatus(), "success" );
    }

    @Test(description = "getting any product")
    public void getProductForTest(){
        String suiteFromResponse = new MoishopAdapters().get(PRODUCT_PATH, 200);
        ResponseStatus actualStatus = converter.fromJson(suiteFromResponse, ResponseStatus.class);
        Assert.assertEquals(actualStatus.getStatus(), "success" );
    }
}
