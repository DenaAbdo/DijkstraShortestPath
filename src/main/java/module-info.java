module denaabdo._5_2024.algo.dijkstra {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens denaabdo._5_2024.algo.dijkstra to javafx.fxml;
    exports denaabdo._5_2024.algo.dijkstra;
}