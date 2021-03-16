package net.smallyu.maven.test;


import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void hello() {
        Hello hello = new Hello();
        hello.say();
    }
}