package in.microsun.foodpantry.Services.Interfaces;

import java.util.Date;
import java.util.List;

import in.microsun.foodpantry.Entities.FoodItem;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Prabakard on 11/6/2014.
 */

public interface IFoodItemsService {
    @GET("/fooditems")
    List<FoodItem> Get();

    @GET("/fooditems/{id}")
    FoodItem Get(@Path("id") int id);

    @GET("/fooditems/category={category}")
    List<FoodItem> Get(@Path("category") String category);

    @GET("/fooditems/expireDate={expireDate}")
    List<FoodItem> Get(@Path("expireDate") Date expireDate);

    @POST("/fooditems")
    int Post(@Body FoodItem foodItem);

    @PUT("/fooditems/{id}")
    int Put(@Path("id") int id, @Body FoodItem foodItem);

    @DELETE("/fooditems/{id}")
    int Delete(@Path("id") int id);
}





