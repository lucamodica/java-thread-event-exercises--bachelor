package com.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProverbsController implements ActionListener {

    private ProverbsModel pm;
    private UI pv;

    public ProverbsController(ProverbsModel pm, UI pv) {
        this.pm = pm;
        this.pv = pv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pm.setNewProverb();
    }
}
