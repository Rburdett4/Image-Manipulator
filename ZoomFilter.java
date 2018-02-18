public class ZoomFilter implements Filter
{  
    public void filter(PixelImage pi) 
    {
        Pixel[][] data = pi.getData();
        Pixel[][] data2 = pi.getData();
        for (int row = pi.getHeight() / 4, row1 = 0 ; row < (pi.getHeight() / 4) * 3; row++, row1 += 2) {
            for (int col = pi.getWidth() / 4, col1 = 0; col < (pi.getWidth() / 4) * 3; col++, col1 += 2) {
                data2[row1][col1] = data[row][col];
                data2[row1][col1 + 1] = data[row][col];
                data2[row1 + 1][col1] = data[row][col];
                data2[row1 + 1][col1 +1] = data[row][col];
            }                   
        }
        pi.setData(data2);
    }

}
