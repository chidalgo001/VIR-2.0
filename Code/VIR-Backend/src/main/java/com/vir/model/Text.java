package com.vir.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Class to hold the list of words. In a way an abstract representation of a
 * text fragment.
 * 
 * @author Alfredo Lopez
 *
 */
public class Text {

	private List<WordMatch> words;
	private Double FleschReadingScore;
	private Statistics statistics;
	private Long sentenceCount;

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		Text that = (Text) obj;
		return EqualsBuilder.reflectionEquals(this, that);
	}
	
	public Text() {
		this.words = new ArrayList<>();
	}

	public List<WordMatch> getWords() {
		return words;
	}

	public void setWords(List<WordMatch> words) {
		this.words = words;
	}

	public Double getFleschReadingScore() {
		return FleschReadingScore;
	}

	public void setFleschReadingScore(Double fleschReadingScore) {
		FleschReadingScore = fleschReadingScore;
	}

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public Long getSentenceCount() {
		return sentenceCount;
	}

	public void setSentenceCount(Long sentenceCount) {
		this.sentenceCount = sentenceCount;
	}
}
