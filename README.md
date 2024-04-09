# MicroServices
This folder contains all microservice application and its configuration folder as well

To Exteact as dependency 
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>2.4</version>
    <configuration>
        <includes>
            <include>**/*.class</include>
            <include>**/*.yml</include>
            <include>**/*.properties</include>
        </includes>
    </configuration>
</plugin>
```