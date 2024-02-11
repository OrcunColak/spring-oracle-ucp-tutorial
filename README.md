# Read Me First

The original idea is from  
https://medium.com/oracledevs/a-guide-to-migrating-from-hikaricp-to-oracle-ucp-universal-connection-pool-e2f3fb6db2d5

This page also documents a lot of Hikari properties

# Maven

```
<dependency>
    <groupId>com.oracle.database.spring</groupId>
    <artifactId>oracle-spring-boot-starter-ucp</artifactId>
    <version>23.4.0</version>
</dependency>
```

or

```
<dependency>
  <groupId>com.oracle.database.jdbc</groupId>
  <artifactId>ojdbc11</artifactId>
    <version>23.3.0.23.09</version>
</dependency>
<dependency>
  <groupId>com.oracle.database.jdbc</groupId>
  <artifactId>ucp11</artifactId>
  <version>23.3.0.23.09</version>
</dependency>
```

