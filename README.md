Enter the correct source mail and password in holidaynotification application.
Start all the 3 application.
First start eruka server and then other 2 application.

Add the input json data from the 'HOLIDAY INPUT LIST' file using postman(I preferred).
url(Post Method)- http://localhost:8081/holiday/add

Then hit the below url with mail id(s)-> json data from the 'PROVIDE MAIL ID' file using postman.
url(Post Method)- http://localhost:8082/holidaynoti/sendmail

