package auth.nh.majid.ma.co.authentificationtoserver.webservices.impl;

import auth.nh.majid.ma.co.authentificationtoserver.Utils.Constant;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by majid on 19/09/2016.
 */
public class ServiceGenerator {

    public static final String API_BASE_URL = Constant.BASE_URL;

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {


        return retrofit().create(serviceClass);
    }

    public final static Retrofit retrofit() {
        return builder.client(httpClient.build()).build();
    }
}
