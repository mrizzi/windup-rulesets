import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    public void configure() {
        from("file:src/data?noop=true")
            .choice()
            .when(xpath("/person/city = 'London'"))
            .to("xslt:xslt/copy-all.xsl")
            .to("bean:beanName[?options]")
            .to("browse:someName[?options]")
            .to("controlbus:command[?options]")
            .otherwise()
            .to("file:target/messages/others");
    }
}
