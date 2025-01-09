package in.lakshay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="studenttabRestApi")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sid")
    private Long studentId;

    @Column(name="sname")
    private String studentName;

    @Column(name="sage")
    private Integer studentAge;

    @Column(name="sgender")
    private String studentGender;

    @Column(name="sdept")
    private String studentDept;

    @Column(name="saddr")
    private String studentAddr;
}
