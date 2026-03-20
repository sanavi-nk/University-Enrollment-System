package universityenrollmentsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WestminsterEnrollmentManagerTest {

    @org.junit.jupiter.api.Test
    void testAddPersonToList() {
        WestminsterEnrollmentManager manager = new WestminsterEnrollmentManager(10);

        Student s1 = new Student("Sanavi", "Kulathilake");
        manager.addPersonToList(s1);

        assertEquals(1, manager.personList.size(),"This shows one item has been added");
    }

    @Test
    void testCapacityLimit(){
        WestminsterEnrollmentManager manager = new WestminsterEnrollmentManager(1);
        Person human = new Person ("Prageesha", "Prabhager");
        Person human2 = new Person ("Adheeb", "Aflah");
        manager.addPersonToList(human);
        manager.addPersonToList(human2);

        assertEquals(1,manager.personList.size(), " This confirms limit is not exceeded");


    }
}