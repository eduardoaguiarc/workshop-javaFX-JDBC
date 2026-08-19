module workshop_javafx_jdbc {
    requires javafx.controls;
    requires java.sql;
	requires javafx.fxml;
	requires javafx.graphics;

    opens application to javafx.graphics, javafx.fxml;
    opens gui to javafx.fxml;
}