package dollieson.heromodmaker.ModFiles;

public class Skill {
    private String Name;
    private String Description;

    public Skill(String name, String description) {
        Name = name;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public Skill setName(String name) {
        Name = name;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public Skill setDescription(String description) {
        Description = description;
        return this;
    }
}
