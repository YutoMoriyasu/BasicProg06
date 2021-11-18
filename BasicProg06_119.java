import pack.ParseMatrix;
import pack.DisparseMatrix;
/**
 * BasicProg06_119
 */
public class BasicProg06_119 {

  public static double[][] deriveSumMatrix(double[][] matrix1, double[][] matrix2) {
    int rowLength = matrix1.length;
    int columnLength = matrix1[0].length;
    double[][] sumMatrix = new double[rowLength][columnLength];
    for (int i = 0; i < rowLength; i++) {
      for (int j = 0; j < columnLength; j++) {
        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    return sumMatrix;
  }
  public static void main(String[] args) {
    double[][] matrix1 = ParseMatrix.main(args[0]);
    double[][] matrix2 = ParseMatrix.main(args[1]);
    double[][] target = deriveSumMatrix(matrix1, matrix2);
    System.out.print(DisparseMatrix.main(target));
  }
}