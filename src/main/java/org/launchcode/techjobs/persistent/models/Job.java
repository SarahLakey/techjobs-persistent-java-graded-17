package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;

    @ManyToOne
    private Employer employer;

    @ManyToMany(mappedBy = "jobs")
    private final List<Skill> skills = new ArrayList<>();

//    private String skills;


    public Job() {
    }

    // Initialize the id and value fields.
//    public Job(Employer employer, String someSkills) {
//        super();
//        this.employer = employer;
//        this.skills = someSkills;
//    }
        public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }



    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> any) {
    }
}
