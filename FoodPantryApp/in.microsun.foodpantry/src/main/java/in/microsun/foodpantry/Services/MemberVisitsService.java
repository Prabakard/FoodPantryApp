package in.microsun.foodpantry.Services;

import java.util.Date;
import java.util.List;

import in.microsun.foodpantry.Entities.MemberVisit;
import in.microsun.foodpantry.Services.Interfaces.IMemberVisitsService;

/**
 * Created by Prabakard on 12/8/2014.
 */
public class MemberVisitsService {
    private ApiAdapter _adapter;
    private IMemberVisitsService _service;
    public MemberVisitsService()
    {
        _adapter = new ApiAdapter();
        _service = _adapter.BuildMemberVisitsService();
    }

    public List<MemberVisit> Get() {
        return _service.Get();
    }

    public List<MemberVisit> Get(Date from, Date to) {
        return _service.Get(from,to);
    }

    public List<MemberVisit> Get(String memberNumber) {
        return _service.Get(memberNumber);
    }

    public MemberVisit Get(int id) {
        return _service.Get(id);
    }

    public int Post(MemberVisit memberVisit) {
        return _service.Post(memberVisit);
    }

    public int Put(int id, MemberVisit memberVisit) {
        return _service.Put(id,memberVisit);
    }

    public int Delete(int id) {
        return _service.Delete(id);
    }
}
