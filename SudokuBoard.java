
/**
 * Author: Nikhil Pisolkar 7/25/2022
 * the 'main' program for the sudoku board
 * calls: nothing
 **/

public class SudokuBoard {
  
  //Segment[][] segmentArr;
  private int changes;  //the number of edits made to the board so far
  private int sure = 1; //eventually may need to track whether or not 
                        //certain changes are made with certainty or not
  private int[][] boardArr;

  /**
   * empty constructor
   */

  public SudokuBoard() {
    //segmentArr = Segment[3][3];
    boardArr = int[9][9];
  }

  /**
   * standard contructor
   */

  public SudokuBoard(int[][] boardArr) {
    this.boardArr = boardArr;
    changes = 0;
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
   * gets the content as an array of integers the values of row row
   */
  public int[] getRow(int row) {
    int[] rowArr = int[9];
    for (int i = 0; i < 9; i++) {
      rowArr[i] = boardArr[row][i];
    }
    return rowArr;
  }
  

  /**
   * returns a 2-dimensional array of a 3x3 segment of the 
   * sudoku board col  ranges from 1 - 3  from top to bottom
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
        arr[m][i] = boardArr[(y - 1) * 3 + i][(x - 1) * 3 + m];
      }
    }
    return arr;
  }
}



