package in.microsun.foodpantry.Entities;

import java.util.HashMap;
import java.util.Map;

public class FoodItem {

    private int Id;
    private String ItemNumber;
    private String ItemName;
    private String Description;
    private int Weight;
    private int Quantity;
    private String Unit;
    private String ExpiresOn;
    private Lookup Category;
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
     * The ItemNumber
     */
    public String getItemNumber() {
        return ItemNumber;
    }

    /**
     *
     * @param ItemNumber
     * The ItemNumber
     */
    public void setItemNumber(String ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    /**
     *
     * @return
     * The ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     *
     * @param ItemName
     * The ItemName
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     *
     * @return
     * The Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @param Description
     * The Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     *
     * @return
     * The Weight
     */
    public int getWeight() {
        return Weight;
    }

    /**
     *
     * @param Weight
     * The Weight
     */
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    /**
     *
     * @return
     * The Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     *
     * @param Quantity
     * The Quantity
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     *
     * @return
     * The Unit
     */
    public String getUnit() {
        return Unit;
    }

    /**
     *
     * @param Unit
     * The Unit
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     *
     * @return
     * The ExpiresOn
     */
    public String getExpiresOn() {
        return ExpiresOn;
    }

    /**
     *
     * @param ExpiresOn
     * The ExpiresOn
     */
    public void setExpiresOn(String ExpiresOn) {
        this.ExpiresOn = ExpiresOn;
    }

    /**
     *
     * @return
     * The Category
     */
    public Lookup getCategory() {
        return this.Category;
    }

    /**
     *
     * @param Category
     * The Category
     */
    public void setCategory(Lookup Category) {
        this.Category = Category;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}