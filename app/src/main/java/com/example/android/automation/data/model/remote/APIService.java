package com.example.android.automation.data.model.remote;

import com.example.android.automation.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {

    @POST("/api/v1.6/variables/5d46883ac03f977562401647/values/?token=A1E-sjt7VWtT0FgYqhjjY2M3ey2z3T2gRU/")
    @FormUrlEncoded
    Call<Post> savePost(
                        @Field("value") Integer value
//                        @Field("timestamp") Integer timestamp,
//                        @Field("context") Context context,
//                        @Field("created_at") String createdAt
    );

    @PUT("http://things.ubidots.com/api/v1.6/devices/led/5d46883ac03f977562401647")
    @FormUrlEncoded
    Call<Post> updatePost(@Path("url") String url,
                          @Field("value") Integer value
                          );

//    @POST("/posts")
//    @FormUrlEncoded
//    Call<Post> savePost(@Body Post post);
}
