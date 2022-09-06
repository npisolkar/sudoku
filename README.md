sudoku
sudoku project

**NOTEs

  X/Y Coordinates:  x measured from left to right starting at 0
                    y measured from 0 starting at the top unless indexing 
                    disagrees

java class BOARD

METHODS I NEED TO WRITE:

- solveBoard method
- method to print board


// notables

- 3d array of possibilities - start with populated with 1-9
  values get turned to -0 when they are ruled out

0 is a currently unsolved cell

given a sudoku puzzle should be able to solve it





OVERALL IDEAS - ROUTINES TO STRUCTURE METHOD LIST
 - i want to start with itereating  through every unfilled cell
   and checking the column, row, and the segment and making sure
   that all of the numbers in the row, column, and segment, are no longer
   valid possibilities in the possArr array
  



to solve a puzzle first it should check each row, column, and segment
  to check if any have only 8 and the 9th is obvious
  to be able to do that we need a board method 
      int[] getCol(int x) 
      int[] getRow(int y)


  -initial routine - method runSquare(int y, int x) {
    - get the column, the row, and the segment
    - scan empty blocks
  }


  AND a Board  method 
      int[] getSegmentAsArray(int x, int y) //returns as read, LtR, TtB
    that should call the Segment method
      int[] getThisAsArray()



