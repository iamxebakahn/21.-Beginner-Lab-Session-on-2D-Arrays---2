/*Problem Description

Given a square 2D integer array A, return the transpose of A.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


Problem Constraints

1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000


Input Format

The only argument is a 2D matrix of integers.


Output Format

You have to return the Transpose of this 2D matrix.


Example Input

Input 1:
A = [ [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9] ]
Input 2:
A = [ [1, 2], 
      [1, 2] ]


Example Output

Output 1:
[ [1, 4, 7], 
  [2, 5, 8], 
  [3, 6, 9]]
Output 2:
[ [1, 1],
  [2, 2] ]


Example Explanation

Explanation 1:
Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
Explanation 2:
After transposing the matrix, A becomes [[1, 1], [2, 2]] */
public class Q2AP_Beginner_Lab_Session_on_2D_Arrays_2 {
    public int[][] transpose(int[][] A) {
        int N=A.length;
        
        for(int i=0;i<N-1;i++)
        {   
            for(int j=i+1;j<N;j++) 
            {
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }

        }

        return A;
    }
}


//My method (Lower Triangle)
/*  for(int i=1;i<n;i++)
      {
        for(int j=0;j<i;j++)
        {
          temp=A[i][j];
          A[i][j]=A[j][i];
          A[j][i]=temp;
        }
      }
      
      
*/


//My 2nd method (Upper Triangle)
/*
for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      { 
           temp=A[i][j];
          A[i][j]=A[j][i];
          A[j][i]=temp;

      }
    }

*/