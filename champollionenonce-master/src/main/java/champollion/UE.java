package champollion;

import java.util.*;

public class UE {
    private final String myIntitule;

    private int heureCM;
    private int heureTD;
    private int heureTP;
    private Set<Intervention> interventions = new HashSet<>();
    public UE(String intitule) {
        myIntitule = intitule;
    }

    public String getIntitule() {
        return myIntitule;
    }

    
}
