package Payload;

import org.json.simple.JSONObject;

public class payload {


public static JSONObject userCreds(){
        JSONObject request=new JSONObject();
        request.put("name","UsmanAli");
        request.put("job","Developer");

        return(request);
    }

    public static JSONObject updatePatchCreds(){
        JSONObject req=new JSONObject();
        req.put("name","Uzair");
        req.put("job","Developer");

        return(req);
    }

    public static JSONObject updateUserCreds(){
        JSONObject req=new JSONObject();
        req.put("name","Qasim");
        req.put("job","QA Engineer");

        return(req);
    }
}
