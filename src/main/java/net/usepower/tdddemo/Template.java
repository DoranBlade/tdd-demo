package net.usepower.tdddemo;

public class Template {

    private String variableValue;

    public Template(String template) {
    }


    public void set(String var, String value) {
        this.variableValue = value;
    }

    public String evalute() {
        return "hello, " + this.variableValue;
    }
}
