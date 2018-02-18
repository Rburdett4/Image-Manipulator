public class SepiaFilter implements Filter
{
    public void filter(PixelImage pi)
    {
        Pixel data[][] = pi.getData();
        
        for(int row = 0; row < pi.getHeight(); row++)
        {
            for(int col = 0; col < pi.getWidth(); col++)
            {
                int r = ((int) (data[row][col].getRed() * .393)) + ((int) (data[row][col].getGreen() * .769)) + ((int) (data[row][col].getBlue() * .189));
                int g = ((int) (data[row][col].getRed() * .349)) + ((int) (data[row][col].getGreen() * .686)) + ((int) (data[row][col].getBlue() * .168));
                int b = (int) ((data[row][col].getRed() * .272)) + ((int) (data[row][col].getGreen() * .534)) + ((int) (data[row][col].getBlue() * .131));
                if(r > 255)
                    r = 255;
                if(g > 255)
                    g = 255;
                if(b > 255)
                    b = 255;
                data[row][col].setRed(r);
                data[row][col].setGreen(g);
                data[row][col].setBlue(b);
            }
        }
        
        pi.setData(data);
    }
}
