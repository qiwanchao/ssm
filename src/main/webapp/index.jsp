<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.list}" var="a">

    ${a.stu_name}

</c:forEach>
</body>
</html>
