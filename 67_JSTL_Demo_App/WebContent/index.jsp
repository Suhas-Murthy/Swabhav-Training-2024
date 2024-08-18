<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<c:out value="Suhas"></c:out>
<c:set var="greet" value="Hello" scope="session"></c:set>
<c:out value="${greet}"></c:out><p>

<c:set var="number" value="2"></c:set>
<c:if test="${number%2==0}">
<h1>Even</h1></c:if>

Values from 1 to 10<p>
<c:forEach var="i" begin="1" end="10">  <c:out value="${i}"/> <p></c:forEach> 


<c:set var="income" scope="session" value="${4000*3}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>
<c:url value="/RegisterDao.jsp"/> 
<p>
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>    
</body>
</html>