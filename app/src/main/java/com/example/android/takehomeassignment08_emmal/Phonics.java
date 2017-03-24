package com.example.android.takehomeassignment08_emmal;

/**
 * Created by default on 3/24/17.
 */

public class Phonics
{
    private String phonicsSkill;
    private int masteryLevel;
    private boolean mastery;

    public Phonics(String phonicsSkill, int masteryLevel, boolean mastery)
    {
        this.phonicsSkill = phonicsSkill;
        this.masteryLevel = masteryLevel;
        this.mastery = mastery;
    }

    public String getPhonicsSkill() {
        return phonicsSkill;
    }

    public void setPhonicsSkill(String phonicsSkill) {
        this.phonicsSkill = phonicsSkill;
    }

    public int getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(int masteryLevel) {
        this.masteryLevel = masteryLevel;
    }

    public boolean isMastery() {
        return mastery;
    }

    public void setMastery(boolean mastery) {
        this.mastery = mastery;
    }
}
