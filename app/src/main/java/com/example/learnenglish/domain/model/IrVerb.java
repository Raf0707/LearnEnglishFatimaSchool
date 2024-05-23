package com.example.learnenglish.domain.model;

public class IrVerb {
    private String infinitive;
    private String present;
    private String pastSimple;
    private String pastParticiple;

    public IrVerb(String infinitive, String present, String pastSimple, String pastParticiple) {
        this.infinitive = infinitive;
        this.present = present;
        this.pastSimple = pastSimple;
        this.pastParticiple = pastParticiple;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public String getPresent() {
        return present;
    }

    public String getPastSimple() {
        return pastSimple;
    }

    public String getPastParticiple() {
        return pastParticiple;
    }
}
