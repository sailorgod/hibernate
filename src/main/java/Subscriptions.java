import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Subscriptions {

    private int studentId;
    private int courseId;
    private Date subscriptionDate;

}
