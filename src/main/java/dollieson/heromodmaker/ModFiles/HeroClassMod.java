package dollieson.heromodmaker.ModFiles;

public class HeroClassMod extends ModFile{
    private String Name;
    // Fighter or Caster
    private String Type;
    //Lookup
    private String Faction;
    //Lookup List
    private String GoodStats;
    //Lookup List
    private String BadStats;
    //Lookup List
    private String Abilities;

    public HeroClassMod() {
    }

    public HeroClassMod(String name, String type, String faction, String goodStats, String badStats, String abilities) {
        Name = name;
        Type = type;
        Faction = faction;
        GoodStats = goodStats;
        BadStats = badStats;
        Abilities = abilities;
    }

    public String getName() {
        return Name;
    }

    public HeroClassMod setName(String name) {
        Name = name;
        return this;
    }

    public String getType() {
        return Type;
    }

    public HeroClassMod setType(String type) {
        Type = type;
        return this;
    }

    public String getFaction() {
        return Faction;
    }

    public HeroClassMod setFaction(String faction) {
        Faction = faction;
        return this;
    }

    public String getGoodStats() {
        return GoodStats;
    }

    public HeroClassMod setGoodStats(String goodStats) {
        GoodStats = goodStats;
        return this;
    }

    public String getBadStats() {
        return BadStats;
    }

    public HeroClassMod setBadStats(String badStats) {
        BadStats = badStats;
        return this;
    }

    public String getAbilities() {
        return Abilities;
    }

    public HeroClassMod setAbilities(String abilities) {
        Abilities = abilities;
        return this;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s\n",this.Name));
        str.append(String.format("Type: %s\n",this.Type.toString()));
        str.append(String.format("Faction: %s\n",this.Faction.toString()));
        str.append(String.format("Good Stats: %s\n",this.GoodStats.toString()));
        str.append(String.format("Bad Stats: %s\n",this.BadStats.toString()));
        str.append(String.format("Abilities: %s\n",this.Abilities.toString()));
        return str.toString();
    }
}
