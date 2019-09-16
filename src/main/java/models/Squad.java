package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
        private String squadName;
        private  String squadCause;
        private int squadId;
        private static ArrayList<Squad > instance=new ArrayList<Squad >();
        private List<Hero> Hero;
        public Squad (String name, String cause) {
            squadName=name;
            squadCause=cause;
            instance.add(this);
            Hero=new ArrayList<Hero>();
        }

        public String getsquadname() {

            return squadName;
        }
        public List<Hero> gethero(){
            return Hero;
        }
        public String squadcause() {
            return squadCause;
        }


    }




