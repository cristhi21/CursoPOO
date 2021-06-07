<?php
require_once('Payment.php');

class Card extends Payment {
    public $number;
    public $cvv;
    public $date;

    function __construct($id, $number, $cvv, $date) {
        parent::__construct($id);
        $this->number = $number;
        $this->cvv = $cvv;
        $this->date = $date;
    }

    public function PrintDataCard() {
        echo "number: $this->number, cvv: {$this->cvv}, date: $this->date";
    }
}