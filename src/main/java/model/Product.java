package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(value = { "TechRegs" })
public class Product {

    @JsonProperty("DeclareType")
    String declareType;
    @JsonProperty("DcOriginType")
    String dcOriginType;
    @JsonProperty("Name")
    String name;
    @JsonProperty("ProductInfo")
    String productInfo;
    @JsonProperty("Okp")
    String okp;
    @JsonProperty("OkpdText")
    Object okpdText;
    @JsonProperty("Standart")
    Object standart;
    @JsonProperty("SizeNumber")
    String sizeNumber;
    @JsonProperty("DetailsShippingDocumentation")
    Object detailsShippingDocumentation;
    @JsonProperty("ContractInfo")
    String contractInfo;
    @JsonProperty("Info")
    String info;
    @JsonProperty("PlaceMark")
    Object placeMark;
    @JsonProperty("TechRegs")
    TechRegs techRegs;
}
