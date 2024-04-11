package org.geoserver.openapi.primitive;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        DoubleList.JSON_PROPERTY_VALUES,
})
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class IntegerList extends Primitive<Integer> {
    public static final String JSON_PROPERTY_VALUES = "int";

    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Integer> getValues() {
        return values;
    }
}