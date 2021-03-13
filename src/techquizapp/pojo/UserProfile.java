
package techquizapp.pojo;

public class UserProfile {
    private static String username;
    private static String userType;

    public static String getUsername() {
        return username;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    public static void setUserType(String userType) {
        UserProfile.userType = userType;
    }

  
    
}
