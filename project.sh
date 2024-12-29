# !/bin/bash

if [ "$1" == "verify" ]
then
	mvn verify
elif [ "$1" == "run" ]
then
	mvn exec:java -Dexec.mainClass="com.example.App"
else
	echo "INVALID ARGUMENT: $1"
fi
