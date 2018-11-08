  class Chick implements Animal 
{     
  private String mySound;
  private String myType;
  public Chick(String type, String sound, String sound2)
  {
    myType = type;
    if (Math.random()<0.5)
    {
    mySound = sound;
    }
    else
    {
    mySound = sound2;
    }
  }
  public Chick()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getType()
  {
    return myType;
  }
  public String getSound()
  {
    return mySound;
  }
}
     //your code here
