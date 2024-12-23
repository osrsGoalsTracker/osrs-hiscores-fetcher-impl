package com.osrs_hiscores_fetcher.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Represents a single entry from the OSRS hiscores, which can be either a skill or an activity.
 * This class is used internally to parse the JSON response from the OSRS hiscores API.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HiscoreEntry {
    /** The ID of the skill or activity. */
    private int id;
    
    /** The name of the skill or activity. */
    private String name;
    
    /** The player's rank in this skill or activity. */
    private int rank;
    
    /** The player's level in this skill (only applicable for skills). */
    private int level;
    
    /** The player's experience in this skill (only applicable for skills). */
    @JsonProperty("xp")
    private long experience;
    
    /** The player's score in this activity (only applicable for activities). */
    private int score;

    /**
     * Creates a new HiscoreEntry instance.
     * This constructor is used by Jackson for JSON deserialization.
     */
    public HiscoreEntry() {
        // Default constructor for Jackson
    }
} 
