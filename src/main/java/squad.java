

import java.util.ArrayList;
import java.util.List;

    class squad {
        private String squadName;
        private  String squadCause;
        private int squadId;
        private static ArrayList<squad >instance=new ArrayList<squad >();
        private List<hero>Hero;
        public squad (String name, String cause) {
            squadName=name;
            squadCause=cause;
            instance.add(this);
            Hero=new ArrayList<hero>();
        }

        public String getsquadname() {

            return squadName;
        }
        public List<hero> gethero(){
            return Hero;
        }
        public String squadcause() {
            return squadCause;
        }


    }


