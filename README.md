# Network Edge Code Sample
- Create CSR1KV NonHA Device
- Subscription Based License
- AWS Connection with Virtual Device
- Establish BGP Peering
- Establish VPN Conncetivity
- Create CSR1KV HA Device
- AWS Connection with HA Device
- Establish BGP Peering for HA Connections
- Establish VPN Conncetivity for HA Device

Development Guidelines

#	Prerequisites to use Sample code
-	Install Oracle JDK 1.7 and above.
-	Install Maven or Maven Plugins to IDEs (E.g. Eclipse, IntelliJ etc.).

#	Development support
-	Import the project as a Maven Project in the IDE.
- 	Open network-edge-sample/src/main/java/com/equinix/networkedge/config/ApiConfig.java
- 	Within ApiConfig, update user credentials Client_id, Client_secret, User_name,User_password.
- 	Examples are provided in examples package. They are pointing to Developer (https://api.equinix.com).
-	Test and make calls to Network Edge APIs with the help of sample programs provided.
-   In each examples there are few user values needs to updated. Please check the comments section in examples.
