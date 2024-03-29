package dollieson.heromodmaker;

import java.util.*;

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
    public static Set<String> ArtifactEffects;
    public static Set<String> getArtifactEffects(){
        if(ArtifactEffects == null){
            ArtifactEffects = new HashSet<>();
            ArtifactEffects.addAll(List.of(new String[]{
                    "Attack",
                    "Defense",
                    "Knowledge",
                    "Spellpower",
                    "Morale",
                    "Luck",
                    "Movement",
                    "Sight",
                    "Speed",
                    "Gold",
                    "Ore",
                    "Wood",
                    "Mercury",
                    "Crystal",
                    "Gems",
                    "Sulphur",
                    "Call of the Wild",
                    "Call Elements",
                    "Armorer",
                    "Offense",
                    "Archery",
                    "Warding",
                    "Leadership",
                    "Fortune",
                    "Combat",
                    "Tactics",
                    "Champion",
                    "Legion",
                    "Tactics",
                    "Champion",
                    "Legion",
                    "Oligarchy",
                    "Swiftness",
                    "Armorsmith",
                    "Demoralise",
                    "Tragedy",
                    "Toxicology",
                    "Midas",
                    "Elementalism",
                    "Midas Touch",
                    "Bloodlust",
                    "Destruction",
                    "Swarming",
                    "Destruction",
                    "Recalcitrance",
                    "Hex",
                    "Hoard",
                    "Call Beasts",
                    "Second Chance",
                    "Hydromancy",
                    "Terramancy",
                    "Aeromancy",
                    "Pyromancy",
                    "Socrery",
                    "Wisdom",
                    "Mysticism",
                    "Regeneration",
                    "Summoning",
                    "Potency",
                    "Heavy Soul",
                    "Weightless Soul",
                    "Frozen Heart",
                    "Resurrection",
                    "Echo",
                    "Avatar",
                    "Buffer",
                    "Diplomancy",
                    "Demonology",
                    "Necromancy",
                    "Creation",
                    "Dragonking",
                    "Bloodwarping",
                    "Mastery",
                    "Blight Ritual",
                    "Mercurial",
                    "Hegemony",
                    "Crystal Assembly",
                    "Estates",
                    "Recruitment",
                    "Planning",
                    "Royalty",
                    "Mason",
                    "Banditry",
                    "Spatial Rift",
                    "Infest",
                    "Exploitation",
                    "Antagonism",
                    "Healing",
                    "Learning",
                    "Logistics",
                    "Scouting",
                    "Plunder",
                    "Engineering",
                    "Bodyguards",
                    "Devour",
                    "Dizzy",
                    "Enchanting",
                    "Creativity",
                    "Tinker",
                    "Lovely Tune",
                    "Rallying",
                    "Blessing",
                    "Lifespark",
                    "Alchemy",
                    "Aethermancy",
                    "Bane",
                    "Malediction",
                    "Firegating",
                    "Firetrapping",
                    "Might",
                    "Ardour",
                    "Hunting",
                    "Taming",
                    "Shadowcloning",
                    "Shadowcasting",
                    "SirenSong",
                    "Conflux",
                    "Soul of the Earth",
                    "Grudge",
                    "Union",
                    "Balance",
                    "Speaker",
                    "Watcher",
            }));
        }
        return  ArtifactEffects;
    }
    private static HashMap<String,Integer> ArtifactType;
    public static HashMap<String,Integer> getArtifactType(){
        if(ArtifactType == null){
            ArtifactType = new HashMap<>();
            ArtifactType.put("Strength",1);
        ArtifactType.put("Magic",0);
        }
        return ArtifactType;
    }
}
