package dollieson.heromodmaker.ModFiles;

import java.util.ArrayList;

public  class ModFile {

    private ArrayList<ArtifactMod> Artifacts;
    private String ModName;

    public ModFile(String Name){
        ModName = Name;
        ArrayList<ArtifactMod> Artifacts = new ArrayList<>();
    }

    public ArrayList<ArtifactMod> getArtifacts() {
        return Artifacts;
    }

    public ModFile addArtifact(ArtifactMod Artifact){
        Artifacts.add(Artifact);
        return this;
    }



}
