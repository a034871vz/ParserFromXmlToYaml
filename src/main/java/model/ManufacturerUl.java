package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManufacturerUl {

    @JsonProperty("OrganForm")
    String organForm;
    @JsonProperty("FullName")
    String fullName;
    @JsonProperty("Address")
    Address address;
    @JsonProperty("AddressActual")
    String addressActual;
    @JsonProperty("Phone")
    String phone;
    @JsonProperty("Fax")
    String fax;
    @JsonProperty("Email")
    String email;
    @JsonProperty("Organ")
    Object organ;
    @JsonProperty("Date")
    LocalDate date;
    @JsonProperty("Ogrn")
    String ogrn;
    @JsonProperty("Inn")
    String inn;
}
