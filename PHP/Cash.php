<?php
require_once('Payment.php');

class Card extends Payment {

    function __construct($id) {
        parent::__construct($id);
    }
}