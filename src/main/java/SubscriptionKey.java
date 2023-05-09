import jakarta.persistence.*;

import java.io.Serializable;

public class SubscriptionKey  implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student studentId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course courseId;
}
