package co.com.sofka.crud.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="to_do")
public class ToDo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isCompleted;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private TaskGroup listGroup;

    public ToDo(){}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public TaskGroup getListGroup() {
        return listGroup;
    }

    public void setListGroup(TaskGroup listGroup) {
        this.listGroup = listGroup;
    }
}