package com.sample;
import java.util.List;

public class CausesDrools {
	public enum Cause {
		RECURRENT_HEADACHE, SUDDEN_SEVERE_HEACACHE, NAUSEA_VOMITING, SEIZURES, CONFUSION, NUMBNESS, BLURRED_VISION, LOSS_OF_CONCIOUSNESS, FEAR_ANXIETY, MEMORY_LOSS, DIFFICULTY_WITH_BALANCE, LOSS_OF_VISION, SPEECH_DIFFICULTIES, PERSONALITY_CHANGE, STARRING_SPEELL, URINARY_INCONTINENCE, VISUAL_DISTURBANCE, DEVELOPMENTAL_DELAY, UNCONTR0LLABLE_MOVEMENT, COGNITIVE_DECLINE, DROPPING_EYELID, LIGHT_SENSITIVITY, STIFF_NECK
	}

	public enum Diseases {
		BRAIN_ANEURYSM, EPILEPSY, GILOMA, DURAL_ARTERIOVENOUS_FISTULAS, MOYAMOYA_DISEASE
		
	}
	
	private Cause cause;
	private String disease;
	public static List<String> diseaseList;
	public static List<String> twoDiseaseList;
	
	
	public static List<String> getTwoDiseaseList() {
		return twoDiseaseList;
	}
	public static void setTwoDiseaseList(List<String> twoDiseaseList) {
		CausesDrools.twoDiseaseList = twoDiseaseList;
	}
	public Cause getCause() {
		return cause;
	}
	public void setCause(Cause cause) {
		this.cause = cause;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public static List<String> getDiseaseList() {
		return diseaseList;
	}
	public static void setDiseaseList(List<String> diseaseList) {
		CausesDrools.diseaseList = diseaseList;
	}
}
