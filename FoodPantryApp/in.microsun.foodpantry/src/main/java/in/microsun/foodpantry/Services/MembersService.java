package in.microsun.foodpantry.Services;

import java.util.List;

import in.microsun.foodpantry.Entities.Member;
import in.microsun.foodpantry.Services.Interfaces.IMembersService;


/**
 * Created by Prabakard on 12/8/2014.
 */
public class MembersService {
    private ApiAdapter _adapter;
    private IMembersService _service;
    public MembersService()
    {
        _adapter = new ApiAdapter();
        _service = _adapter.BuildMembersService();
    }

    public List<Member> Get() {
        return _service.Get();
    }

    public Member Get(int id) {
        return _service.Get(id);
    }

    public int Post(Member member) {
        return _service.Post(member);
    }

    public int Put(int id, Member member) {
        return _service.Put(id,member);
    }

    public int Delete(int id) {
        return _service.Delete(id);
    }
}
