package task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCommentsUser {
    private static final String BASE_URL_1 = "https://jsonplaceholder.typicode.com/users/";
    private static final String BASE_URL_2 = "https://jsonplaceholder.typicode.com/posts/";


    public int getIdPostUser(int userId) {
        try {
            URL url = new URL(BASE_URL_1 + userId + "/posts");
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
                    PostIdUser[] posts = new Gson().fromJson(String.valueOf(response), PostIdUser[].class);

                    if (posts.length > 0) {
                        int lastPostId = 0;
                        for (PostIdUser post : posts) {
                            int postId = post.getId();
                            if (postId > lastPostId) {
                                lastPostId = postId;
                            }
                        }
                        return lastPostId;
                    }
                }
            }
            connection.disconnect();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void addPostsToFile(int userId, int lastPostId) {
        try {
            URL url = new URL(BASE_URL_2 + lastPostId + "/comments");
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
                    try (Writer writer = new FileWriter("user-" + userId + "-post-" + lastPostId + "-comments.json")) {
                        Gson gson = new GsonBuilder().setPrettyPrinting().create();
                        gson.toJson(response, writer);
                        writer.flush();

                    }
                }
            }
            connection.disconnect();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
