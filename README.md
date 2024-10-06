This repository will help to start a Springboot project. Nice boilerplate to run the springboot project in local environment inside Docker Container. Example REST API enpoint also created to test whether the project run correctly. 
# How to start:
1. Clone the repo.
2. Run the command to build image: ```docker-compose up --build```
3. Run to start: ```docker-compose up -d ```
4. App will run on port 8080: http://localhost:8080

# DB Image used: postgres:12

# How does it work? a Springboot - kotlin project:
1. First: Package build from spring.io
2. Then load the project in ide
3. write pom.xml with related dependency load
4. Update build.gradle.kts - with specific plugins and dependencies if needed
5. Write controllers
6. Write controllers with requests
7. Error handling if any issue appare.
8. create a customErrorHandling class for better error handling.
9. Setup ide for autobuild on code update

If The getMapping is not working -- Add tomcat dependency in pom.xml / dependencies in build.gradle.kts (This is an exception for beginners)






