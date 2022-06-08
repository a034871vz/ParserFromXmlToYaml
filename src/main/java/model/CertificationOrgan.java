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
public class CertificationOrgan {

    @JsonProperty("FullName")
    String fullName;
    @JsonProperty("Number")
    String number;
    @JsonProperty("DateReg")
    LocalDateTime dateReg;
    @JsonProperty("Organ")
    String organ;
    @JsonProperty("Head")
    String head;
    @JsonProperty("AddressLegal")
    String addressLegal;
    @JsonProperty("Address")
    String address;
    @JsonProperty("Phone")
    String phone;
    @JsonProperty("Fax")
    String fax;
    @JsonProperty("Email")
    String email;
    @JsonProperty("Ogrn")
    Object orgn;
    @JsonProperty("Experts")
    Experts experts;

}
