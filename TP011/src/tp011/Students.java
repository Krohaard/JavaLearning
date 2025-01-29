package tp011;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Students {
	private HashMap<String, Float> kStudents;
	private float kAverage;
	private HashMap<String, Float> kFirstStudent;
	private HashMap<String, Float> kLastStudent;

	public Students() {
		this.kStudents = new HashMap<>();
		this.kFirstStudent = new HashMap<>();
//		this.kFirstStudent.put("", (float) 0);
		this.kLastStudent = new HashMap<>();
//		this.kLastStudent.put("", (float) 0);
		this.kAverage = 0;
	}
	private void CalculateAverage() {
		this.kAverage = (float) this.kStudents.values().stream().mapToInt(Float::intValue).sum()/this.kStudents.size();
	}
	private void SetFirstStudent(String kName, float kNote) {
		this.kFirstStudent.clear();
		this.kFirstStudent.put(kName, kNote);
	}
	private void SetLastStudent(String kName, float kNote) {
		this.kLastStudent.clear();
		this.kLastStudent.put(kName, kNote);
	}
	public void AddNote(String kName, float kNote) {
		this.kStudents.put(kName, kNote);
		this.CalculateAverage();
		if(Collections.max(this.kStudents.values()) <= kNote ) SetFirstStudent(kName,kNote);
		if(Collections.min(this.kStudents.values()) >= kNote ) SetLastStudent(kName,kNote);
	}
	public float GetAverage() {
		return kAverage;
	}
	public String FirstStudent() {
		return kFirstStudent.values().toString().replaceAll("[\\[\\]]", "") + " ( " + (kFirstStudent.keySet().toString()).replaceAll("[\\[\\]]", "") + " )";
	}
	public String LastStudent() {
		return kLastStudent.values().toString().replaceAll("[\\[\\]]", "") + " ( " + (kLastStudent.keySet().toString()).replaceAll("[\\[\\]]", "") + " )";
	}
	public HashMap<String, Float> ListingStudentAboveAverage(){
		HashMap<String, Float> kTemp;
		kTemp = new HashMap<>();
		for(Entry<String, Float> kElement : kStudents.entrySet()) {
			if(kElement.getValue()>= kAverage) kTemp.put(kElement.getKey(), kElement.getValue());
		}
		return kTemp;
	}
}
