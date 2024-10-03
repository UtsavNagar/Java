<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="DataProvider">
            <pre>
                Country name : <select name="country">
                                <option value="India">india</option>
                                <option value="pakistan">pakistan</option>
                                <option value="uk">uk</option>
                               </select>
                Donation : <select name="donation" multiple="multiple" required>
                                <option value="mask">mask</option>
                                <option value="ppe">ppe</option>
                                <option value="vaccine">vaccine</option>
                                <option value="vaccine">vaccine</option>
                             </select>
                User name : <input name="user-name" type="text" placeholder="ex.: Utsav">
                            <button type="submit"> Submit</button>
            </pre>
        </form>
    </body>
</html>
