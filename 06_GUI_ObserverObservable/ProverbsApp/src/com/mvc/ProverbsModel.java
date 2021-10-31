package com.mvc;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

public class ProverbsModel extends Observable {

    private ArrayList<String> proverbs;
    private String currentProverb;
    private Random rand;

    public ProverbsModel(){
        currentProverb = "Set a jemsus proverb ma'am";

        proverbs = new ArrayList<>();
        proverbs.add("SENTO.....LA FOVZA");
        proverbs.add("Spero che stiate bene e che siate a casa");
        proverbs.add("Quando siete di fronte ad un problema che " +
                "non riuscite a risolvere, il modo migliore di affrontarlo " +
                "è....diciamo....trovare la soluzione.");
        proverbs.add("Microsoft sticazzi!");
        proverbs.add("Attento, stai già pensando alla soluzione del problema.");

        rand = new Random();
    }

    public String getCurrentProverb() {
        return currentProverb;
    }

    public void setCurrentProverb() {
        int index = rand.nextInt(proverbs.size());
        currentProverb = proverbs.get(index);

        setChanged();
        notifyObservers(currentProverb);
    }
}
