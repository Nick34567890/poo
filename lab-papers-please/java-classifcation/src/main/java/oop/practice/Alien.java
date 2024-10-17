
import java.util.List;

public class Alien {
    private int id;
    private Boolean isHumanoid;  // Use Boolean to allow null values
    private String planet;
    private Integer age;          // Use Integer to allow null values
    private List<String> traits;

    // Constructor
    public Alien(int id, Boolean isHumanoid, String planet, Integer age, List<String> traits) {
        this.id = id;
        this.isHumanoid = isHumanoid;
        this.planet = planet;
        this.age = age;
        this.traits = traits;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Boolean getIsHumanoid() {
        return isHumanoid;
    }

    public String getPlanet() {
        return planet;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getTraits() {
        return traits;
    }

    @Override
    public String toString() {
        return "Alien{id=" + id + 
               ", isHumanoid=" + isHumanoid + 
               ", planet='" + planet + '\'' + 
               ", age=" + age + 
               ", traits=" + traits + '}';
    }
}
