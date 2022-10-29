package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaxMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of semesters:");
		int n = sc.nextInt();
		List<Semester> semesters = new ArrayList<>();
		if(n<=0) {
			System.out.println("Invalid input");
			System.exit(0);
		} else {
			for(int i=0;i<n;i++) {
				System.out.println("Enter no of subjects in "+(i+1)+" sem :");
				int subjectCnt = sc.nextInt();
				if(subjectCnt <=0 ) {
					System.out.println("Invalid");
					System.exit(0);
				} else {
					Semester s = new Semester(subjectCnt);
					semesters.add(s);
				}
			}
			for(int i=0;i<n;i++) {
			  System.out.println(semesters.get(i).getSubjects());
			}
			for(int i=0;i<n;i++) {
				int sub = semesters.get(i).getSubjects();
				int[] mks = new int[sub];
				System.out.println("enter marks in "+(i+1)+" sem ");
				for(int j=0;j<sub;j++) {
					int mk = sc.nextInt();
					if(mk<0) {
						System.out.println("invalid");
					} else {
						mks[j] = mk;
					}
				}
				Semester s = semesters.get(i);
				s.setMarks(mks);
			}
			for(int i=0;i<n;i++) {
				int maxmarks = semesters.get(i).getMarks();
				System.out.println("max in "+(i+1)+" is ="+maxmarks);
			}
		}
	  }

	}
	
	class Semester{
		private final int subjects;
		List<Integer> mks;
		public Semester(int subjects) {
			this.subjects=subjects;
			mks  = new ArrayList<>(subjects);
		}
		
		public void setMarks(int[] mks) {
			this.mks.addAll(Arrays.stream(mks).boxed().collect(Collectors.toList()));
		}
		
		public int getSubjects() {
			return subjects;
		}
		
		public int getMarks() {
			return Collections.max(mks);
		}
	}


