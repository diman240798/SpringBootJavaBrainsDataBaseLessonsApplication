package io.javabrains.cpurseapidata.topic;


import javax.persistence.*;

@Entity(name = "Topic")
public class Topic {

    @Id
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
