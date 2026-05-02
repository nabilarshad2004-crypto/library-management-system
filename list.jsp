<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Books</h2>
<a href="/add">Add Book</a>
<table border="1">
<tr><th>Title</th></tr>
<c:forEach var="b" items="${books}">
<tr><td>${b.title}</td></tr>
</c:forEach>
</table>
