'use strict';

angular.module('bookDemo').controller('bookCtrl', function ($scope, $http, $timeout) {
    const SERVICE_URI = 'http://localhost:8081/api/v1/test-utils/books/';
    $scope.bookId = 0;
    $scope.buttonDisabled = false;
    $scope.book = null;
    $scope.getBook = getBook;

    function getBook() {
        console.log('get book id', $scope.bookId);
        $scope.buttonDisabled = true;
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
        $timeout(function(){
            $scope.buttonDisabled = false;
        }, 5000);
    }

    // function edit(id) {
    //     console.log('id (Book) to be edited', id);
    //     for (var i = 0; i < self.books.length; i++) {
    //         if (self.books[i].id === id) {
    //             self.book = angular.copy(self.books[i]);
    //             break;
    //         }
    //     }
    // }
    //
    // function reset() {
    //     self.book = {id: null, title: '', author: '', quantity: null};
    //     $scope.bookForm.$setPristine();
    // }
});