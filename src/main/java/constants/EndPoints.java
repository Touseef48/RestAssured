package constants;
import testcases.createUser;
public class EndPoints{

    public static final String GET_ALL_USERS ="/users?page=2";
    public static final String CREATE_USERS ="/users";
    public static final String UPDATE_PATCH ="/api/users/2";
    public static final String UPDATE_USERS ="/users/2";
    public static final String DELETE_USER ="/api/users/"+createUser.id;
}