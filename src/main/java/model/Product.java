package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.beans.Transient;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
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
    transient TechRegs techRegs;
}
