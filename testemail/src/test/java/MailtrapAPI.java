import okhttp3.*;

import java.io.IOException;

public class MailtrapAPI {

    private static final String API_TOKEN = "9d43023bf678e9080b06dd9b60cd66cd";

    public static String fetchLatestEmail() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://mailtrap.io/api/v1/inboxes")
                .addHeader("Api-Token", API_TOKEN)
                .build();

        Response response = client.newCall(request).execute();
        if (response.isSuccessful() && response.body() != null) {
            return response.body().string(); // Returns email content as JSON
        } else {
            throw new IOException("❌ Failed to fetch emails: " + response.message());
        }
    }
}
