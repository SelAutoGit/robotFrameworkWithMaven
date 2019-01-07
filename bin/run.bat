mvn compiler:compile robotframework:run -Dlog4j2.configurationFile=%cd%/conf/log4j2.xml
mvn clean package -DskipTests=true
java -cp "lib/*" -Dlog4j2.configurationFile=./conf/log4j2.xml org.robotframework.RobotFramework ./testcases/demo.robot
taskkill /F /IM chromedriver.exe