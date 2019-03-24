package com.example.javaone;

public class SeventhProblem
{
    public static void main (String[] args)
    {
        int thisArray[] = {1, 1, 2, 1, 1};
        int clumpsCount = 0;
        boolean isOnClump = false;

        for(int i:thisArray)
        {
            if(thisArray[i] == thisArray[i + 1])
                if(isOnClump == false)
                    {
                        clumpsCount++;
                        isOnClump = true;
                    }
            else
                if(thisArray[i] != thisArray[i + 1])
                    isOnClump = false;
        }
        System.out.println("Number of clumps found: " + clumpsCount);
    }
}
