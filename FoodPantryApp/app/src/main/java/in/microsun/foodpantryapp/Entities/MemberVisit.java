package in.microsun.foodpantryapp.Entities;

import java.util.HashMap;
import java.util.Map;

public class MemberVisit {

    private int Id;
    private Member Member;
    private String VisitedOn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Id
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The Member
     */
    public Member getMember() {
        return Member;
    }

    /**
     *
     * @param Member
     * The Member
     */
    public void setMember(Member Member) {
        this.Member = Member;
    }

    /**
     *
     * @return
     * The VisitedOn
     */
    public String getVisitedOn() {
        return VisitedOn;
    }

    /**
     *
     * @param VisitedOn
     * The VisitedOn
     */
    public void setVisitedOn(String VisitedOn) {
        this.VisitedOn = VisitedOn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}