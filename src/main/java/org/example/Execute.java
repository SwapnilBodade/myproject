package org.example;

import java.util.Arrays;
import java.util.Map;


public class Execute {
    private String tag1;
    private String tag2;
    private String tag3;
    private String tag4;
    private String tag5;


    static Map<String, String> config;
    public Execute(String[] arguments){

        this.tag1 = arguments[0];
        this.tag2 = arguments[1];
        this.tag3 = arguments[2];
        this.tag4 = arguments[3];
        this.tag5 = arguments[4];


       System.out.println(Arrays.toString(arguments));


    }


    public Map<String, String> getConfig() {
        config.put("arg0", this.tag1);
        config.put("arg1", this.tag2);
        config.put("arg2", this.tag3);
        config.put("arg3", this.tag4);
        config.put("arg4", this.tag5);
        return config;
    }

}
