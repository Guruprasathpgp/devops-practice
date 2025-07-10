


FROM tomcat:10-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR into Tomcat

COPY target/java-webapp.war /usr/local/tomcat/webapps/java-webapp.war

CMD ["catalina.sh", "run"]
