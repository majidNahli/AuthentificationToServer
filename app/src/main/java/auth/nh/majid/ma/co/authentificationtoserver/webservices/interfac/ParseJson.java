package auth.nh.majid.ma.co.authentificationtoserver.webservices.interfac;

import auth.nh.majid.ma.co.authentificationtoserver.models.Response;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by majid on 19/09/2016.
 */
public interface ParseJson {


    @FormUrlEncoded
    @POST("/api/login")
    Call<Response> login(@Field("username") String username, @Field("password") String password) ;


}
