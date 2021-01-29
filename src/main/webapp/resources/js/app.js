'use strict';

let bookDemo = angular.module('bookDemo', [], function($locationProvider) {
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
});
