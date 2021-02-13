# REST5000API

Youtube 5000 Test Link: https://youtu.be/Gg8vxxjV6AU

DESCRIPTION:
This repository is a SpringBoot REST API which accept a HTTP REQUEST with url Pattern ("/").
The request increments a number stored in database for each call.
The methods that interacts with mysql database are kept synchronized.
Nextly, Jmeter is used to send 5000 parallel requests to this REST API.

INSTALLATION:
Download the project and run it as a SPRING BOOT APPLICATION.
The project automatically creates the database and table in MYSQL.
DatabaseName : api5000base
TableName : tbl_number

TEST:
Open JMeter
-> Create a Thread Group and set the number of users to 5000.
-> Add Sampler-> HTTP Request to this thread group and set the url to hit
localhost:portNumber/
-> Add Listener->view results tree ,to get the responses.


