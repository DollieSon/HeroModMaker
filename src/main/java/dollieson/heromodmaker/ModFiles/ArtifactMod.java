package dollieson.heromodmaker.ModFiles;

public class ArtifactMod{
    private String Name;
    private String EquipSlot;
    private String Quality;
    private String FirstBonusEffect;
    private Integer FirstBonusStr;

    private String SecondBonusEffect;
    private Integer SecondBonusStr;
    private String PartOfSet;
    private Boolean isStrOriented;

    public ArtifactMod(){

    }

    public ArtifactMod(String name, String equipSlot, String quality, String firstBonusEffect, Integer firstBonusStr, String secondBonusEffect, Integer secondBonusStr, String partOfSet, Boolean isStrOriented) {
        Name = name;
        EquipSlot = equipSlot;
        Quality = quality;
        FirstBonusEffect = firstBonusEffect;
        FirstBonusStr = firstBonusStr;
        SecondBonusEffect = secondBonusEffect;
        SecondBonusStr = secondBonusStr;
        PartOfSet = partOfSet;
        this.isStrOriented = isStrOriented;
    }

    public String getName() {
        return Name;
    }

    public ArtifactMod setName(String name) {
        Name = name;
        return this;
    }

    public String getEquipSlot() {
        return EquipSlot;
    }

    public ArtifactMod setEquipSlot(String equipSlot) {
        EquipSlot = equipSlot;
        return this;
    }

    public String getQuality() {
        return Quality;
    }

    public ArtifactMod setQuality(String quality) {
        Quality = quality;
        return this;
    }

    public String getFirstBonusEffect() {
        return FirstBonusEffect;
    }

    public ArtifactMod setFirstBonusEffect(String firstBonusEffect) {
        FirstBonusEffect = firstBonusEffect;
        return this;
    }

    public Integer getFirstBonusStr() {
        return FirstBonusStr;
    }

    public ArtifactMod setFirstBonusStr(Integer firstBonusStr) {
        FirstBonusStr = firstBonusStr;
        return this;
    }

    public String getSecondBonusEffect() {
        return SecondBonusEffect;
    }

    public ArtifactMod setSecondBonusEffect(String secondBonusEffect) {
        SecondBonusEffect = secondBonusEffect;
        return this;
    }

    public Integer getSecondBonusStr() {
        return SecondBonusStr;
    }

    public ArtifactMod setSecondBonusStr(Integer secondBonusStr) {
        SecondBonusStr = secondBonusStr;
        return this;
    }

    public String getPartOfSet() {
        return PartOfSet;
    }

    public ArtifactMod setPartOfSet(String partOfSet) {
        PartOfSet = partOfSet;
        return this;
    }

    public Boolean getStrOriented() {
        return isStrOriented;
    }

    public ArtifactMod setStrOriented(Boolean strOriented) {
        isStrOriented = strOriented;
        return this;
    }


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Name");
        str.append("\n");
        str.append(this.Name);
        str.append("\n\n");
        str.append("Slot");
        str.append("\n");
        str.append(this.EquipSlot);
        str.append("\n\n");
        str.append("Quality");
        str.append("\n");
        str.append(this.Quality);
        str.append("\n\n");
        str.append("First Bonus: size");
        str.append("\n");
        str.append(this.FirstBonusStr.toString());
        str.append("\n\n");
        str.append("First Bonus: effect");
        str.append("\n");
        str.append(this.FirstBonusEffect);
        str.append("\n\n");
        str.append("Second Bonus:size");
        str.append("\n");
        str.append(this.SecondBonusStr.toString());
        str.append("\n\n");
        str.append("Second Bonus: effect");
        str.append("\n");
        str.append(this.SecondBonusEffect);
        str.append("\n\n");
        str.append("Part of artifact set");
        str.append("\n");
        str.append(this.PartOfSet);
        str.append("\n\n");
        str.append("Strength or Magic Oriented");
        str.append("\n");
        str.append(this.isStrOriented ? "1":"0");
        str.append("\n\n");
        return str.toString();
    }

}
