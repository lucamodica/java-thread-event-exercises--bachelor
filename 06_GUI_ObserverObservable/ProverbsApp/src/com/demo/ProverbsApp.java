package com.demo;

import com.mvc.ProverbsController;
import com.mvc.ProverbsModel;
import com.mvc.ProverbsView;
import com.mvc.UI;

public class ProverbsApp {

    public static void main(String[] args) {
        UI pv = new ProverbsView();
        ProverbsModel pm = new ProverbsModel();
        pm.addObserver(pv);
        ProverbsController pc = new ProverbsController(pm, pv);
        pv.setController(pc);
    }
}
