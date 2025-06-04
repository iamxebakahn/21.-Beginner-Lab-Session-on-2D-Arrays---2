/*Problem Constraints

1 <= n <= 1000



Input Format

First argument is a 2D matrix A of integers



Output Format

Return the 2D rotated matrix.



Example Input

Input 1:

 [
    [1, 2],
    [3, 4]
 ]
Input 2:

 [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
 ]


Example Output

Output 1:

 [
    [3, 1],
    [4, 2]
 ]
Output 2:

 [
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
 ]


Example Explanation

Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
Explanation 2:

 After rotating the matrix by 90 degree:
 1 goes to 3, 3 goes to 9
 2 goes to 6, 6 goes to 8
 9 goes to 7, 7 goes to 1
 8 goes to 4, 4 goes to 2

 */
public class Q1_Beginner_Lab_Session_on_2D_Arrays_2
{
    public void solve(int[][] A) 
    {

        int N=A.length;
        int M=A[0].length;
        // int diagonal=0;
        // int rest=0;
        //int[][] arr=new int[N][M];
        
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<M;j++)
            {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;               
            }
        }
        for (int i = 0; i < N; i++)
        {
            int left = 0, right = N - 1;
            while (left < right) 
            {
                int temp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = temp;
                left++;
                right--;
            }
        }

       
    }
}
