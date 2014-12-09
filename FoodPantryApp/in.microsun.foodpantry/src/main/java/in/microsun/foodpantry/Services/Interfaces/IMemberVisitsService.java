package in.microsun.foodpantry.Services.Interfaces;

import java.util.Date;
import java.util.List;

import in.microsun.foodpantry.Entities.MemberVisit;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Prabakard on 11/6/2014.
 */

public interface IMemberVisitsService {
    @GET("/membervisits")
    List<MemberVisit> Get();

    @GET("/membervisits/from={from}&to=(to)")
    List<MemberVisit> Get(@Path("from") Date from, @Path("to") Date to);

    @GET("/membervisits/membernumber={membernumber}")
    List<MemberVisit> Get(@Path("membernumber") String memberNumber);

    @GET("/membervisits/{id}")
    MemberVisit Get(@Path("id") int id);

    @POST("/membervisits")
    int Post(@Body MemberVisit memberVisit);

    @PUT("/membervisits/{id}")
    int Put(@Path("id") int id, @Body MemberVisit memberVisit);

    @DELETE("/membervisits/{id}")
    int Delete(@Path("id") int id);
}





