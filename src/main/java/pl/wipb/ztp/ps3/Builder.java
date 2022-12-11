package pl.wipb.ztp.ps3;

import java.util.List;

public interface Builder {
    List<Segment> getBoard();
    void createA();
    void createB();
    void createC();
    void createG();
    void createX(int tileAmount);
    int getTileSize();
    void setX(int x);
    void setY(int y);
    int getY();
}
