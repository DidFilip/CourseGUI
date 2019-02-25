package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Participant;


public class DetailCourseController {

    @FXML
    private Label lbl_course_name;

    @FXML
    private Label lbl_course_category;
    @FXML
    private Label lbl_course_trainer;

    @FXML
    private Label lbl_course_date;

    @FXML
    private Label lbl_course_participants;

    @FXML
    private TextField tf_particip_name;

    @FXML
    private TextField tf_particip_lastname;

    @FXML
    private TableView<Participant> tbl_particip;

    @FXML
    private TableColumn<Participant, String> col_particip_name;

    @FXML
    private TableColumn<Participant, String> col_particip_lastname;

    @FXML
    private Button save_participant;

    @FXML
    private Button delete_participant;

    @FXML
    void delete_participant(ActionEvent event) {

    }

    @FXML
    void save_participant(ActionEvent event) {

    }
    public void initialize(){
        // ustawienie danych wyznaczonego kursu
        lbl_course_name.setText(CourseController.c_selected.getCourse_name());
        lbl_course_category.setText(CourseController.c_selected.getCourse_category());
        lbl_course_date.setText(CourseController.c_selected.getCourse_date().toString());
        lbl_course_trainer.setText(CourseController.c_selected.getCourse_trainer());
        lbl_course_participants.setText(String.valueOf(CourseController.c_selected.getNoParticipants()));
    }

}
