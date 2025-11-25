package genericsProg;
public enum gen2     //enum vanthu oru cls than atha cls keyword pathila  enum use pandrom
{
    SURIYA,SANTHIYA,KARTHI ,KANMANI;    //1 thukum separe panna comma kufukurom & intha blk only string values mattu tha only panum enum
    public static void main(String args[])
    {
        for(gen2 g:gen2.values()) //  values()antha gen2 cls la iruka values of fulla eduthuka
        {
            System.out.println(g);   //egen2 la iruka values print aga
        }
        System.out.println(gen2.valueOf("SURIYA").ordinal()); //method kull inoru method iruku,frst suriya identify pannitu athods postion 
    }
}
//gen2.valueOf("SURIYA") NA specify ya anta value mattu print agum
//ordinal vanthu antha SURIYA name oda postion return pannum