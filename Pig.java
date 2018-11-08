class Pig implements Animal 
{ 
  protected String myType;
  protected String mySound;
  public Pig(String type, String sound)
  {
    myType=type;
    mySound=sound;
  }//your code here
  public Pig()
  {
    myType="unknown";
    mySound="unknown";
  }
  public String getSound(){return mySound;}
  public String getType(){return myType;}
} 
