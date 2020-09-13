## Junit: running from CMD line

## Directory Structure
- mylibs
  - holds dependent jars (junit and hamcrest)
- mybuild
  - holds class files generated
- src/main/java
  - source code
- src/test/java
  - test suite

## Compile MyMath.java ( from project root )
- `javac -d "./mybuild/classes/main" src/main/java/com/babusa/learn/MyMath.java`

## Compile MyMathTest.java ( from project root )
- `javac -d "./mybuild/classes/test" -cp "./mylibs/*:./mybuild/classes/main/"  src/test/java/com/babusa/learn/MyMathTest.java`
- **Note:** refer to all jars in a dir using `/*` while refer to all class files in a dir suing `/`

## Combined Compilation cmd (from project root)
- `javac -d "./mybuild/classes/main" src/main/java/com/babusa/learn/MyMath.java && javac -d "./mybuild/classes/test" -cp "./mylibs/*:./mybuild/classes/main/"  src/test/java/com/babusa/learn/MyMathTest.java`

## Run test ( from /mybuild/classes/test )
- `java -cp "../../../mylibs/*:../main/:."  org.junit.runner.JUnitCore com.babusa.learn.MyMathTest`


