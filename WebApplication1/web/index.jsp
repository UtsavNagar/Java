
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Covid-19 Information portal</h1>
        <hr>
        <form action="VerifyUser" method="POST">
            <pre>
                        <h1>Login Form</h1>

            Email/uid  <input name="email" placeholder="ex. : email12@gmail.com"/>

            Password   <input name="password" placeholder="*********"/>

            User-type  <select name="user-type" >
                            <option value="user">user</option>
                            <option value="state-admin">state-admin</option>
                            <option value="admin">admin</option>
                       </select>

                       <input type="submit" value="Login"/> <input type="reset" value="Reset"/>
                       
                       <a href="registration.jsp" >Create New Account </a>
            </pre>
        </form>
        <hr>
    </body>
</html>
 

