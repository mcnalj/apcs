public class BoxOfCandy {
    private Candy[][] box;

    public BoxOfCandy(Candy[][] box)
    {
        this.box = box;
    }

    public boolean moveCandyToFirstRow(int col)
    {
        if (box[0][col] != null)
        {
            return true;
        } else {
            for (int i = 0; i < box.length; i++)
            {
                if (box[i][col] != null)
                {
                    Candy temp = box[i][col];
                    box[i][col] = temp;
                    return true;
                }
            }

        }
        return false;
    }

    public Candy removeNextByFlavor(String flaver)
    {
        return box[0][0];
    }

    public void printBox()
    {
        for (int i=0; i < box.length; i++)
        {
            for (int j = 0; j < box[i].length; j++);
            {
                System.out.print(box[i][j].getFlavor() + ", ");
            }
            System.out.println(" ");
        }
    }
}
