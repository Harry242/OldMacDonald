class NamedCow extends Cow
{
  protected String myName;
  public NamedCow(String name, String type, String sound)     
  {
    mySound = sound; 
    myName= name;
    myType = type;        
  }     
   public NamedCow()     
   {
     myName = "unknown";  
   }      
   public String getName()
   {
     return myName;
   }
}
