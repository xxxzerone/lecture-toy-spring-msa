# 설정 및 명령어

- intellij 실행
  - Edit Configurations에서 vm options에 "-Dserver.port=9002"
- 터미널 명령어 실행
  - maven
    - mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=9003'
    - java -jar -Dserver.port=9004 ./target/user-service-0.0.1-SNAPSHOT.jar
  - gradle
    - ./gradlew bootRun --args='--server.port=9003'
    - java -jar -Dserver.port=9004 ./build/libs/user-service-0.0.1-SNAPSHOT.jar