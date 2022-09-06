
/**
 * Author: Nikhil Pisolkar 7/25/2022
 * the 'main' program for the sudoku board
 * calls: nothing
 **/

public class SudokuBoard {
  
  private final int FIND_ROW = 1;
  private final int FIND_COL = 2;
  private final int FIND_SEGMENT = 3;
  //Segment[][] segmentArr;
  private int changes;  //the number of edits made to the board so far
  private int sure = 1; //eventually may need to track whether or not 
                        //certain changes are made with certainty or not
  // the master sudoku board
  private int[][] boardArr;
  // board of possibilities for each cell
  private int[][][] possArr;
  
  // some method definitions
  public void populatePossibilities(); //maybe needs to be fixed

  /**
   * empty constructor
   */

  public SudokuBoard() {
    //segmentArr = Segment[3][3];
    boardArr = int[9][9];
    possArr = int[9][9][9];
    populatePossibilities(); 
  }

  /**
   * standard contructor
   */

  public SudokuBoard(int[][] boardArr) {
    this.boardArr = boardArr;
    possArr = int[9][9][9];
    populatePossibilities();
    changes = 0;
  }

  /**
   * populates the possibilities array with values 1-9 based
   * on the position in third dimension
   */
  public void  populatePossibilities() {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        for (int i = 0; i < 9; i++) {
          posArr[row][col][i] = i + 1;
        }
      }
    }
  }

  /**
   * gets number of changes for this baord
   */
  public int getChanges() {
    return changes;
  }

  /**
   * sets the number of changes for this baord
   * takes one param integer amount of changes
   */
  public void setChanges(int c) {
    changes = c;
  }

  /**
   * increments cahnges by 1
   */
  public void incrementChanges() {
    changes++;
  }

  /**
   * gets the content as an array of integers the values of column col
   */
  public int[] getCol(int col) {
    int[] colArr = int[9];
    for (int i = 0; i < 9; i++) {
      colArr[i] = boardArr[i][col];
    }
    return colArr;
  }

  /**
   * gets array from either row, column, or segment
   * i is a number from 0 to 8 that designates which row/col/segment
   * is being selected
   * the segments start with 0 at the uppermost left hand corner and 
   * 8 at the lowermost righthand corner
   */
  public int[] getAsArray(int id, int i) {
    if (id < 1 || id > 3) {
      return NULL;
    }

    i += 1; //original implementation was with i input as 1-9, so this 
            //allows the work later with i to be a little easier
    int[] arr = int[9]; //array that will be returned

    switch (id) {
      case FIND_ROW:
        return boardArr[i - 1];
        break;
      case FIND_SEGMENT:
        int[][] seg = getSegment(i/3, i%3);
        //need to 'straighten out" the array
        for (int m = 1; m < 10; m++) {
          arr[m - 1] = seg[m / 3][m % 3];
        }
        return arr;
        break;
      case FIND_COL:
        for (int m = 0; m < 9; m++) {
          arr[m] = boardArr[m][i - 1]
        }
        return arr;
        break;
    } //no default case needed, input validation performed earlier
  }

  /**
   * returns a 2-dimensional array of a 3x3 segment of the 
   * sudoku board col  ranges from 0 - 2  from top to bottom
   * and row ranges from 0-2 left to right
   */
  public int[][] getSegment(int y, int x) {
    if (x < 0 || x > 2 || y <  0 || y > 2) {
      // later may add specific exception
      return null:
    }

    int[][] arr = int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int m = 0; m < 3; m++) {
        arr[m][i] = boardArr[(y) * 3 + i][(x) * 3 + m];
      }
    }
    return arr;
  }

  /**
   * kind of master method that is called to solve board
   * returns 0 if successful solve and 1 if unsolved
   */ 
  public int solveBoard() {
    return 1;
  }
}



