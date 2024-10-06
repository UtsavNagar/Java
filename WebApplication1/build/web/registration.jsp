<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Covid-19 Information portal</h1>
        <hr>
        <form action="RegistrationServlet" method="POST">
            <pre>
                        <h1>Registration Form</h1>

            Email/uid  <input type="text" name="email" placeholder="ex. : email12@gmail.com"/>

            Password   <input type="password" name="password" placeholder="*********"/>

            Name       <input type="text" name="name" placeholder="ex. : Utsav Nagar"/>

            Address    <input type="text" name="address" placeholder="ex. : Street no. 1 - Vijay Nagar, Indore (MP)"/>

            Mobile     <input type="text" name="mobile" placeholder="XXXXXXXXXX"/>


                       <input type="submit" value="Register"/> <input type="reset" value="Reset"/>
                       
                       <a href="index.jsp">Login</a>
            </pre>
        </form>
        <hr>
    </body>
</html>
