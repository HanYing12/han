package entity;


public class Hwkc {
    private String locationId;
    private String itemName;
    private String manufacturer;
    private String itemSpec;
    private String unit;
    private String batchNo;
    private String expiryDate;
    private Integer qty;
    private String togCode;

    public Hwkc() {
    }

    public Hwkc(String locationId, String itemName, String manufacturer, String itemSpec, String unit, String batchNo, String expiryDate, Integer qty, String togCode) {
        this.locationId = locationId;
        this.itemName = itemName;
        this.manufacturer = manufacturer;
        this.itemSpec = itemSpec;
        this.unit = unit;
        batchNo = batchNo;
        this.expiryDate = expiryDate;
        this.qty = qty;
        this.togCode = togCode;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        batchNo = batchNo;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getTogCode() {
        return togCode;
    }

    public void setTogCode(String togCode) {
        this.togCode = togCode;
    }

    @Override
    public String toString() {
        return "Hwkc{" +
                "locationId='" + locationId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", itemSpec='" + itemSpec + '\'' +
                ", unit='" + unit + '\'' +
                ", BatchNo='" + batchNo + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", qty=" + qty +
                ", togCode='" + togCode + '\'' +
                '}';
    }
}
