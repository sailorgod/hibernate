import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Courses {

    private int id;
    private String name;
    private int duration;
    private CourseType type;
    private String description;
    private int teacherId;
    private int studentsCount;
    private int price;
    private double price_per_hour;

}
