package in.microsun.foodpantryapp.Entities;

import java.util.HashMap;
import java.util.Map;



public class Member {

    private int Id;
    private String FirstName;
    private String LastName;
    private String DOB;
    private String Gender;
    private String MemberNumber;
    private String SchoolId;
    private String PhoneNumber;
    private String EmailId;
    private Lookup Ethnicity;
    private Lookup Race;
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
     * The FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     *
     * @param FirstName
     * The FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     *
     * @return
     * The LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     *
     * @param LastName
     * The LastName
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     *
     * @return
     * The DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     *
     * @param DOB
     * The DOB
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     *
     * @return
     * The Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     *
     * @param Gender
     * The Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     *
     * @return
     * The MemberNumber
     */
    public String getMemberNumber() {
        return MemberNumber;
    }

    /**
     *
     * @param MemberNumber
     * The MemberNumber
     */
    public void setMemberNumber(String MemberNumber) {
        this.MemberNumber = MemberNumber;
    }

    /**
     *
     * @return
     * The SchoolId
     */
    public String getSchoolId() {
        return SchoolId;
    }

    /**
     *
     * @param SchoolId
     * The SchoolId
     */
    public void setSchoolId(String SchoolId) {
        this.SchoolId = SchoolId;
    }

    /**
     *
     * @return
     * The PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     *
     * @param PhoneNumber
     * The PhoneNumber
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     *
     * @return
     * The EmailId
     */
    public String getEmailId() {
        return EmailId;
    }

    /**
     *
     * @param EmailId
     * The EmailId
     */
    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    /**
     *
     * @return
     * The Ethnicity
     */
    public Lookup getEthnicity() {
        return this.Ethnicity;
    }

    /**
     *
     * @param Ethnicity
     * The Ethnicity
     */
    public void setEthnicity(Lookup Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    /**
     *
     * @return
     * The Race
     */
    public Lookup getRace() {
        return this.Race;
    }

    /**
     *
     * @param Race
     * The Race
     */
    public void setRace(Lookup Race) {
        this.Race = Race;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}