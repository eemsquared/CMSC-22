package mp5;

/**
 * Created by mmcalvarez on 12/7/2016.
 */

public class Rule30Solver {

    private int gridSize;
    private int[][] table;

    public Rule30Solver(int gridSize) {
        this.gridSize = gridSize;
        table = new int[gridSize][gridSize];
    }

    public void runWorkers() {      //helper function
        tableWorkers();
    }

    private void tableWorkers() {
        Rule30RowSolvers[] workers = new Rule30RowSolvers[gridSize];
        for (int i = 0; i < gridSize; i++) {
            workers[i] = new Rule30RowSolvers(i);   //assign each worker to a row
            workers[i].runGenerate();

            while (workers[i].isAlive()) {
                try {
                    workers[i].join();
                } catch (InterruptedException e) {
                    //
                }
            }
        }
    }

    public class Rule30RowSolvers extends Thread {

        private static final int NULL = 0;
        private int rowNumber;

        public Rule30RowSolvers(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public void runGenerate() {     //helper function
            generate();
        }

        private void generate() {       //print the table by row
            for (int i = 1; i < gridSize-1; i++) {
                if (table[rowNumber][i - 1] == 1 && table[rowNumber][i] == 1 && table[rowNumber][i + 1] == 1) {
                    table[rowNumber][i] = 0;
                } else if (table[rowNumber][i - 1] == 1 && table[rowNumber][i] == 1 && table[rowNumber][i + 1] == 0) {
                    table[rowNumber][i] = 0;
                } else if (table[rowNumber][i - 1] == 1 && table[rowNumber][i] == 0 && table[rowNumber][i + 1] == 1) {
                    table[rowNumber][i] = 0;
                } else if (table[rowNumber][i - 1] == 1 && table[rowNumber][i] == 0 && table[rowNumber][i + 1] == 0) {
                    table[rowNumber][i] = 1;
                } else if (table[rowNumber][i - 1] == 0 && table[rowNumber][i] == 1 && table[rowNumber][i + 1] == 1) {
                    table[rowNumber][i] = 1;
                } else if (table[rowNumber][i - 1] == 0 && table[rowNumber][i] == 1 && table[rowNumber][i + 1] == 0) {
                    table[rowNumber][i] = 1;
                } else if (table[rowNumber][i - 1] == 0 && table[rowNumber][i] == 0 && table[rowNumber][i + 1] == 1) {
                    table[rowNumber][i] = 1;
                } else if (table[rowNumber][i - 1] == 0 && table[rowNumber][i] == 0 && table[rowNumber][i + 1] == 0) {
                    table[rowNumber][i] = 0;
                } else if (table[rowNumber][i - 1] == NULL || table[rowNumber][i] == NULL || table[rowNumber][i + 1] == NULL) {
                    table[rowNumber][i] = 0;
                }
                System.out.print(table[rowNumber][i]);
            }
            System.out.print("\n");
        }
    }
}
