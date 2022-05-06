class Test
{
  public static void main(String args[])
  {      
    System.out.println("-------------MASALA DOSA-------------");
    Dosa v = new MasalaDosa();
     v.prepareDosa();
     System.out.println("");
     System.out.println("-------------CHEESE DOSA-------------");
     Dosa p = new CheeseDosa();
     p.prepareDosa();
  }
}
