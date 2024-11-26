<%
    int income = Integer.parseInt(request.getParameter("income"));
    int age = Integer.parseInt(request.getParameter("age"));
    
    //    1st approach
//    myPkg.TaxBean tb = new myPkg.TaxBean();    // instance of tax bean
//    
//    // set values 
//    tb.setIncome(income);
//    tb.setAge(age);

%>

<%-- instanciate bean 2nd --%>
<jsp:useBean id="bean" class="myPkg.TaxBean" />
    
<%-- set the income--%>
<%--

<jsp:setProperty name="bean" property="income" value="<%=income%>" />
<jsp:setProperty name="bean" property="age" value="<%=age%>" />

--%>

<!--more easy  3rd--> 
<%--
<jsp:setProperty name="bean" property="income" param="income" />
<jsp:setProperty name="bean" property="age" param="age" />
--%>


   <!--4th more easy-->
<jsp:setProperty name="bean" property="*" />   

<html>
    <body>
        <h1>Tax Information</h1>
        <hr>
        <pre>
        income : <jsp:getProperty name="bean" property="income"/>

        age    : <jsp:getProperty name="bean" property="age" />

        tax    : <jsp:getProperty name="bean" property="tax"/>
        </pre>
        <hr>
        <a href="index.jsp">Home</a>
    </body>
</html>
