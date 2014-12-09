package in.microsun.foodpantry.Services;

import in.microsun.foodpantry.Services.Interfaces.IFoodItemsService;
import in.microsun.foodpantry.Services.Interfaces.ILookupsService;
import in.microsun.foodpantry.Services.Interfaces.IMemberVisitsService;
import in.microsun.foodpantry.Services.Interfaces.IMembersService;

/**
 * Created by Prabakard on 11/6/2014.
 */
public class ApiAdapter {

    private retrofit.RestAdapter restAdapter;
    public ApiAdapter() {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint("http://prabakar.in/foodpantry/api")
                .build();
    }
    public IMembersService BuildMembersService()
    {
        IMembersService service = restAdapter.create(IMembersService.class);
        return service;
    }
    public ILookupsService BuildLookupsService()
    {
        ILookupsService service = restAdapter.create(ILookupsService.class);
        return service;
    }
    public IFoodItemsService BuildFoodItemsService()
    {
        IFoodItemsService service = restAdapter.create(IFoodItemsService.class);
        return service;
    }
    public IMemberVisitsService BuildMemberVisitsService()
    {
        IMemberVisitsService service = restAdapter.create(IMemberVisitsService.class);
        return service;
    }
 }
