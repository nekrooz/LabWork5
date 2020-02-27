package comps;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonAutoDetect
@JsonRootName("mood")
public enum Mood {
    SADNESS("sadness", 1),
    SORROW("sorrow", 2),
    RAGE("rage", 3);

    private String mood;
    private final int num;

    Mood(String mood, int num){
        this.mood = mood;
        this.num = num;
    }

    public String getMood(){
        return mood;
    }

    public int getNum(){
        return num;
    }
}