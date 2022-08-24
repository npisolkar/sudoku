/**
 * Nikhil Pisolkar
 * Sudoku project
 * 6/1/2022
 * Segment class, 3x3 boxes, with getter and setter methods
 */

public class Segment {
  int[][] digits; 
  int posRow;
  int posCol;
  
  /**
   *  constructor
   */
  public Segment(int[][] nums, int x, int y) {
    digits = nums;
    posRow = y;
    posCOl = x;
  }

  /**
   * getters and setters
   */

  /**
   * set a single digit of a segment
   */
  public int setDigit(int x, int y, int digit) {
    int index = 3 * (x) + y 
  }
  
  public int[] getSegmentColumn(int whichColumn) {
    int[] arr = int[3];
    for (int i = 0; i < 3; i++) 
      int[i] = digits[i][whichColumn];
    return arr;
  }

}

