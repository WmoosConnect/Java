package masterWeekOneAC.homeWork;

/** Victor Hugo Vimos T 
 *  victor.vimos@epn.edu.ec
 *  victor.vimos@wmoos.com  **/

public class HospitalStudents
{
    private int N, engagedCount;
    private String[] students;
    private String[] hospitals;
    private String[][] hPreference;
    private String[][] sPreference;
    private String[] sPartner;
    private boolean[] hEngaged;
 
    
    public HospitalStudents(String[] h, String[] s, String[][] hp, String[][] sp)
    {
        N = hp.length;
        engagedCount = 0;
        hospitals = h;
        students = s;
        hPreference = hp;
        sPreference = sp;
        hEngaged = new boolean[N];
        sPartner = new String[N];
        playMatching();
    }
    
    private void playMatching()
    {
        while (engagedCount < N)
        {
            int free;
            for (free = 0; free < N; free++)
                if (!hEngaged[free])
                    break;
 
            for (int i = 0; i < N && !hEngaged[free]; i++)
            {
                int index = sIndexOf(hPreference[free][i]);
                if (sPartner[index] == null)
                {
                	sPartner[index] = hospitals[free];
                	
                    hEngaged[free] = true;
                    
                    engagedCount++;
                }
                else
                {
                    String currentPartner = sPartner[index];
                    if (moreLove(currentPartner, hospitals[free], index))
                    {
                    	sPartner[index] = hospitals[free];
                    	
                        hEngaged[free] = true;
                        
                        hEngaged[hIndexOf(currentPartner)] = false;
                    }
                }
            }            
        }
        
        
        MatchingHS();
    }
    //check if students prefers new hospital rather than assigned one already
    private boolean moreLove(String curPartner, String newPartner, int index)
    {
        for (int i = 0; i < N; i++)
        {
            if (sPreference[index][i].equals(newPartner))
                return true;
            if (sPreference[index][i].equals(curPartner))
                return false;
        }
        return false;
    }
    //hospitals index
    private int hIndexOf(String str)
    {
        for (int i = 0; i < N; i++)
            if (hospitals[i].equals(str))
                return i;
        return -1;
    }
    // students index 
    private int sIndexOf(String str)
    {
        for (int i = 0; i < N; i++)
            if (students[i].equals(str))
                return i;
        return -1;
    }
    // hospitals - students matching
    public void MatchingHS()
    {
        System.out.println("Couples Hospitals <-> Students are : ");
        for (int i = 0; i < N; i++)
        {
            System.out.println(sPartner[i] +  " <---> "+ students[i]);
        }
    }

    public static void main(String[] args) 
    {
        String[] h = {"Atlanta", "Boston", "Chicago", "Detroit", "Elpaso"};
        String[] s  = {"Val", "Wayne", "Xavier", "Yolanda", "Zeus"};
 
        // hospitals preference 
        String[][] hp = {{"Wayne", "Val", "Yolanda", "Zeus", "Xavier"}, 
                         {"Yolanda", "Wayne", "Val", "Xavier", "Zeus"}, 
                         {"Wayne", "Zeus", "Xavier", "Yolanda", "Val"}, 
                         {"Val", "Yolanda", "Xavier", "Wayne", "Zeus"},
                         {"Wayne", "Yolanda", "Val", "Zeus", "Xavier"}};
        // students preference                     
        String[][] sp = {{"Elpaso", "Atlanta", "Boston", "Detroit", "Chicago"}, 
                         {"Chicago", "Boston", "Detroit", "Atlanta", "Elpaso"}, 
                         {"Boston", "Chicago", "Detroit", "Elpaso", "Atlanta"},
                         {"Atlanta", "Elpaso", "Detroit", "Chicago", "Boston"}, 
                         {"Detroit", "Boston", "Elpaso", "Chicago", "Atlanta"}};
 
        HospitalStudents practice = new HospitalStudents(h, s, hp, sp);   
        
       /** Variant Students -Hospitals**/
        //HospitalStudents practice = new HospitalStudents(s, h, sp, hp);   
    }
}



