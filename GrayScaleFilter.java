public class GrayScaleFilter implements Filter{  
  public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();

        for (int row = 0; row < pi.getHeight(); row++) {
            for (int col = 0; col < pi.getWidth(); col++) {
                data[row][col].setRed((data[row][col].getRed() + data[row][col].getGreen() + data[row][col].getBlue())/3);
                data[row][col].setGreen((data[row][col].getRed() + data[row][col].getGreen() + data[row][col].getBlue())/3);
                data[row][col].setBlue((data[row][col].getRed() + data[row][col].getGreen() + data[row][col].getBlue())/3);
            }
        }

        pi.setData(data);
    }
}