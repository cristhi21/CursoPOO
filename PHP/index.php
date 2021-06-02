<?php

require_once('./Car.php');
require_once('./Account.php');
// include 'Car.php';
// include 'Account.php';

$car = new Car("CDO17A", new Account("Cristhian Vargas", "114412312"));
$car->printDataCar();