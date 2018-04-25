var app = angular.module('src', []);

app.controller('sampleController', function($scope)
{
    $scope.first="Hello";
    $scope.last="World";

    $scope.combineNames = function(){

        return $scope.first + " " + $scope.last;

    };
});