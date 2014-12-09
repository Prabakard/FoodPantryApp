package in.microsun.foodpantry.Services.Interfaces;

import java.util.List;

import in.microsun.foodpantry.Entities.Lookup;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Prabakard on 11/6/2014.
 */

public interface ILookupsService {
    @GET("/lookups")
    List<Lookup> Get();

    @GET("/lookups/type={type}")
    List<Lookup> Get(@Path("type") String type);

    @GET("/lookups/{id}")
    Lookup Get(@Path("id") int id);

    @POST("/lookups")
    int Post(@Body Lookup member);

    @PUT("/lookups/{id}")
    int Put(@Path("id") int id, @Body Lookup lookup);

    @DELETE("/lookups/{id}")
    int Delete(@Path("id") int id);
}





