package com.datarepublic;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

public class App 
{
  public static void main(String[] args)
  {
    if (args.length != 2) {
      System.err.println("Usage: mvn exec:java -Dexec.mainClass=\"com.datarepublic.App\" -Dexec.args=\"SALT RAW_VALUE\"");
      System.exit(1);
    }

    String salt = args[0];
    String value = args[1];
    System.out.println("Raw value is: " + value);
    System.out.println("Salt is: " + salt);

    byte[] digest = DigestUtils.sha512(value + salt);
    String hash = Base64.encodeBase64String(digest);

    System.out.println("Hashed value is: " + hash);
  }
}
