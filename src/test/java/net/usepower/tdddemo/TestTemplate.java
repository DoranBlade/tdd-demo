package net.usepower.tdddemo;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class TestTemplate {

    @Test
    public void oneVariable() {
        Template template = new Template("hello, ${name}");
        template.set("name", "reader");
        Assert.assertThat("hello, reader", Matchers.equalTo(template.evalute()));
    }

    @Test
    public void diffVariable() {
        Template template = new Template("hello, ${name}");
        template.set("name", "some else");
        Assert.assertThat("hello, some else", Matchers.equalTo(template.evalute()));
    }

    @Test
    public void multiVariable() {
        Template template = new Template("${one}, ${two}, #{three}");
        template.set("one", "1");
        template.set("two", "2");
        template.set("three", "3");
        Assert.assertThat("1, 2, 3", Matchers.equalTo(template.evalute()));
    }
}
