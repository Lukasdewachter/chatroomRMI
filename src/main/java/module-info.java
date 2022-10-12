module chatroom_rmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens chatroom_rmi to javafx.fxml;
    exports chatroom_rmi;
}
