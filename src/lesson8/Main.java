package lesson8;

public class Main {
    public static void main(String[] args) {
        SportsSkills[] athletes = {
                new Cat("Tom", 50, 2),
                new Human("Boris", 500, 3),
                new Robot("Stepan", 150, 10)
        };

        JoggingTrack track1 = new JoggingTrack("дорожка-1", "track", 10);
        WallBarrier wall1 = new WallBarrier("барьер-1", "wall", 10);

        Obstacles[] tracksWalls = {
                new JoggingTrack("firstTrack", "track", 5),
                new WallBarrier("firstWall", "wall", 1),
                new JoggingTrack("secondTrack", "track", 10),
                new WallBarrier("secondWall", "wall", 3),
                new JoggingTrack("thirdTrack", "track", 15),
                new WallBarrier("thridWall", "wall", 5)
        };

        runJump(athletes);
        System.out.printf("%5c %c %c\n", '*', '*', '*');
        maxSkills(athletes, track1.length, wall1.height);
        System.out.printf("%5c %c %c\n", '*', '*', '*');
        theGreatRace(tracksWalls, athletes);
    }

    public static void runJump(SportsSkills[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i].run();
            x[i].jump();
        }
    }

    public static void maxSkills(SportsSkills[] x, int a, int b) {
        for (int i = 0; i < x.length; i++) {
            x[i].runDist(a);
            x[i].maxHeight(b);
        }
    }

    public static void theGreatRace(Obstacles[] x, SportsSkills[] y) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i].type == "track") {
                    y[j].runDist(10);
                } else if(x[i].type == "wall") {
                    y[j].maxHeight(10);
                }
            }
        }
    }

}
