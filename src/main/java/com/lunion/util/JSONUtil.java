package com.lunion.util;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class JSONUtil {

    private static Logger logger = LoggerFactory.getLogger(JSONUtil.class);

    public static String convertObjectToJSON(Object object){

        ObjectMapper objectMapper = new ObjectMapper();

        String json = null;

        try {
            json = objectMapper.writeValueAsString(object);
        }catch (IOException ex) {
            logger.error(ex.getMessage());
        }

        return json;
    }


    public static String convertArrayToJSON(List list) {
        return tryConverting(list);
    }

    private static String tryConverting(List list) {

        String json = null;
        ObjectMapper mapper = new ObjectMapper().setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);

        try {
            json = mapper.writeValueAsString(list);
        } catch (IOException ioEx) {
            logger.error(ioEx.getMessage());
        }

        return json;
    }
}
