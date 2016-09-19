package auth.nh.majid.ma.co.authentificationtoserver.webservices.impl;


import auth.nh.majid.ma.co.authentificationtoserver.models.Response;
import auth.nh.majid.ma.co.authentificationtoserver.webservices.interfac.ParseJson;
import retrofit2.Call;

/**
 * Created by majid on 19/09/2016.
 */
public class ServiceManager {

    // builder rettrofit

    ParseJson service = ServiceGenerator.createService(ParseJson.class);
    public Response login(String name, String password) {

        try {
            Call<Response> responseCall = service.login(name, password);
            return responseCall.execute().body();

        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;

    }


}
