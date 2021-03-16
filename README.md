You can use it by add dependency info:

```xml
<dependency>
    <groupId>net.smallyu.maven</groupId>
    <artifactId>test</artifactId>
    <version>0.3</version>
</dependency>
```

And run as this:

```java
import net.smallyu.maven.test.Hello;

/**
 * @Author: smallyu
 * @Date: 2021/3/16 下午3:56
 **/
public class Test {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.say();
    }
}
```

(This is my first package publish to maven central.)
