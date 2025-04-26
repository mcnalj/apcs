public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean isBonus;

    public Game(    boolean completedLevel1, 
                    boolean completedLevel2,
                    boolean completedLevel3,
                    boolean isBonus)
    {
        levelOne = new Level(completedLevel1, 1);
        levelTwo = new Level(completedLevel2, 2);
        levelThree = new Level(completedLevel3, 3);
        this.isBonus = isBonus;
    }

    public boolean isBonus()
    {
        return isBonus;
    }

    public void play()
    {
        System.out.println("Score: " + this.getScore());
    }
    
    public int getScore()
    {
        int score = 0;
        if (levelOne.goalReached())
        {
            score = levelOne.getPoints();

            if (levelTwo.goalReached())
            {
                score += levelTwo.getPoints();

                if (levelThree.goalReached())
                {
                    score += levelThree.getPoints();
                }
            }
        }

        if (isBonus())
        {
            score *= 3;
        }

    return score;


    }

    public int playManyTimes(int num)
    {
        int max = 0;

        for (int i = 0; i < num; i++)
        {
            play();
            int score = this.getScore();
            if (score > max)
            {
                max = score;
            }
        }
        
        return max;
    }
}
















// public Game()
// {
//     boolean completedLevel1 = false;
//     boolean completedLevel2 = false;
//     boolean completedLevel3 = false;
//     isBonus = false;
    
//     double l1 = Math.random();
//     if (l1 > 0.2) {
//         completedLevel1 = true;
//     }
//     double l2 = Math.random();
//     if (l2 > 0.3) {
//         completedLevel2 = true;
//     }
//     double l3 = Math.random();
//     if (l3 > 0.4) {
//         completedLevel3 = true;
//     }
//     double bonus = Math.random();
//     if (bonus > 0.2)
//     {
//         isBonus = true;
//     }
//     levelOne = new Level(completedLevel1, 1);
//     levelTwo = new Level(completedLevel2, 2);
//     levelThree = new Level(completedLevel3, 3);
// }



