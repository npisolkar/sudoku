sudoku
sudoku project

new data structure?

java class BOARD
  contains a 2d array of SEGMENT
  method to print board
  method to set a segment (int x, int y, Segment newSeg)


each SEGMENT contains a 2d array of integers from 0-9

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



