package strategy;

public class Entity {

    private int    id;
    private String description;

    public Entity(int newID, String newDescription) {
        this.id = newID;
        this.description = newDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
