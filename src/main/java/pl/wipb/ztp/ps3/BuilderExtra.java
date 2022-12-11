package pl.wipb.ztp.ps3;

public class BuilderExtra extends BuilderSegment{
    @Override
    public void createC() {
        Segment s = new SegmentBlock(x, y, "block3.png");
        board.add(s);
        x += TITLESIZE;
    }
}
