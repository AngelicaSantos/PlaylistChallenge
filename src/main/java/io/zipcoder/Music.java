package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int count;
        int counter = 0;
        int counterReverse=0;


        for (int i=startIndex; i<playList.length; i++) {
            if (!playList[i].equals(selection)) {
                counter++;

            }
        }

        for (int i=playList.length-1;i>0;i--) {
            if (!playList[i].equals(selection)) {
                counterReverse++;
            }
        }
        count=Math.min(counter,counterReverse);


        return count;
    }
}

