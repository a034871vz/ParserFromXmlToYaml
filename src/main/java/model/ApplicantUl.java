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
public class ApplicantUl {

    @JsonProperty("OrganForm")
    String organForm;
    @JsonProperty("FullName")
    String fullName;
    @JsonProperty("ShortName")
    String shortName;
    @JsonProperty("Head")
    String head;
    @JsonProperty("HeadPost")
    String headPost;
    @JsonProperty("HeadText")
    String headText;
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
    LocalDateTime date;
    @JsonProperty("Ogrn")
    String ogrn;
    @JsonProperty("Inn")
    String inn;
    @JsonProperty("RegInfo")
    Object regInfo;
    @JsonProperty("Contract")
    Object contract;
}
