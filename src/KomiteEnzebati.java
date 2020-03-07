import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
    public class KomiteEnzebati {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numberOfPlayers = scan.nextInt();
            int numberOfTeams = scan.nextInt();
            scan.nextLine();
            HashMap<String,String> hashMap = new HashMap<String,String>(numberOfPlayers);
            TreeSet<String> treeSet= new TreeSet<String>();
            for(int i = 0;i < numberOfPlayers;i++)
            {
                String playerName = scan.nextLine();
                hashMap.put(playerName,"null");
            }
            for(int i = 0;i < numberOfTeams;i++) {
                String teamName = scan.nextLine();
                int numberOfPlayersOfEachTeam = scan.nextInt();
                scan.nextLine();
                for (int j = 0; j < numberOfPlayersOfEachTeam; j++) {
                    String playerOfEachTeam = scan.nextLine();
                    if (!hashMap.containsKey(playerOfEachTeam)) {
                        treeSet.add(teamName);
                    } else if (hashMap.get(playerOfEachTeam) != "null") {
                        treeSet.add(teamName);
                        treeSet.add(hashMap.get(playerOfEachTeam));
                    } else {
                        hashMap.put(playerOfEachTeam, teamName);
                    }
                }
            }
            Object[] treeSetToArray = treeSet.toArray();
            for (int i = 0;i < treeSet.size();i++)
            {
                System.out.println(treeSetToArray[i]);
            }
        }
    }

