package in.microsun.foodpantry.Services;

import java.util.List;

import in.prabakar.myapplication.Entities.Member;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.DELETE;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.Callback;

/**
 * Created by Prabakard on 11/6/2014.
 */

public interface RestService {
    @GET("/values")
    List<String> getValues();
    @GET("/values/{value}")
    String getValue(@Path("value") int value);
    @GET("/members")
    List<Member> GetMembers();
    @GET("/members/{id}")
    Member GetMember(@Path("id") int id);
    @POST("/members")
    int CreateMember(@Body Member member);
}





