package in.microsun.foodpantry.Services;

import java.util.List;

import in.microsun.foodpantry.Entities.Lookup;
import in.microsun.foodpantry.Services.Interfaces.ILookupsService;

/**
 * Created by Prabakard on 12/8/2014.
 */
public class LookupsService {
    private ApiAdapter _adapter;
    private ILookupsService _service;
    public LookupsService()
    {
        _adapter = new ApiAdapter();
        _service = _adapter.BuildLookupsService();
    }

    public List<Lookup> Get() {
        return _service.Get();
    }

    public List<Lookup> Get(String type) {
        return _service.Get(type);
    }

    public Lookup Get(int id) {
        return _service.Get(id);
    }

    public int Post(Lookup member) {
        return _service.Post(member);
    }

    public int Put(int id, Lookup lookup) {
        return _service.Put(id,lookup);
    }

    public int Delete(int id) {
        return _service.Delete(id);
    }
}
