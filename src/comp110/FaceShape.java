package comp110;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class FaceShape {

    // Instance Variable
    private Color _tone;

    // Constructor
    public FaceShape(Color tone) {
        // Initialization of instance variables happens in the constructor.
        _tone = tone;
    }

    // Methods
    public Group shapes() {
        // Declare a local variable and initialize it to a new Group instance.
        Group aGroup = new Group();

        // TODO: Draw your FaceShape by adding one or more shapes to aGroup.
        // Remember to add a child to aGroup: aGroup.getChildren().add(<shape>);
        //
        // You will need to import the class of every shape you use.
        // For a list of classes, see the Library Class Reference at the end
        // of the write-up or view the official Java documentation:
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/package-summary.html

        //
        // * Requirement: One shape in aGroup must have its fill property
        // set to the _tone instance variable.

        // Finally we return the group to the caller of this method.
        return aGroup;
    }

    // Getter Method
    public Color getTone() {
        return _tone;
    }

    // Setter Method
    public void setTone(Color tone) {
        _tone = tone;
    }

}