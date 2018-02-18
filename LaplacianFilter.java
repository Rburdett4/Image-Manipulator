public class LaplacianFilter implements Filter
{
       public void filter(PixelImage pi)
    {
        Pixel[][] data = pi.getData();
        
        for (int row = 1; row < pi.getHeight() - 1; row++) {
            for (int col = 1; col < pi.getWidth() - 1; col++) {
                int red = data[row - 1][col - 1].getRed() + 2 * data[row - 1][col].getRed() + data[row - 1][col + 1].getRed() + 2 * data[row][col - 1].getRed() + 4 * data[row][col].getRed() + 2 * data[row][col + 1].getRed() + data[row + 1][col - 1].getRed() + 2 * data[row + 1][col].getRed() + data[row + 1][col + 1].getRed();
                int green = data[row - 1][col - 1].getGreen() + 2 * data[row - 1][col].getGreen() + data[row - 1][col + 1].getGreen() + 2 * data[row][col - 1].getGreen() + 4 * data[row][col].getGreen() + 2 * data[row][col + 1].getGreen() + data[row + 1][col - 1].getGreen() + 2 * data[row + 1][col].getGreen() + data[row + 1][col + 1].getGreen();;
                int blue = data[row - 1][col - 1].getBlue() + 2 * data[row - 1][col].getBlue() + data[row - 1][col + 1].getBlue() + 2 * data[row][col - 1].getBlue() + 4 * data[row][col].getBlue() + 2 * data[row][col + 1].getBlue() + data[row + 1][col - 1].getBlue() + 2 * data[row + 1][col].getBlue() + data[row + 1][col + 1].getBlue();;
                
                data[row][col].setRed(red/16);
                data[row][col].setGreen(green/16);
                data[row][col].setBlue(blue/16);
                
            }
        }

        pi.setData(data);
    }   
}