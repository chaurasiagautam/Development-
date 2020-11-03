package main.java.poc;

import java.util.Map;

public class Bean2Json {
    private String templateName;
    private boolean isActive;
    private boolean hasAdditionalProperties;
    private Map<String,String> additionalProperties;

    @Override
    public String toString() {
        return "Bean2Json{" +
                "templateName='" + templateName + '\'' +
                ", isActive=" + isActive +
                ", hasAdditionalProperties=" + hasAdditionalProperties +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
