package in.microsun.foodpantry.Entities;

import java.util.HashMap;
import java.util.Map;


public class Lookup {

    private int Id;
    private String Name;
    private String Type;
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
     * The Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     * The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     * The Type
     */
    public String getType() {
        return Type;
    }

    /**
     *
     * @param Type
     * The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}