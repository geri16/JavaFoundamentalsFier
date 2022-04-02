package Task19;

public class Poem {
    private Author creator;
    private int stropheNo;


    public Poem() {
    }

    public Poem(Author creator, int stropheNo) {
        this.creator = creator;
        this.stropheNo = stropheNo;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNo() {
        return stropheNo;
    }

    public void setStropheNo(int stropheNo) {
        this.stropheNo = stropheNo;
    }
}
