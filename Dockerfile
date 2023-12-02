FROM openjdk:11-jre-slim

WORKDIR /app

# 确保这里的路径与 Maven 构建出的 JAR 文件相匹配
COPY target/zmall-1.0-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

# 确保启动命令正确
CMD ["java", "-jar", "app.jar"]
