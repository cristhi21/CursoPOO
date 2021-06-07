package Java;

import java.util.Date;

public class Card extends Payment {
    String number;
    String cvv;
    Date date;
    
    public Card(Integer id, String number, String cvv, Date date){
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
