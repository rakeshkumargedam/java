package design.patterns.creational.prototype;
/** Prototype Class * */
public abstract class Product implements Cloneable {
    private String SKU;
    private String description;

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.getMessage();
        }
        return clone;
    }
    public String getSKU() {
        return SKU;
    }
    public String getDescription(){
        return description;
    }

    public void setSKU(String sku) {
        SKU = sku;
    }

    public void setDescription(String desc) {
        description = desc;
    }
}
