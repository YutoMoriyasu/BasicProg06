import pack.ParseMatrix;
import pack.DisparseMatrix;
/**
 * BasicProg06_118
 */
public class BasicProg06_118 {

  public static double[][] deriveSumMatrix(double[][] matrix1, double[][] matrix2) {
    double[][] sumMatrix = new double[2][2];
    sumMatrix[0][0] = matrix1[0][0] + matrix2[0][0];
    sumMatrix[0][1] = matrix1[0][1] + matrix2[0][1];
    sumMatrix[1][0] = matrix1[1][0] + matrix2[1][0];
    sumMatrix[1][1] = matrix1[1][1] + matrix2[1][1];
    return sumMatrix;
  }
  public static void main(String[] args) {
    double[][] matrix1 = ParseMatrix.main(args[0]);
    double[][] matrix2 = ParseMatrix.main(args[1]);
    double[][] target = deriveSumMatrix(matrix1, matrix2);
    System.out.print(DisparseMatrix.main(target));
  }
}