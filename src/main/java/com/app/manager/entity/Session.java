package com.app.manager.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "session")
public class Session {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id; // SessionModel

    @Column(name = "courseid")
    private String courseid; // SessionModel

    @ManyToOne
    @JoinColumn(name = "courseid", updatable = false, insertable = false)
    private Course course;

    @Column(name = "userid")
    private String userid; // SessionModel

    @ManyToOne
    @JoinColumn(name = "userid", updatable = false, insertable = false)
    private User user;

    @OneToMany(mappedBy = "session")
    private List<Attendance> attendances; 



    @NotBlank
    @Column(name = "name", nullable = false)
    private String name; // SessionModel


    @Column(name = "starttime", nullable = false)
    private Long starttime; // SessionModel

    @Min(value = 0)
    @Column(name = "attendanceduration", nullable = false)
    private int attendanceduration; // SessionModel

    @Column(name = "attendancechecked", nullable = false)
    private boolean attendancechecked; // SessionModel 



    @Column(name = "status", nullable = false)
    private StatusEnum status; // SessionModel

    @Column(name = "createdat", nullable = false)
    private Long createdat; // SessionModel

    @Column(name = "updatedat", nullable = false)
    private Long updatedat;

    @Column(name = "deletedat")
    private Long deletedat;

    public Session() {
        attendancechecked = false;
        status = StatusEnum.PENDING;
        createdat = System.currentTimeMillis();
        updatedat = System.currentTimeMillis();
    }

    public enum StatusEnum {
        ALL(0, "All"),
        PENDING(1, "Pending"),
        ONGOING(2, "Ongoing"),
        ATTENDANCE_CHECK(3, "Attendance check"),
        EXERCISING(4, "Exercising"),
        END(5, "END");

        private final int value;
        private final String name;

        StatusEnum(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return value;
        }
        public String getName() {
            return name;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Long getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Long createdat) {
        this.createdat = createdat;
    }

    public Long getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Long updatedat) {
        this.updatedat = updatedat;
    }

    public Long getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(Long deletedat) {
        this.deletedat = deletedat;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseId) {
        this.courseid = courseId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userId) {
        this.userid = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStarttime() {
        return starttime;
    }

    public void setStarttime(Long starttime) {
        this.starttime = starttime;
    }

    public int getAttendanceduration() {
        return attendanceduration;
    }

    public void setAttendanceduration(int attendanceduration) {
        this.attendanceduration = attendanceduration;
    }

    public boolean isAttendancechecked() {
        return attendancechecked;
    }

    public void setAttendancechecked(boolean attendancechecked) {
        this.attendancechecked = attendancechecked;
    }
}
