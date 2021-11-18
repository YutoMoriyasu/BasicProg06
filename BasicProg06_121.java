import pack.ParseMatrix;
import pack.DisparseMatrix;
/**
 * BasicProg06_121
 */
public class BasicProg06_121 {
  public static double[][] deriveMultipliedMatrix(double[][] matrix1, double[][] matrix2) {
    int rowLength = matrix1.length;
    int sumLength = matrix1[0].length;
    int columnLength = matrix2[0].length;
    double[][] multipliedMatrix = new double[rowLength][columnLength];
    for (int i = 0; i < rowLength; i++) {
      for (int j = 0; j < columnLength; j++) {
        for (int k = 0; k < sumLength; k++) {
          multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }
    return multipliedMatrix;
  }
  public static void main(String[] args) {
    double[][] matrix1 = ParseMatrix.main(args[0]);
    double[][] matrix2 = ParseMatrix.main(args[1]);
    double[][] target = deriveMultipliedMatrix(matrix1, matrix2);
    System.out.print(DisparseMatrix.main(target));
  }
}