package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class RdcTr {

    @JsonProperty("Type")
    String type;
    @JsonProperty("Requisites")
    Requisites requisites;
    @JsonProperty("Applicant")
    Applicant applicant;
    @JsonProperty("ApplicantUl")
    ApplicantUl applicantUl;
    @JsonProperty("ApplicantFl")
    Object applicantFl;
    @JsonProperty("ApplicantAl")
    Object applicantAl;
    @JsonProperty("ApplicantAu")
    Object applicantAu;
    @JsonProperty("Manufacturer")
    Manufacturer manufacturer;
    @JsonProperty("Product")
    Product product;
    @JsonProperty("DeclareAddInfo")
    Object declareAddInfo;
    @JsonProperty("CertificationOrgan")
    CertificationOrgan certificationOrgan;
}
