
/**
 * Author: Nikhil Pisolkar 7/25/2022
 * the 'main' program for the sudoku board
 * calls: Segment
 **/

public class SudokuBoard {
  
  Segment[][] segmentArr;
  private int changes;
  private int sure = 1;

  

  public SudokuBoard() {
    segmentArr = Segment[3][3];

  }


  /**
   * gets number of changes for this baord
   */

  public int  getChanges() {
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
}


