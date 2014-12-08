package in.microsun.foodpantry.Services;

/**
 * Created by Prabakard on 11/6/2014.
 */
public class RestAdapter {

    private retrofit.RestAdapter restAdapter;
    public RestAdapter() {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint("http://prabakar.in/foodpantry/api")
                .build();
    }
    public RestService BuildRestService()
    {
        RestService service = restAdapter.create(RestService.class);
        return service;
    }
}
