import pack.ParseMatrix;
import pack.DisparseMatrix;
/**
 * BasicProg06_117
 */
public class BasicProg06_117 {
  static double[][] transposeMatrix(double[][] doubleMatrix) {
    int rowLength = doubleMatrix.length;
    int columnLength = doubleMatrix[0].length;
    double[][] tMatrix = new double[rowLength][columnLength];
    for (int i = 0; i < rowLength; i++) {
      for (int j = 0; j < columnLength; j++) {
        tMatrix[i][j] = doubleMatrix[j][i];
      }
    }
    return tMatrix;
  }
  public static void main(String[] args) {
    double[][] matrix = new double[2][2];
    matrix = ParseMatrix.main((String)args[0]);
    double[][] target = transposeMatrix(matrix);
    System.out.print(DisparseMatrix.main(target));
  }
}