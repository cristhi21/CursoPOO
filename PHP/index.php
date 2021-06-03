<?php

require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');

$uber = new UberX("EGH-41D", new Account('cristhian vargas', '114416719'),'Audi', 'A6');
$uber->PrintDataCar();

// var_dump($uber);

$uberPool = new UberPool("MGH-59R", new Account('Valentino Rossi', '476435345'), 'Yamaha', 'R1');
$uberPool->PrintDataCar();