package com.mvc;

import java.util.Observer;

public interface UI extends Observer {
    void setController(ProverbsController pc);
}
