import pack.ParseMatrix;
/**
 * BasicProg06_114
 */
public class BasicProg06_114 {

  static double deriveDet(double[][] doubleMatrix) {
    double det = doubleMatrix[0][0] * doubleMatrix[1][1] - doubleMatrix[0][1] * doubleMatrix[1][0];
    return det;
  }
  public static void main(String[] args) {
    double[][] matrix = new double[2][2];
    matrix = ParseMatrix.main((String)args[0]);
    System.out.print(deriveDet(matrix));
  }
}