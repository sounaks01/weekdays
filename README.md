# Sample REST API For WeekDays application

To build the the project maven should be available in your system. Then you can use the below command to start the project.

```bash
mvn package
java -jar target/spring-boot-weekdays-0.0.1-SNAPSHOT.jar

```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The application will start running at <http://localhost:8088>.

## Rest APIs details

The app defines following APIs.

    GET /api/weekdays
    Response 
    {
    "dayOfWeek": "0. TUESDAY,1. WEDNESDAY,2. THURSDAY,3. FRIDAY,4. SATURDAY,5. SUNDAY,6. MONDAY,",
    "currentTime": "2020-05-26T16:07:00.482",
    "oneDayPluscurrentTime": "2020-05-27T16:07:00.482",
    "twoDayPluscurrentTime": "2020-05-28T16:07:00.482"
	}
	
	

    POST /api/weekdays
	Request Body
	{
	"currentTime" : "2020-05-27T16:04:55.884"
	}
	Response
	{
    "dayOfWeek": "0. WEDNESDAY,1. THURSDAY,2. FRIDAY,3. SATURDAY,4. SUNDAY,5. MONDAY,6. TUESDAY,",
    "currentTime": "2020-05-27T16:04:55.884",
    "oneDayPluscurrentTime": "2020-05-28T16:04:55.884",
    "twoDayPluscurrentTime": "2020-05-29T16:04:55.884"
	}
	

