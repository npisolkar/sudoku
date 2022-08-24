sudoku
sudoku project

**NOTEs

  X/Y Coordinates:  x measured from left to right starting at 0
                    y measured from 0 starting at the top unless indexing 
                    disagrees

java class BOARD
  method to print board
 


0 is a currently unsolved cell

given a sudoku puzzle should be able to solve it




to solve a puzzle first it should check each row, column, and segment
  to check if any have only 8 and the 9th is obvious
  to be able to do that we need a board method 
      int[] getCol(int x) 
      int[] getRow(int y)

  AND a Board  method 
      int[] getSegmentAsArray(int x, int y) //returns as read, LtR, TtB
    that should call the Segment method
      int[] getThisAsArray()



