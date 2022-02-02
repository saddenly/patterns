package structural.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r=5 fits round hole r=5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPgAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPgAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPgAdapter)) {
            System.out.println("Square peg width=2 fits round hole r=5");
        }
        if (!hole.fits(largeSqPgAdapter)) {
            System.out.println("Square peg width=20 doesn't fit into round hole r=5");
        }
    }
}