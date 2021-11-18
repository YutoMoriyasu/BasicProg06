package pack;
/**
 * DisparseMatrix
 */
public class DisparseMatrix {

  public static String main(double[][] matrix) {
    String strMatrix = "{";
    int rowLength = matrix.length;
    int columnLength = matrix[0].length;
    for (int i = 0; i < rowLength; i++) {
      String strRow = "";
      for (int j = 0; j < columnLength; j++) {
        if (j == columnLength - 1) {
          strRow = strRow + (int)matrix[i][j];
        } else {
          strRow = strRow + (int)matrix[i][j] + ",";
        }
      }
      if (i == rowLength -1 ) {
        strMatrix = strMatrix + strRow + "}";
      } else {
        strMatrix = strMatrix + strRow + ";";
      }
    }
    return strMatrix;
  }
}