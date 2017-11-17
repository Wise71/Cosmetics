package com.sarapul.wise71.cosmetics;

public class ProductChild {

    private String mProductFilialeValue;
    private String mProductAendkennzValue;
    private String mProductActivdatumValue;
    private String mProductAenddatumValue;
    private String mProductHierarchieValue;
    private String mProductVerknuepfgValue;

    public ProductChild(String filialeValue, String aendkennzValue,
                        String activdatumValue, String aenddatumValue,
                        String hierarchieValue, String verknuepfgValue) {
        mProductFilialeValue = filialeValue;
        mProductAendkennzValue = aendkennzValue;
        mProductActivdatumValue = activdatumValue;
        mProductAenddatumValue = aenddatumValue;
        mProductHierarchieValue = hierarchieValue;
        mProductVerknuepfgValue = verknuepfgValue;
    }
    public String getProductFilialeValue() {
        return mProductFilialeValue;
    }

    public void setProductFilialeValue(String mProductFilialeValue) {
        this.mProductFilialeValue = mProductFilialeValue;
    }

    public String getProductAendkennzValue() {
        return mProductAendkennzValue;
    }

    public void setProductAendkennzValue(String mProductAendkennzValue) {
        this.mProductAendkennzValue = mProductAendkennzValue;
    }

    public String getProductActivdatumValue() {
        return mProductActivdatumValue;
    }

    public void setProductActivdatumValue(String mProductActivdatumValue) {
        this.mProductActivdatumValue = mProductActivdatumValue;
    }

    public String getProductAenddatumValue() {
        return mProductAenddatumValue;
    }

    public void setProductAenddatumValue(String mProductAenddatumValue) {
        this.mProductAenddatumValue = mProductAenddatumValue;
    }

    public String getProductHierarchieValue() {
        return mProductHierarchieValue;
    }

    public void setProductHierarchieValue(String mProductHierarchieValue) {
        this.mProductHierarchieValue = mProductHierarchieValue;
    }

    public String getProductVerknuepfgValue() {
        return mProductVerknuepfgValue;
    }

    public void setProductVerknuepfgValue(String mProductVerknuepfgValue) {
        this.mProductVerknuepfgValue = mProductVerknuepfgValue;
    }

}
