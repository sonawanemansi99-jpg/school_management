package com.example.school_management.enums;

/**
 * Represents the religion of a student.
 * Used for record-keeping and government compliance purposes.
 */
public enum Religion {

    HINDU("Hindu"),
    MUSLIM("Muslim"),
    CHRISTIAN("Christian"),
    SIKH("Sikh"),
    BUDDHIST("Buddhist"),
    JAIN("Jain"),
    PARSI("Parsi"),
    JEWISH("Jewish"),
    OTHER("Other");

    private final String displayName;

    Religion(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}