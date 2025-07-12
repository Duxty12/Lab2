public class WRM {
    Patient dh;


    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient tempPatient = new Patient(id, name, age, bloodgroup, null, null);

        Patient current = dh.prev;

        current.next = tempPatient;
        tempPatient.prev = current;
        dh.prev = tempPatient;
        tempPatient.next = dh;


        }
    }

    public void servePatient() {
        // To do
    }

    public void showAllPatient() {
        // To Do
    }

    public Boolean canDoctorGoHome() {
        // To Do
        return null; // Delete this line once you're ready
    }

    public void cancelAll() {
        // To Do
    }


    public void reverseTheLine() {
        // To Do
    }

}