import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PurchaseList {

    private String studentName;
    private String courseName;
    private int price;
    private Date subscriptionDate;

}
