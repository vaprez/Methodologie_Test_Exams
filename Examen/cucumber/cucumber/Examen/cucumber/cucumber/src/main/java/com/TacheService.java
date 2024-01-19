package com;

import java.util.ArrayList;
import java.util.List;

public class TacheService {

    public List<Tache> obtenirListeDesTaches() {
        // TODO: Implement logic to obtain the list of tasks
        // For example, you can fetch the tasks from a database or an API
        
        List<Tache> taches = new ArrayList<>();
        
        // Add your logic here to populate the list of tasks
        taches.add(new Tache("Tâche 1"));
        taches.add(new Tache("Tâche 2"));
        return taches;
        
    }

}
