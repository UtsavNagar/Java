<jsp:useBean id="medicine" class="myPkg.Medicine" scope="session" />

<html>
    <body>
        <h1>Medicine Details</h1>
        <pre>
            name  : <jsp:getProperty name="medicine" property="name" />
            type  :<jsp:getProperty name="medicine" property="type" />
            code  :<jsp:getProperty name="medicine" property="code" />
            price :<jsp:getProperty name="medicine" property="price" />
        </pre>
        <a href="searchMedicine.jsp">search-more</a>
        <a href="index.jsp">home</a>
    </body>
</html>
