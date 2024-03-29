package dollieson.heromodmaker;

import java.util.ArrayList;
import java.util.HashMap;

// this is disgusting and this has to have another way
public class ConstantValues {

    private ConstantValues(){

    }
    public static HashMap<String,Integer> ArtifactSlots;
    public static HashMap<String,Integer> getArtifactSlots(){
        if(ArtifactSlots == null){
            ArtifactSlots = new HashMap<>();
            ArtifactSlots.put("Helmet",1);
            ArtifactSlots.put("Necklace",2);
            ArtifactSlots.put("Torso",3);
            ArtifactSlots.put("Cape",4);
            ArtifactSlots.put("Weapon",5);
            ArtifactSlots.put("Shield",6);
            ArtifactSlots.put("Trinket",7);
            ArtifactSlots.put("Gloves",8);
            ArtifactSlots.put("Boots",9);
            ArtifactSlots.put("Legs",10);
        }
        return ArtifactSlots;
    }

    public static HashMap<String,Integer> ItemQuality;

    public static HashMap<String, Integer> getItemQuality() {
        if(ItemQuality == null){
            ItemQuality = new HashMap<>();
            ItemQuality.put("Basic",1);
            ItemQuality.put("Intermediate",2);
            ItemQuality.put("Advanced",3);
            ItemQuality.put("Greater",4);
            ItemQuality.put("Ultimate",5);
        }
        return ItemQuality;
    }

    public static HashMap<String,Integer> ArtifactSet;

    public static HashMap<String,Integer> getArtifactSet() {
        if(ArtifactSet == null){
            ArtifactSet = new HashMap<>();
            ArtifactSet.put("none",0);
            ArtifactSet.put("Mesmer",1);
            ArtifactSet.put("Rabbit",2);
            ArtifactSet.put("Titan",3);
            ArtifactSet.put("Mandel",4);
            ArtifactSet.put("Tusk",5);
            ArtifactSet.put("Widle",6);
            ArtifactSet.put("Echoes",7);
        }
        return ArtifactSet;
    }
}
