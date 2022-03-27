module com.example.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


<<<<<<< HEAD
    opens loose.oose.fis.lab.student.manager to javafx.fxml;
    exports loose.oose.fis.lab.student.manager;
=======
    opens com.example.studentmanager to javafx.fxml;
    exports com.example.studentmanager;
>>>>>>> 34849ad (Initial commit)
}