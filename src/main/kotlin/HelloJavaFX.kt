import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import javafx.stage.Stage


class HelloWorld : Application() {

    override fun start(primaryStage: Stage) {

        primaryStage.title = "Welcome"

        val grid = GridPane()

        grid.alignment = Pos.CENTER
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.padding = Insets(25.0, 25.0, 25.0, 25.0)

        val sceneTitle = Text("Welcome")
        sceneTitle.font = Font.font("Tahoma", FontWeight.NORMAL, 20.0)
        grid.add(sceneTitle, 0, 0, 2, 1)

        val username = Label("Username:")
        grid.add(username, 0, 1)

        val userTextField = TextField()
        grid.add(userTextField, 1, 1)

        val password = Label("Password:")
        grid.add(password,0, 2)

        val passwordField = PasswordField()
        grid.add(passwordField, 1, 2)

        val button = Button("Sign in")

        val hBox = HBox(10.0)

        hBox.alignment = Pos.BOTTOM_RIGHT

        hBox.children.add(button)

        grid.add(hBox, 1, 4)

        val actionTarget = Text()
        grid.add(actionTarget, 1, 6)

        button.onAction =

            object : EventHandler<ActionEvent> {

                override fun handle(event: ActionEvent) {

                    actionTarget.fill = Color.FIREBRICK
                    actionTarget.text = "Good job pressing that button!"

                }

            }

        val scene = Scene(grid, 300.0, 275.0)

        primaryStage.scene = scene

        primaryStage.show()

    }

}
