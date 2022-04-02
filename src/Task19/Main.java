package Task19;

public class Main {
    public static void main(String[] args) {

        Author authorKadare = new Author("Kadare", "Shqiptar");
        Poem poem1 = new Poem(authorKadare, 27);

        Poem poem2 = new Poem(new Author("Agolli", "Shqiptar"), 45);
        Poem poem3 = new Poem(new Author("Poradeci", "Shqiptar"), 34);

        Poem[] poemat = new Poem[3];
        poemat[0] = poem1;
        poemat[1] = poem2;
        poemat[2] = poem3;

        String mbiemri = gjejAutorin(poemat);
        System.out.println(mbiemri);

    }

    private static String gjejAutorin(Poem[] poemat) {
        int longestPoem = poemat[0].getStropheNo();
        String mbiemri = "";
        int index = 0;
        for (int i = 0; i < poemat.length; i++) {
            if (longestPoem < poemat[i].getStropheNo()) {
                index = 1;
            }
        }
        mbiemri = poemat[index].getCreator().getSurname();
        return mbiemri;
    }
}
