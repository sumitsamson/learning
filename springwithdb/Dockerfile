#base image
FROM tomcat:latest
MAINTAINER SUMIT SAMSON

LABEL created_by="sumit"
LABEL version="1.0"
LABEL date_of_creation="17-April-2018"

RUN ["echo","Tomcat home set to : $catalina_home"]
COPY target/springwithdb.war /usr/local/tomcat/webapps/
COPY tomcat-users.xml /usr/local/tomcat/conf/

RUN ["echo" , "File copied,checking"]
WORKDIR /usr/local/tomcat/webapps
RUN ["pwd"]
RUN ["ls"]


