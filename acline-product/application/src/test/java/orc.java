import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class orc {
    public static void main(String[] args) throws Exception {
        String customReadfileUrl = "http://128.1.219.178:7231/v1/parse/file";
        File file = new File("/Users/aaron.chen/acline/acline-manager/acline-product/application/src/main/resources/Interxion_Customer_Cross_Connect_Pricing_List_2021_Fm5dUX14OWd9MQZImOxgf1fMe2YB.pdf");
        String extension = "pdf";

        boolean ocrParse = true;

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody("file", file, ContentType.DEFAULT_BINARY, "file." + extension);
        builder.addTextBody("extension", extension, ContentType.APPLICATION_JSON);
        builder.addTextBody("ocr", String.valueOf(ocrParse), ContentType.APPLICATION_JSON);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(customReadfileUrl);

        HttpEntity multipart = builder.build();
        httpPost.setEntity(multipart);

        try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                String result = EntityUtils.toString(responseEntity, StandardCharsets.UTF_8);
                Gson gson = new Gson();
                JsonObject jsonResponse = gson.fromJson(result, JsonObject.class);

                System.err.println(jsonResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
