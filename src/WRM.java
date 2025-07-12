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

    public void servePatient() {
        // To do
        if (dh.next != dh) {
            Patient serving = dh.next;
            System.out.println("Serving paitent " + serving.name);
            dh.next = serving.next;
            serving.next.prev = dh;
        }
        else {
            System.out.println("No Patients to serve");
        }
    }

    public void showAllPatient() {
        // To Do
        Patient pointer = dh.next;

        while (pointer != dh) {
            System.out.println("Patient ID: " + pointer.id);
            pointer = pointer.next;
        }

    }

    public Boolean canDoctorGoHome() {
        // To Do
        if (dh.next == dh) {
            return true;
        }
        return false; //
    }

    public void cancelAll() {
        // To Do
        dh.next = dh;
        dh.prev = dh;
    }


    public void reverseTheLine() {
        // To Do
        Patient pointer = dh.prev;

        dh.next = pointer;

        while (pointer != dh) {
            Patient temp = pointer.next;
            pointer.next = pointer.prev;
            pointer.prev = temp;

            if (pointer.next == dh) {
                dh.prev = pointer;
            }
            pointer = pointer.next;
        }

    }

}