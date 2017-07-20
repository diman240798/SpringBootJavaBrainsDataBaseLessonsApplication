package io.javabrains.cpurseapidata.course;


import io.javabrains.cpurseapidata.topic.Topic;

import javax.persistence.*;

@Entity(name = "Course")
public class Course {

    @Id
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;


    @ManyToOne
    private Topic topic;

    public Course() {
    }

    public Course(String id, String name, String description, String topic_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(id, "", "");
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
