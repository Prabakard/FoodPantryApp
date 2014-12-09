package in.microsun.foodpantry.Services;

import java.util.Date;
import java.util.List;

import in.microsun.foodpantry.Entities.FoodItem;
import in.microsun.foodpantry.Services.Interfaces.IFoodItemsService;


/**
 * Created by Prabakard on 12/8/2014.
 */
public class FoodItemsService{
    private ApiAdapter _adapter;
    private IFoodItemsService _service;
    public FoodItemsService()
    {
        _adapter = new ApiAdapter();
        _service = _adapter.BuildFoodItemsService();
    }

    public List<FoodItem> Get() {
        return _service.Get();
    }

    public FoodItem Get(int id) {
        return _service.Get(id);
    }

    public List<FoodItem> Get(String category) {
        return _service.Get(category);
    }

    public List<FoodItem> Get(Date expireDate) {
        return _service.Get(expireDate);
    }

    public int Post(FoodItem foodItem) {
        return _service.Post(foodItem);
    }

    public int Put(int id, FoodItem foodItem) {
        return _service.Put(id,foodItem);
    }

    public int Delete(int id) {
        return _service.Delete(id);
    }
}
