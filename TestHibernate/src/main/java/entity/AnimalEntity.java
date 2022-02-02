package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "animal", schema = "mydbtest", catalog = "")
public class AnimalEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "animal_name")
    private String animalName;
    @Basic
    @Column(name = "animal_desc")
    private String animalDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalDesc() {
        return animalDesc;
    }

    public void setAnimalDesc(String animalDesc) {
        this.animalDesc = animalDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntity that = (AnimalEntity) o;
        return id == that.id && Objects.equals(animalName, that.animalName) && Objects.equals(animalDesc, that.animalDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, animalName, animalDesc);
    }
}
