package LeetCodeExc;

/***
 * On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number of white bishops 'B', black pawns 'p', and empty squares '.'.

When the rook moves, it chooses one of four cardinal directions (north, east, south, or west), 
then moves in that direction until it chooses to stop, reaches the edge of the board, 
captures a black pawn, or is blocked by a white bishop. A rook is considered attacking
 a pawn if the rook can capture the pawn on the rook's turn. The number of available 
 captures for the white rook is the number of pawns that the rook is attacking.

Return the number of available captures for the white rook.


Input: board = [
[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".","R",".",".",".","p"],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: In this example, the rook is attacking all the pawns.



Input: board = [
[".",".",".",".",".",".",".","."],
[".","p","p","p","p","p",".","."],
[".","p","p","B","p","p",".","."],
[".","p","B","R","B","p",".","."],
[".","p","p","B","p","p",".","."],
[".","p","p","p","p","p",".","."],
[".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 0
Explanation: The bishops are blocking the rook from attacking any of the pawns.

Input: board = [
[".",".",".",".",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".","p",".",".",".","."],
["p","p",".","R",".","p","B","."],
[".",".",".",".",".",".",".","."],
[".",".",".","B",".",".",".","."],
[".",".",".","p",".",".",".","."],
[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: The rook is attacking the pawns at positions b5, d6, and f5.
 

Constraints:

board.length == 8
board[i].length == 8
board[i][j] is either 'R', '.', 'B', or 'p'
There is exactly one cell with board[i][j] == 'R'
 * @author ringo
 *
 */


public class AvailableCaptures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[][] board = {
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'p','p','.','R','.','p','B','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','B','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}};
		char[][] board2 = {
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','R','.','.','.','p'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}};
		
		
		
		char[][] board3 = {
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','p','p','.','.','.','.'},
				{'.','p','p','R','.','p','.','p'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','p','.','.'},
				{'.','.','.','p','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}};
		
		System.out.println(numRookCaptures(board3));
                                                
	}
	
	
	
	
	
	 public static int numRookCaptures(char[][] board) {
	        
		 
		 boolean found =false;
		 
		 int rX=-1, rY=-1;
		 
		 for(int i=0; i<8; i++){
			 
			 
			 for(int j=0; j<8; j++){
				 
				 if(board[i][j] == 'R'){
					 found = true;
					 rX=j;
					 rY=i;
					 break;
				 }
			 }
		 }	 
		 
		 int counter= 0;
		 for(int row=0; row<8; row++){
			 
			 	if(row == rX){ continue;}
				 
				 if(board[rY][row]== 'p' && row<rX){
					 counter=1;
					 
				 }else if(board[rY][row]== 'B'&& row<rX){
					 
					 counter=0;
				 }else if(board[rY][row]=='p' && row>rX){
					 counter = (counter==1) ? 2: 1;
					 break;
				 }else if(board[rY][row]=='B' && row>rX){
					 break;
				 }			 
		 }
		 
		 int counter2= 0;
		 for(int column=0; column<8; column++){
			 
			 	if(column == rY){ continue;}
				 
				 if(board[column][rX]== 'p' && column<rY){
					 counter2=1;
					 
				 }else if(board[column][rX]== 'B'&& column<rY){
					 
					 counter2=0;
				 }else if(board[column][rX]=='p' && column>rY){
					 counter2 = (counter2==1) ? 2: 1;
					 break;
 				 }else if(board[column][rX]=='B' && column>rY){
					 break;
				 }			 
		 }

		 return counter+counter2;
	    }

}
