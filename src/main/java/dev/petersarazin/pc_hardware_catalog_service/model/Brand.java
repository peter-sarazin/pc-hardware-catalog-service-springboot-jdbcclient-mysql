package dev.petersarazin.pc_hardware_catalog_service.model;

public class Brand {

    private Integer brandId;
    private String shortName;
    private String longName;
    private String url;

    public Integer getBrandId() { return brandId; }
    public void setBrandId( Integer brandId ) { this.brandId = brandId; }

    public String getShortName() { return shortName; }
    public void setShortName( String shortName ) { this.shortName = shortName; }

    public String getLongName() { return longName; }
    public void setLongName( String longName ) { this.longName = longName; }

    public String getUrl() { return url; }
    public void setUrl( String url ) { this.url = url; }
}
