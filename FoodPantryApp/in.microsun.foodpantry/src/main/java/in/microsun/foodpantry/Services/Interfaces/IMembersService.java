package in.microsun.foodpantry.Services.Interfaces;

import java.util.List;
import in.microsun.foodpantry.Entities.Member;
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

public interface IMembersService {
    @GET("/members")
    List<Member> Get();

    @GET("/members/{id}")
    Member Get(@Path("id") int id);

    @POST("/members")
    int Post(@Body Member member);

    @PUT("/members/{id}")
    int Put(@Path("id") int id,@Body Member member);

    @DELETE("/members/{id}")
    int Delete(@Path("id") int id);
}





