FROM openjdk:1.8
EXPOSE 8088
ADD target/springboot-cicdjenkensdockerintegratio.jar springboot-cicdjenkensdockerintegratio.jar
ENTRYPOINT ["java","-jar","/springboot-cicdjenkensdockerintegratio.jar"]