public class WrapFilter implements Filter
{  
    public void filter(PixelImage pi) 
    {
        Pixel[][] data = pi.getData();
        Pixel[][] data2 = pi.getData();
        for (int row = 0; row < pi.getHeight() / 2; row++) {
            for (int col = 0; col < pi.getWidth() / 2; col++) {
                data2[row][col] = data[0][0];
            }                   
        }
        for (int row = pi.getHeight() / 2; row < pi.getHeight(); row++) {
            for (int col = 0; col < pi.getWidth() / 2; col++) {
                data2[row][col] = data[row][col];
            }                   
        }
        for (int row = 0; row < pi.getHeight() / 2; row++) {
            for (int col = pi.getWidth() / 2; col < pi.getWidth(); col++) {
                data2[row][col] = data[35][35];
            }                   
        }
        for (int row = pi.getHeight() / 2; row < pi.getHeight(); row++) {
            for (int col = pi.getWidth() / 2; col < pi.getWidth(); col++) {
                data2[row][col] = new Pixel(255, 255, 255);
            }                   
        }
        pi.setData(data2);
    }

}