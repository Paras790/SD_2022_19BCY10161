import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Console {

    /**
     * Intial grid
     */
    static String[][] grid = {

            {"-", "-", "-", "-", "-",},
            {"-", "-", "-", "-", "-",},
            {"-", "-", "-", "-", "-",},
            {"-", "-", "-", "-", "-",},
            {"-", "-", "-", "-", "-",}

    };
    static Map locationmap = new HashMap<String, int[][]>();

    public static void main(String[] arg) {
        System.out.println("!Welcome to Grid Game!");

        Console console = new Console();

        /**
         *  print the latest grid
         */
        console.printGrid();

        System.out.println("Player A, Please enter your initial moves");
        console.scanAndFeedInitialGrid(0, "A");

        /**
         * printing grid after A initial move
         */
        console.printGrid();

        System.out.println("Player B, Please enter your initial moves");

        console.scanAndFeedInitialGrid(4, "B");

        System.out.println(" Player A's Move");
        console.moveManager();

        /**
         * printing grid after B initial move
         */
        console.printGrid();

    }

    /**
     * Printing java grip
     */
    public void printGrid() {

        for (int k = 0; k < 5; k++) {
            System.out.println();
            for (int t = 0; t < 5; t++) {
                System.out.print("\t\t " + grid[k][t]);

            }
            System.out.println();
        }

    }

    /**
     * Initial Scan and feeder
     *
     * @param k
     * @param player
     */
    public void scanAndFeedInitialGrid(int k, String player) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("p1|p2|p3|p4|p5", Pattern.CASE_INSENSITIVE);
        String[] str = new String[5];
        String strorj = scan.next();
        if (pattern.matcher(strorj).find()) {
            str = strorj.split(",");
            for (int x = 0; x < 5; x++) {
                grid[k][x] = player + "-" + str[x];
                locationmap.put(grid[k][x],new Integer[k][x]);
            }

        } else {
            System.out.println("Invalid Entry!, Try again..");
        }
    }

    public void moveManager() {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("p1|p2|p3|p4|p5", Pattern.CASE_INSENSITIVE);
        String strorj = scan.next();

        int data = Integer.parseInt(strorj.substring(1));

        if (strorj.contains("A")) {

            //update the grid on the basis of location map

        locationmap.get(data);




        }
    }
}