### Compile a Module
```sh
$ javac -d out src/module-info.java
$ javac -d out --module-path out src/hello/jlink/HelloWorld.java

# run the program
$ java --module-path out --module jlinkModule/hello.jlink.HelloWorld

Oct 11, 2019 3:22:14 PM hello.jlink.HelloWorld main
INFO: Hello World!
```

### List the Dependent Modules
```sh
$ jdeps --module-path out -s --module jlinkModule

jlinkModule -> java.base
jlinkModule -> java.logging
```

### Create a Custom JRE
```sh
$ jlink --module-path %JAVA_HOME%\jmods:out --add-modules jlinkModule --output customjre

$ du -sh customjre
 38M	customjre

# run the app with the Generated Image
$ cd customjre
$ bin/java --module jlinkModule/hello.jlink.HelloWorld
```

### Create Custom JRE with Launcher Scripts
```sh
$ jlink --launcher customjrelauncher=jlinkModule/hello.jlink.HelloWorld --module-path %JAVA_HOME%\jmods:out --add-modules jlinkModule --output customjre
# run the script
$ customjre/bin/customjrelauncher
```
