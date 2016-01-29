package com.dbpat.util.oraispt;

import java.util.Map;

public interface InspectRule {
    Integer apply(Map<String, Object> prmtMap);
}
