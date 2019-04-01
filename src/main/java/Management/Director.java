package Management;

import Management.Manager;

public class Director extends Manager {
    private double budget;

    public Director(String name, double budget){
        super(name,  "Marketing");
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }
    }

