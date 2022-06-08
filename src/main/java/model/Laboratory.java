package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Laboratory {

    @JsonProperty("NumberReg")
    String numberReg;
    @JsonProperty("Name")
    String name;
    @JsonProperty("DateReg")
    LocalDateTime dateReg;
    @JsonProperty("DateExpiry")
    LocalDateTime dateExpiry;
    @JsonProperty("Document")
    Object document;
    @JsonProperty("Info")
    Object info;

}
