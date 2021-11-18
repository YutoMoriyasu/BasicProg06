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
    // double m11 = doubleMatrix[0][0];
    // double m12 = doubleMatrix[0][1];
    // double m21 = doubleMatrix[1][0];
    // double m22 = doubleMatrix[1][1];
    // tMatrix[0][0] = m11;
    // tMatrix[0][1] = m21;
    // tMatrix[1][0] = m12;
    // tMatrix[1][1] = m22;
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