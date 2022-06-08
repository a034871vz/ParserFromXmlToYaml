package model;

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
public class Manufacturer {

    @JsonProperty("Type")
    String type;
    @JsonProperty("ManufacturerUl")
    ManufacturerUl manufacturerUl;
    @JsonProperty("ManufacturerAl")
    Object manufacturerAl;
    @JsonProperty("ManufacturerFl")
    Object manufacturerFl;

}
