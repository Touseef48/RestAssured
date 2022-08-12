package constants;
import helpers.PersonServiceHelper;
public class EndPoints{

    public static final String GET_ALL_USERS ="/users";
    public static final String CREATE_USERS ="/users";
    public static final String UPDATE_PATCH ="/api/users/"+PersonServiceHelper.id;
    public static final String UPDATE_USERS ="/users/"+PersonServiceHelper.id;
    public static final String DELETE_USER ="/api/users/"+PersonServiceHelper.id;
}