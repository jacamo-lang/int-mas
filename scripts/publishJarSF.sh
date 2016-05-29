#/bin/sh

REL=1.0.0
MAVEN=build/maven/$REL

# check user at sourceforge
if [ -z $USERSF ] ; then
    echo the var USERSF must be set with the username at source forge
    exit
fi

CP=src/lib/jason.jar:src/lib/moise.jar:src/lib/cartago.jar:src/lib/c4jason.jar
JAR=build/maven/$REL/intmas-$REL.jar

mkdir -p $MAVEN

# compile
rm -rf build/classes
mkdir -p build/classes
find src/src -name "*.java" > sources.txt
javac -cp $CP -d build/classes @sources.txt
rm sources.txt

# make jar
jar cf $JAR -C build/classes .

# send to SF
POM=build/maven/$REL/intmas-$REL.pom
echo '<?xml version="1.0" encoding="UTF-8"?>' > $POM
echo '<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">' >> $POM
echo '<modelVersion>4.0.0</modelVersion>' >> $POM
echo '  <groupId>org.jacamo</groupId>' >> $POM
echo '  <artifactId>intmas</artifactId>' >> $POM
echo '  <version>'$REL'</version>' >> $POM
echo '</project>' >> $POM

cd build/maven
scp -r $REL $USERSF,jacamo@web.sf.net:/home/project-web/jacamo/htdocs/maven2/org/jacamo/intmas
