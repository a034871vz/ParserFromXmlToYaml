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
public class BaseDeclaration {

    @JsonProperty("Documents")
    String documents;
    @JsonProperty("Schema")
    String schema;
    @JsonProperty("Base")
    Base base;
    @JsonProperty("Laboratory")
    Laboratory laboratory;

}
