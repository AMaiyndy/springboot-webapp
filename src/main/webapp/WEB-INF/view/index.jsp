<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="bookDemo">
<head>
    <title>Title</title>
    <script src="<c:url value="/resources/js/angular.min.js"/>"></script>
    <script src="<c:url value="/resources/js/app.js"/>"></script>
    <script src="<c:url value="/resources/js/controller/book_cntrl.js"/>"></script>
</head>
<body ng-controller="bookCtrl">
<h1>Hello</h1>
<div>
    <div>
        <label for="bookId">Book Id</label>
        <div>
            <input type="text" ng-model="bookId" id="bookId" placeholder="Enter the book id"/>
        </div>
    </div>
</div>
<div>
    <div>
        <input type="button" style="cursor:pointer" value="Get a fucking book!" ng-click ="getBook()" ng-disabled="buttonDisabled"/>
        <%--            <button type="button" ng-click="bookCtrl.reset()" class="btn">Reset Form</button>--%>
    </div>
</div>

<h3>JSON:</h3>
<div><pre>{{book | json}}</pre></div>
</body>
</html>
