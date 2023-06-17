package task_1;

import java.io.IOException;



public class TestUserChangeApp {
    public static void main(String[] args) throws IOException {
        UserChangeApp userChangeApp = new UserChangeApp();
        System.out.println(userChangeApp.addUserApp());
        System.out.println(userChangeApp.updateUser(3));
        System.out.println(userChangeApp.deleteUser(3));
        System.out.println(userChangeApp.getUsers());
        System.out.println(userChangeApp.getUserId(2));
        System.out.println(userChangeApp.getUserUsername("Antonette"));


    }
}
