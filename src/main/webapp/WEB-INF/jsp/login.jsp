<html>

<head>
<title>Web Application</title>
</head>

<body>
    <font color="red">${errorMessage}</font>
    
    <form action="/login" method="post">
        Username: <input type="text" name="username" value="User" />
        Password: <input type="password" name="password" value="pass" /> 
        <input type="submit" value="Submit"/>
    </form>
    
</body>
</html>
