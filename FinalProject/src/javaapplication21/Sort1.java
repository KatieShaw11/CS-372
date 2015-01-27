package javaapplication21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Sort1 
{
	//This functions goal is too sort the competitors of a specific tournament into the three different divisions
	//Map for Division1(Novice)
	static Map<Integer, String> comp1 = new HashMap<Integer, String>();
	//Map for Division2(Junior)
  	static Map<Integer, String> comp2 = new HashMap<Integer, String>();

	//Map for Division3(Open)
	static Map<Integer, String> comp3 = new HashMap<Integer, String>();

	//Map for Judges
	static Map<Integer,String> judge = new HashMap<Integer,String>();
        
        static File file1 = new File("Division1Print.txt");
	static File file3 = new File("Division3Print.txt");
	static File file2 = new File("Division2Print.txt");
    /**
     * 
     */
    public void SortIntoDivisions()
    {
        String Line;
        ArrayList aList = new ArrayList();
        //LastName,FirstName,University,Division,IDNumber

        try
        {
            FileReader fr = new FileReader("Charles_TOURNAMENTC.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            //Print out what is in file
            while ((str = br.readLine()) != null)
            {
                //Debugging purposes to verify no issue with file
                //System.out.println("str" + str);

                String delims = "[;]";
                //Array of strings called tokens
                String[] tokens = str.split(delims);

                String LastName=tokens[0].trim();
                String FirstName=tokens[1].trim();
                String University=tokens[2].trim();
                int Division=Integer.parseInt(tokens[3].trim());
                int IDNumber=Integer.parseInt(tokens[4].trim());

                if(Division == 1)
                {
                        comp1.put(IDNumber,University);
                }
                else if(Division == 2)
                {
                        comp2.put(IDNumber,University);
                }
                else if(Division == 3)
                {
                        comp3.put(IDNumber,University);
                }
            }
            br.close();
        }
        //This statement will help with debugging. File cannot be found
        catch(IOException e)
        {
                System.out.println("File cannot be found!");
        }	
    }
    /**
     * 
     */
    public void UploadJudges()
    {
        String Line;
        ArrayList aList = new ArrayList();
        //LastName,FirstName,University,IDNumber
        try
        {
            FileReader fr = new FileReader("Charles_TOURNAMENTJ.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str= br.readLine()) != null)
            {
                String delims = ";";
                String[]tokens = str.split(delims);

                String LastName = tokens[0].trim();
                String FirstName = tokens[1].trim();
                String University = tokens[2].trim();
                int IDNumber = Integer.parseInt(tokens[3].trim());

                judge.put(IDNumber,University);
            }
            br.close();
        }
        catch(IOException e){
                System.out.println("File cannot be found!");
        }
    }
    //This method is producing Competitor,Competitor
	public static void CompetitorMatch()
	{    
            Sort1 main1 = new Sort1();
           
            main1.SortIntoDivisions();
           
            //Storing Judge/Competitor if they are already busy
            Map<Integer,Boolean> CompetingInProgress1 = new HashMap();
            Map<Integer,Boolean> CompetingInProgress2 = new HashMap();
            Map<Integer,Boolean> CompetingInProgress3 = new HashMap();

            //Stores who they competed against
            Map<String,Boolean> History = new HashMap();

            //Competitor is available
            boolean in_match = false;
            Integer Competitor1 = 0, Competitor2 = 0;
            String School1 = "", School2 = "";

            for(int j = 1; j<7; j++)
            {
                    System.out.println("Round"+j);
                    for(Integer meh: comp1.keySet())
                    {

                            String value = comp1.get(meh).toString();
                            //is it in the hashmap? if not proceed get does instantaneous line
                            if(CompetingInProgress1.get(meh) == null)
                            {
                                    //if competitor 1 is available
                                    if(in_match == false)
                                    {
                                            //change it to true so we can add it
                                            in_match = true;
                                            Competitor1 = meh;
                                            School1 = value;

                                    }
                                    //Competitor 2 match found! Schools don't match check! 
                                    else if(!value.equals(School1)) 
                                    {
                                             Competitor2=meh;
                                             School2 = value;
                                            //Have not already debated check!
                                             if(History.get(Competitor1 + "," + Competitor2) == null && History.get(Competitor2 + "," + Competitor1) == null)
                                            {
                                                     //Add the competitors in so we know they are matched
                                                     System.out.println("Match: " + Competitor1 + "," + School1 + " vs. " + Competitor2 + "," + value);
                                                     History.put(Competitor1+","+Competitor2,true);
                                                     History.put(Competitor2+","+Competitor1, true);

                                                     try{
                                                             FileWriter output = new FileWriter(file1,true);
                                                             output.write(Competitor1 + "," + Competitor2 +"," + j + "\n");
                                                             output.close();
                                                     }catch(IOException e){
                                                             e.printStackTrace();
                                                     }
                                                     in_match = false;
                                            }	 
                                    }

                            CompetingInProgress1.put(meh, true);
                            }
                    }	
                    CompetingInProgress1.clear();					
            }
		
	
	System.out.println("Division 2");
	for(int k =1; k<7; k++)
	{
		System.out.println("Round"+k);
		for(Integer meh: comp2.keySet())
		{	
			String value = comp2.get(meh).toString();
			//is it in the hashmap? if not proceed get does instantaneous line
			if(CompetingInProgress2.get(meh) == null)
			{
				//if competitor 1 is available
				if(in_match == false)
				{
					//change it to true so we can add it
					in_match = true;
					Competitor1 = meh;
					School1 = value;
				}
				//Competitor 2 match found! Schools don't match check! 
				else if(!value.equals(School1)) 
				{
					 Competitor2=meh;
					 School2 = value;
					//Have not already debated check!
					 if(History.get(Competitor1 + "," + Competitor2) == null && History.get(Competitor2 + "," + Competitor1) == null)
					{
						 //Add the competitors in so we know they are matched
						 System.out.println("Match: " + Competitor1 + "," + School1 + " vs. " + Competitor2 + "," + value);
						 History.put(Competitor1+","+Competitor2,true);
						 History.put(Competitor2+","+Competitor1, true);
									 
						 try{
							 FileWriter output = new FileWriter(file2,true);
							 output.write(Competitor1 + "," + Competitor2 +"," + k + "\n");
							 output.close();
						 }catch(IOException e){
							 e.printStackTrace();
						 }
						 in_match = false;
					}	 
				}
		
			CompetingInProgress2.put(meh, true);
			}
		}	
		CompetingInProgress2.clear();
	}
	
		System.out.println("Division 3");
		for(int l =1; l<7; l++)
		{
			System.out.println("Round"+l);
			for(Integer meh: comp3.keySet())
			{
				
				String value = comp3.get(meh).toString();
				//is it in the hashmap? if not proceed get does instantaneous line
				if(CompetingInProgress3.get(meh) == null)
				{
					//if competitor 1 is available
					if(in_match == false)
					{
						//change it to true so we can add it
						in_match = true;
						Competitor1 = meh;
						School1 = value;
						
					}
					//Competitor 2 match found! Schools don't match check! 
					else if(!value.equals(School1)) 
					{
						 Competitor2=meh;
						 School2 = value;
						//Have not already debated check!
						 if(History.get(Competitor1 + "," + Competitor2) == null && History.get(Competitor2 + "," + Competitor1) == null)
						{
							 //Add the competitors in so we know they are matched
							 System.out.println("Match: " + Competitor1 + "," + School1 + " vs. " + Competitor2 + "," + value);
							 History.put(Competitor1+","+Competitor2,true);
							 History.put(Competitor2+","+Competitor1, true);
										 
							 try{
								 FileWriter output = new FileWriter(file3,true);
								 output.write(Competitor1 + "," + Competitor2 +"," + l + "\n");
								 output.close();
							 }catch(IOException e){
								 e.printStackTrace();
							 }
							 in_match = false;
						}	 
					}
			
				CompetingInProgress3.put(meh, true);
				}
			}	
			CompetingInProgress3.clear();
		
		}
	}
}


