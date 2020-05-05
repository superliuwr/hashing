This is a simple Java CLI application that takes a raw value and a salt and returns the hashed value
using SHA512 and encoded in Base64 format.

To run it:
```
mvn compile
mvn exec:java -Dexec.mainClass="com.datarepublic.App" -Dexec.args="YOUR_SALT RAW_VALUE"
```