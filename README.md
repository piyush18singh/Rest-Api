# Rest-Api
● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
![image](https://user-images.githubusercontent.com/106422266/228818716-63df4d7a-70e1-4e7a-8589-c2656d8232f7.png)


● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server
![image](https://user-images.githubusercontent.com/106422266/228819045-8f73b710-86a2-4e23-9498-6edfbbe1b3b3.png)

![image](https://user-images.githubusercontent.com/106422266/228820033-f590545f-bad5-4b43-a705-3e5304b333cd.png)

● DELETE a server. The parameter is a server ID
![image](https://user-images.githubusercontent.com/106422266/228820220-6570ab9e-e78c-4356-8f00-e50a19b809e4.png)


● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.
![image](https://user-images.githubusercontent.com/106422266/228819573-223efe1a-ef25-4231-bb97-3021d04f5773.png)
