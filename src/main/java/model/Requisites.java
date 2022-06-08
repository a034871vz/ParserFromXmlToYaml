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
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Requisites {

    @JsonProperty("Status")
    String status;
    @JsonProperty("Section")
    String section;
    @JsonProperty("Number")
    String number;
    @JsonProperty("DateReg")
    LocalDateTime dateReg;
    @JsonProperty("DateExpiry")
    LocalDateTime dateExpiry;
    @JsonProperty("NoExpiry")
    Object noExpiry;
    @JsonProperty("BaseDeclaration")
    BaseDeclaration baseDeclaration;
    @JsonProperty("Discontinued")
    Object discontinued;

}
