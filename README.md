# teamcity-dsl-lib-example

```xml
<!-- populate ~/.m2/settings.xml -->
<settings>
  <servers>
    <server>
      <id>my-repo-id</id>
      <username>my-username</username>
      <password>my-password</password>
    </server>
  </servers>
</settings>
```

```shell
mvn clean install
# output is target/TeamCityDslLibExample-1.0-SNAPSHOT.jar
# use with com.brandonros.test.CustomProject
mvn deploy
```
