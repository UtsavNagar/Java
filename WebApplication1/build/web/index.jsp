
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        
        <script language="JavaScript">
            let request = null;
            function one(){
                let email = document.getElementById("email").value;
                request = new XMLHttpRequest();
                request.onreadystatechange = two;
                request.open("get","isUserAvailable.jsp?id="+email,true);
                request.send(null);
            }
            function two() {
                if (request.status === 200 && request.readyState === 4) { // Fixed spelling of 'request'
                    document.getElementById("data").innerHTML = request.responseText;
                } else {
                    document.getElementById("data").innerHTML = "request failed";
                }
            }

        </script>
    </head>
    <body>
        <h1>Covid-19 Information portal</h1>
        <hr>
        <form action="VerifyUser" method="POST">
            <pre>
                        <h1>Login Form</h1>

            Email/uid  <input name="email" id="email" placeholder="ex. : email12@gmail.com"/> <input type="button" value="Check" onclick="one()"/> 
                                                                                              <div id="data"></div>

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
        <a href="helpline.jsp">Covid Helpline</a>
    </body>
</html>
 
<%@include file="info.jsp" %>


