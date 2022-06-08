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
public class Applicant {

    @JsonProperty("ApplicantType")
    String applicantType;
    @JsonProperty("DeclarantType")
    String declarantType;
}