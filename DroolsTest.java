package com.sample;

import java.math.BigDecimal; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.WorkingMemory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.sample.CausesDrools.Cause;


public class DroolsTest {

    private static final String NO_OUTPUT = "NO OUTPUT";

	public static final void main(String[] args) {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            
            List<Integer> inputList = new ArrayList<>();
            
            Scanner sc = new  Scanner(System.in);
            System.out.println("Please enter a symptom number (Provided in the list):");
            String input = "";
            
            while(true) {
            	input = sc.next();
            	if(input.equals("0")) {
            		System.out.println("The diagnosis result is: ");
            		break;
            	}
            	
            	
            	try {
                	int causeNumber = Integer.parseInt(input);
                	
                	if(causeNumber >= 1 && causeNumber <= 23 ) {
                		inputList.add(causeNumber); 
                		System.out.println("Enter another symptom number or press 0 to finish your input:");
                	}else {
                		System.out.println("Invalid Input. Try Again!!!");	
                	}           		
            	}catch (NumberFormatException e) {
					System.out.println("Invalid Input. Try Again!!!");
				}
            }
 
//            System.out.println(inputList.toString());
            
                       
            CausesDrools d1 = new CausesDrools();
            d1.setCause(Cause.RECURRENT_HEADACHE);
            //ksession.insert(d1);
            
            CausesDrools d2 = new CausesDrools();
            d2.setCause(Cause.SUDDEN_SEVERE_HEACACHE);
            //ksession.insert(d2);
            
            CausesDrools d3 = new CausesDrools();
            d3.setCause(Cause.NAUSEA_VOMITING);
            //ksession.insert(d3);
            
            CausesDrools d4 = new CausesDrools();
            d4.setCause(Cause.SEIZURES);
            
            
            CausesDrools d5 = new CausesDrools();
            d5.setCause(Cause.CONFUSION);
            //ksession.insert(d5);
            
            CausesDrools d6 = new CausesDrools();
            d6.setCause(Cause.NUMBNESS);
            //ksession.insert(d6);
            
            CausesDrools d7 = new CausesDrools();
            d7.setCause(Cause.BLURRED_VISION);
           // ksession.insert(d7);
            
            CausesDrools d8 = new CausesDrools();
            d8.setCause(Cause.LOSS_OF_CONCIOUSNESS);
            //ksession.insert(d8);
            
            CausesDrools d9 = new CausesDrools();
            d9.setCause(Cause.FEAR_ANXIETY);
            //ksession.insert(d9);
            
            CausesDrools d10 = new CausesDrools();
            d10.setCause(Cause.MEMORY_LOSS);
            //ksession.insert(d10);
            
            CausesDrools d11 = new CausesDrools();
            d11.setCause(Cause.DIFFICULTY_WITH_BALANCE);
            //ksession.insert(d11);
            
            CausesDrools d12 = new CausesDrools();
            d12.setCause(Cause.LOSS_OF_VISION);
            //ksession.insert(d12);
            
            CausesDrools d13 = new CausesDrools();
            d13.setCause(Cause.SPEECH_DIFFICULTIES);
            //ksession.insert(d13);
            
            CausesDrools d14 = new CausesDrools();
            d14.setCause(Cause.PERSONALITY_CHANGE);
            //ksession.insert(d14);
             
            CausesDrools d15 = new CausesDrools();
            d15.setCause(Cause.STARRING_SPEELL);
            //ksession.insert(d15);
            
            CausesDrools d16 = new CausesDrools();
            d16.setCause(Cause.URINARY_INCONTINENCE);
            //ksession.insert(d16);
            
            CausesDrools d17 = new CausesDrools();
            d17.setCause(Cause.VISUAL_DISTURBANCE);
            //ksession.insert(d17);
            
            CausesDrools d18 = new CausesDrools();
            d18.setCause(Cause.DEVELOPMENTAL_DELAY);
            //ksession.insert(d18);
            
            CausesDrools d19 = new CausesDrools();
            d19.setCause(Cause.UNCONTR0LLABLE_MOVEMENT);
            //ksession.insert(d19);
            
            CausesDrools d20 = new CausesDrools();
            d20.setCause(Cause.COGNITIVE_DECLINE);
            //ksession.insert(d20);
            
            CausesDrools d21 = new CausesDrools();
            d21.setCause(Cause.DROPPING_EYELID);
            //ksession.insert(d21);
            
            CausesDrools d22 = new CausesDrools();
            d22.setCause(Cause.LIGHT_SENSITIVITY);
            //ksession.insert(d22);
            
            CausesDrools d23 = new CausesDrools();
            d23.setCause(Cause.STIFF_NECK);
            //ksession.insert(d23);
        	
                 
            for(int i=0;i<inputList.size(); i++) {
            	
            	switch(inputList.get(i)) {
            	
            	case 1:
            		ksession.insert(d1);
            		break;
            		
            	case 2:
            		ksession.insert(d2);
            		break;
            		
            	case 3:
            		ksession.insert(d3);
            		
            		break;
            	
            	case 4:
            		ksession.insert(d4);
            		break;
            		
            	case 5:
            		ksession.insert(d5);
            		break;
            		
            	case 6:
            		ksession.insert(d6);
            		break;
            		
            	case 7:
            		ksession.insert(d7);
            		break;
            		
            	case 8:
            		ksession.insert(d8);
            		break;
            		
            	case 9:
            		ksession.insert(d9);
            		break;
            		
            	case 10:
            		ksession.insert(d10);
            		break;
            		
            	case 11:
            		ksession.insert(d11);
            		break;
            		
            	case 12:
            		ksession.insert(d12);
            		break;
            		
            	case 13:
            		ksession.insert(d13);
            		break;
            		
            	case 14:
            		ksession.insert(d14);
            		break;
            		
            	case 15:
            		ksession.insert(d15);
            		break;
            		
            	case 16:
            		ksession.insert(d16);
            		break;
            		
            	case 17:
            		ksession.insert(d17);
            		break;
            		
            	case 18:
            		ksession.insert(d18);
            		break;
            		
            	case 19:
            		ksession.insert(d19);
            		break;
            		
            	case 20:
            		ksession.insert(d20);
            		break;
            		
            	case 21:
            		ksession.insert(d21);
            		break;
            		
            	case 22:
            		ksession.insert(d22);
            		break;
            		
            	case 23:
            		ksession.insert(d23);
            		break;
            		
            	default:
            			break;            		
            	}
            }
            
            List list = new ArrayList();
            List twoList = new ArrayList();

            ksession.setGlobal( "diseases", list);
            ksession.setGlobal( "twoDiseases", twoList);

            ksession.fireAllRules();
            
          //  System.out.println(CausesDrools.getDiseaseList().toString());
          //  System.out.println(CausesDrools.getTwoDiseaseList().toString());
            
            List<String> list1 = CausesDrools.getDiseaseList();
            List<String> list2 = CausesDrools.getTwoDiseaseList();
            
            if(list2.size() == 1) {
            	 System.out.println(list2.toString());
            }else if(list2.size() > 1){
            	System.out.println("This expert system doesn't have enough rules to diagonise the disease. SORRY :(");            	
            }else {
            	if(list1.size() == 1) {
            		 System.out.println(list1.toString());
            	}else {
            		 System.out.println("This expert system doesn't have enough rules to diagonise the disease. SORRY :(");
            	}
            }
           
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }

}
