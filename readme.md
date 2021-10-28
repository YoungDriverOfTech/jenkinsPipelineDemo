- start jenkins
```
docker run -u 0 -d -p 8081:8080 -v `pwd`/jenkins-data:/var/jenkins_home jenkins/jenkins
```

- get key
```
d66ac00c63454fada84ffa5179131a29
```

- select pipeline and git plugin to install

- entry jenkins
1. new item -> free style project
2. Source Code Management -> git -> build branch: main -> https -> Build -> mvn test
3. page click  build now

- mvn wrapper
modify mvn test to ./mvnw test

remember add .mvn's jar file add into git repository