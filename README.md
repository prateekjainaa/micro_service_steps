# micro_service_steps
# step 1.
This is step 1 for this micro-service journey.
This step has:

a. stable maven build.
b. fix for 'protocol family unavailable' error in pom.xml
c. docker-compose for building and running service.

Environment: 

Fedora 27, maven 3.5.2, jdk 8, docker 18.03.0-ce

Sometimes you might face issue with IP v6. Due to which service will start properly but
accessing it via localhost might not work. For that try this,

 --> docker network ls   (look for network id for micro-service)
 --> docker inspect db19a509c25d (id of network on your system)

use the IP assigned under IP v4.
