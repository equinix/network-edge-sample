#Network Edge Code Sample
- 1. Create CSR1KV NonHA & HA Device
- 2. AWS Connection with Virtual Device
- 3. Establish BGP Peering
- 4. Establish VPN Conncetivity

Development Guidelines

#	Prerequisites to use Sample code
-	Install Oracle JDK 1.7 and above.
-	Install Maven or Maven Plugins to IDEs (E.g. Eclipse, IntelliJ etc.).

#	Development support
-	Import the project as a Maven Project in the IDE.
- 	Open ecxfabric-sample/src/main/java/com/equinix/ecx/fabric/config/ApiConfiguration.java
- 	Within ApiConfiguration, update user credentials Client_id, Client_secret, User_name,User_password.
- 	Examples are provided in examples package. They are pointing to Developer (https://api.equinix.com).
-	Test and make calls to ECX APIs with the help of sample programs provided.
-   In each examples there are few user values needs to updated. Please check the comments section in examples.
