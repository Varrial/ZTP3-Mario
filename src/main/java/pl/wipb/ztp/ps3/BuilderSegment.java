package pl.wipb.ztp.ps3;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class BuilderSegment implements Builder{

    protected final int TITLESIZE = 32;
    protected int x;
    protected int y;
    protected List<Segment> board = new ArrayList<>();
    @Override
    public int getTileSize() {
        return TITLESIZE;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void createA() {
        Segment s = new SegmentBlock(x, y, "block1.png");
        board.add(s);
        x += TITLESIZE;
    }

    @Override
    public void createB() {
        Segment s = new SegmentBlockV(x, y, "block2.png");
        board.add(s);
        x += TITLESIZE;
    }

    @Override
    public void createC() {
        Segment s = new Segment(x, y, "block3.png");
        board.add(s);
        x += TITLESIZE;
    }

    @Override
    public void createG() {
        Segment s = new SegmentAnim(x, y, "bonus.png", new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 0, 0});
        board.add(s);
        x += TITLESIZE;
    }

    @Override
    public void createX(int tileAmount) {
        x += tileAmount * TITLESIZE;
    }

    @Override
    public List<Segment> getBoard() {
        return board;
    }
}
