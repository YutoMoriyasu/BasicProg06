import pack.ParseMatrix;
import pack.DisparseMatrix;
/**
 * BasicProg06_120
 */
public class BasicProg06_120 {

  public static double[][] deriveMultipliedMatrix(double[][] matrix1, double[][] matrix2) {
    int length = matrix1.length;
    double[][] multipliedMatrix = new double[length][length];
    multipliedMatrix[0][0] = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
    multipliedMatrix[1][0] = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
    multipliedMatrix[0][1] = matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
    multipliedMatrix[1][1] = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];
    return multipliedMatrix;
  }
  public static void main(String[] args) {
    double[][] matrix1 = ParseMatrix.main(args[0]);
    double[][] matrix2 = ParseMatrix.main(args[1]);
    double[][] target = deriveMultipliedMatrix(matrix1, matrix2);
    System.out.print(DisparseMatrix.main(target));
  }
}