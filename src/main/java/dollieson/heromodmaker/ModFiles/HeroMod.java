package dollieson.heromodmaker.ModFiles;

public class HeroMod extends ModFile {
   private String Name;
   // Look Up
   private String Class;
   //Optional
   private String ClassDisplay;
   //Look up
   private String ClassSprite;
   //Look Up
   private String SpecialUnit;
   //Look Up
   private String StartSpell;
   //Look Up:Custom or Set of Skills
   private String SkillTree;
   //Can Be Zero or Empty
   private String Replace;
   // Look up Faction?
   private String Faction;
   //Look Up
   private String unitGroup;
    //Look Up List
   private String Abilities;

    public HeroMod(String name, String aClass, String classDisplay, String classSprite, String specialUnit, String startSpell, String skillTree, String replace, String faction, String unitGroup, String abilities) {
        Name = name;
        Class = aClass;
        ClassDisplay = classDisplay;
        ClassSprite = classSprite;
        SpecialUnit = specialUnit;
        StartSpell = startSpell;
        SkillTree = skillTree;
        Replace = replace;
        Faction = faction;
        this.unitGroup = unitGroup;
        Abilities = abilities;
    }

    public HeroMod(){

    }

    public String getName() {
        return Name;
    }

    public HeroMod setName(String name) {
        Name = name;
        return this;
    }

    public String getHeroClass() {
        return Class;
    }

    public HeroMod setClass(String aClass) {
        Class = aClass;
        return this;
    }

    public String getClassDisplay() {
        return ClassDisplay;
    }

    public HeroMod setClassDisplay(String classDisplay) {
        ClassDisplay = classDisplay;
        return this;
    }

    public String getClassSprite() {
        return ClassSprite;
    }

    public HeroMod setClassSprite(String classSprite) {
        ClassSprite = classSprite;
        return this;
    }

    public String getSpecialUnit() {
        return SpecialUnit;
    }

    public HeroMod setSpecialUnit(String specialUnit) {
        SpecialUnit = specialUnit;
        return this;
    }

    public String getStartSpell() {
        return StartSpell;
    }

    public HeroMod setStartSpell(String startSpell) {
        StartSpell = startSpell;
        return this;
    }

    public String getSkillTree() {
        return SkillTree;
    }

    public HeroMod setSkillTree(String skillTree) {
        SkillTree = skillTree;
        return this;
    }

    public String getReplace() {
        return Replace;
    }

    public HeroMod setReplace(String replace) {
        Replace = replace;
        return this;
    }

    public String getFaction() {
        return Faction;
    }

    public HeroMod setFaction(String faction) {
        Faction = faction;
        return this;
    }

    public String getUnitGroup() {
        return unitGroup;
    }

    public HeroMod setUnitGroup(String unitGroup) {
        this.unitGroup = unitGroup;
        return this;
    }

    public String getAbilities() {
        return Abilities;
    }

    public HeroMod setAbilities(String abilities) {
        Abilities = abilities;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s\n",this.Name));
        str.append(String.format("Class: %s\n",this.Class.toString()));
        str.append(String.format("Class Display: %s\n",this.ClassDisplay.toString()));
        str.append(String.format("Class Sprite: %s\n",this.ClassSprite.toString()));
        str.append(String.format("Unit: %s\n",this.SpecialUnit.toString()));
        str.append(String.format("Spell: %s\n",this.StartSpell.toString()));
        str.append(String.format("Skills: %s\n",this.SkillTree.toString()));
        str.append(String.format("Replace: %s\n",this.Replace.toString()));
        str.append(String.format("Faction: %s\n",this.Faction.toString()));
        str.append(String.format("Unitgroup: %s\n",this.unitGroup.toString()));
        str.append(String.format("Abilities: %s\n",this.Abilities.toString()));
    return str.toString();
    }
}
