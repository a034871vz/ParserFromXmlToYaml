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
public class Experts {

    @JsonProperty("Surname")
    String surname;
    @JsonProperty("Name")
    String name;
    @JsonProperty("Patronymic")
    String patronymic;

}
