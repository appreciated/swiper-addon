package com.github.appreciated;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JadeProcessor {
    public JadeProcessor() {
        List<String> file = new BufferedReader(
                new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("params.jade"), StandardCharsets.UTF_8)
        ).lines().map(String::trim)
                .skip(10)
                .collect(Collectors.toList());
        ArrayList<Parameter> parameters = new ArrayList<>();

        for (int i = 0; i < file.size(); i++) {
            if (file.get(i).equals("tr")) {
                parameters.add(new Parameter(
                        sanitizeTd(file.get(i + 1)),
                        sanitizeType(sanitizeTd(file.get(i + 2))),
                        sanitizeTd(file.get(i + 3)),
                        sanitizeTd(file.get(i + 4))
                ));
            }
        }

        parameters.stream().filter(parameter -> !parameter.type.equals("tr")).forEach(parameter -> System.out.println(parameter.type + " " + parameter.parameter + ";"));
        System.out.println();
    }

    private String sanitizeType(String type) {
        String ret = type;
        switch (type){
           case  "number": ret = "double"; break;
           case  "string": ret = "String"; break;
            default: break;
        }
        return ret;
    }

    private String sanitizeTd(String i) {
        return i.startsWith("td ") ? i.substring(3) : i;
    }

    public static void main(String[] args) {
        new JadeProcessor();
    }

    class Parameter {
        String parameter;
        String type;
        String defaultValue;
        String description;

        public Parameter(String parameter, String type, String defaultValue, String description) {
            this.parameter = parameter;
            this.type = type;
            this.defaultValue = defaultValue;
            this.description = description;
        }

        public String getParameterName() {
            return parameter;
        }

        public String getType() {
            return type;
        }

        public String getDefaultValue() {
            return defaultValue;
        }

        public String getDescription() {
            return description;
        }
    }
}
