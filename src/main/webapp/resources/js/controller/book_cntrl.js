'use strict';

angular.module('bookDemo').controller('bookCtrl', ['$scope', '$http', '$timeout', function ($scope, $http, $timeout) {
    const SERVICE_URI = 'http://localhost:8081/api/v1/test-utils/books/';
    $scope.bookId = 0;
    $scope.getBookButtonDisabled = false;
    $scope.updateBookDisabled = false;
    $scope.book = null;
    $scope.getBook = getBook;
    $scope.updateBook = updateBook;

    function getBook() {
        console.log('get book id', $scope.bookId);
        $scope.getBookButtonDisabled = true;
        $http.get(SERVICE_URI + $scope.bookId)
            .then(
                function (response) {
                    $scope.book = response.data;
                    console.log('book:', $scope.bookId)
                },
                function (errResponse) {
                    console.error('Error while fetching Students');
                }
            );
        $timeout(function () {
            $scope.getBookButtonDisabled = false;
        }, 5000);
    }

    function updateBook() {
        console.log('updateBook', $scope.book);
        $scope.updateBookDisabled = true;
        $http.post(SERVICE_URI + 'update', $scope.book)
            .then(
                function (response) {
                    $scope.book = response.data;
                    console.log('book:', $scope.bookId)
                },
                function (errResponse) {
                    console.error('Error while fetching Students');
                }
            );
        $timeout(function () {
            $scope.updateBookDisabled = false;
        }, 5000);
    }
}]);