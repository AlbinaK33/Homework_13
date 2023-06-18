package task_3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class GetTaskUser {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users/";
    private static final Gson gson = new Gson();

    public List<Task> getOpenTaskUser(int userId) {
        try {
            URL url = new URL(BASE_URL + userId + "/todos?completed=false");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (HttpURLConnection.HTTP_OK == responseCode) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    Type task = new TypeToken<List<Task>>() {
                    }.getType();
                    return gson.fromJson(response.toString(), task);

                }
            }
            connection.disconnect();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
