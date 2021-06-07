class Paypal extends Payment{
    constructor(id, email){
        super(id);
        this.email = email;
    }

    printDataPaypal() {
        console.log(this.id);
        console.log(this.email);
    }
}