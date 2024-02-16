interface sports
{
void teamname(String name);
}
interface cricket extends sports
{
void teamscore(int score);
}
public class gameinfo implements cricket
{
public void teamname(String name)
{
System.out.println("team name:"+name);
}
public void teamscore(int score)
{
System.out.println("team score:"+score);
}
public static void main(String []args)
{
gameinfo g=new gameinfo();
g.teamname("reva");
g.teamscore(300);
}
}