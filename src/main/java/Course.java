import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    private String name;

    @Setter
    private int duration;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum")
    private CourseType type;

    @Setter
    private String description;

    @Setter
    @Column(name = "teacher_id")
    private int teacherId;

    @Setter
    @Column(name = "students_count")
    private int studentsCount;

    @Setter
    private int price;

    @Setter
    @Column(name = "price_per_hour")
    private double pricePerHour;

}
