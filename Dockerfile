FROM java:openjdk-8-jdk

ADD /core/java/runWeatherForecast/target/runWeatherForecast-1.0.0.jar runWeatherForecast-1.0.0.jar

ADD /core/java/runWeatherForecast/runWeatherForecast.yml runWeatherForecast.yml

CMD java -jar runWeatherForecast-1.0.0.jar server runWeatherForecast.yml

EXPOSE 8200