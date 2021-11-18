import pack.ParseMatrix;
/**
 * BasicProg06_115
 */
public class BasicProg06_115 {

  static double deriveDet(double[][] doubleMatrix) {
    double det = doubleMatrix[0][0] * doubleMatrix[1][1] * doubleMatrix[2][2] + 
    doubleMatrix[1][0] * doubleMatrix[2][1] * doubleMatrix[0][2] + 
    doubleMatrix[0][1] * doubleMatrix[1][2] * doubleMatrix[2][0] - 
    doubleMatrix[0][2] * doubleMatrix[1][1] * doubleMatrix[2][0] -
    doubleMatrix[0][0] * doubleMatrix[1][2] * doubleMatrix[2][1] -
    doubleMatrix[1][0] * doubleMatrix[0][1] * doubleMatrix[2][2];
    return det;
  }
  public static void main(String[] args) {
    double[][] matrix = new double[3][3];
    matrix = ParseMatrix.main((String)args[0]);
    System.out.print(deriveDet(matrix));
  }
}