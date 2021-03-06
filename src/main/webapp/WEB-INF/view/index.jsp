<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="bookDemo">
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/styles.css"/>"/>
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
        <input type="button" style="cursor:pointer" value="Get book!" ng-click ="getBook()" ng-disabled="getBookButtonDisabled"/>
        <%--            <button type="button" ng-click="bookCtrl.reset()" class="btn">Reset Form</button>--%>
    </div>
</div>
<h3>JSON:</h3>
<span class="textarea" contenteditable="true"><pre>{{book | json}}</pre></span>
<input type="button" style="cursor:pointer" value="Update Book!" ng-click ="updateBook()" ng-disabled="updateBookDisabled"/>
</body>
</html>
