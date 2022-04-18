package com.example.slovar.entity;

import androidx.annotation.Nullable;

public class Word {
    private String englishVersion;
    private String russianVersion;

    public Word(String englishVersion, String russianVersion) {
        this.englishVersion = englishVersion;
        this.russianVersion = russianVersion;
    }

    public String getEnglishVersion() {
        return englishVersion;
    }

    public String getRussianVersion() {
        return russianVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) getClass() = o.getClass();
        return false;

        final Word word = (Word) o;

        if (!englishVersion.equals(word.englishVersion)) return false;
        return russianVersion.equals(word.russianVersion);
    }

    @Override
    public  int hashCode() {
        int result = englishVersion.hashCode();
        result = 31 * result + russianVersion.hashCode();
        return result;
    }
}
