

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polyline;
import javafx.scene.text.FontWeight;




public class Shapes extends Application{
	
	
	
	
	@Override 
	public void start (Stage stage)
	
	{
		
		
		//Create fonts and a caption for program title
		
		Font font1 = Font.font ("Verdana", FontWeight.BOLD, 12); 
		
		Font font2 = Font.font ("Verdana", 12); 
		
		Text caption = new Text (75, 125, "SHAPES");
		caption.setFont(font1);
		
		
		//Create a rectangle
		
		Rectangle rectangle = new Rectangle(125, 225, 100, 200);
		rectangle.setFill(Color.GREEN);
		rectangle.setStroke(Color.BLACK);
		
		
		//Create a hexagon
		
	      Polyline hexagon = new Polyline();  
	      hexagon.setFill(Color.RED);
	     hexagon.setStroke(Color.BLACK);
	       
	      //Adding coordinates to the hexagon
	     
		hexagon.getPoints().addAll(new Double[]{        
		         200.0, 50.0, 
		         400.0, 50.0, 
		         450.0, 150.0,          
		         400.0, 250.0, 
		         200.0, 250.0,                   
		         150.0, 150.0, 
		         200.0, 50.0,
		      }); 
		
		
		// Create a triangle
		Polyline triangle = new Polyline();
		triangle.setFill(Color.GREY);
		triangle.setStroke(Color.BLACK);
		
		
		
		// Adding coordinates to the triangle
		
		triangle.getPoints().addAll(new Double[]{
			
			200.0, 50.0,
			400.0, 50.0,
			300.0, 250.0,
			200.0, 50.0,
			
		});
		
		
		
		// create a group node to add the shapes to as the shape entry button is pressed
		
		Group shapeGroup = new Group();
		
		
		// create a field for the user to enter shapes
		
		TextField shapeEntry = new TextField ();
		shapeEntry.setMinWidth(300);
		shapeEntry.setMaxWidth(300);
		shapeEntry.setFont(font2);
		
		// create a label to tell the user what to enter in the shape entry field
		 
		Label shapeEntryLabel = new Label ("Please enter a shape. You can choose from Triangle, Rectangle or Hexagon.");
		
		// create a button to display the results of the user's entries
		Button EnterButton = new Button (" ENTER ");
		
		// create a field for the user to enter colours
		
		TextField colourEntry = new TextField ();
		colourEntry.setMinWidth(300);
		colourEntry.setMaxWidth(300);
		colourEntry.setFont(font2);
		
		
		// create a label to tell the user what to enter in colour entry field
		
		Label colourEntryLabel = new Label ("Please enter a colour. You can choose from red, green or grey.");
		
		
		
		
	// create and configure a non-editable text area to display the results of the shape entry
		
		TextArea display = new TextArea ();
		display.setEditable(false);
		display.setMinSize (500, 100);
		display.setMaxSize (500, 100);
		display.setFont(font2);
		
		// create and configure a non-editable text area to display the results of the colour entry
		
		TextArea display2 = new TextArea ();
		display2.setEditable(false);
		display2.setMinSize (500, 100);
		display2.setMaxSize (500, 100);
		display2.setFont(font2);
		
		
		
		// create a VBox to hold all the nodes in one vertical axis
		
		VBox root = new VBox(10);
		root.setBackground(Background.EMPTY);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(caption, shapeGroup, shapeEntryLabel, shapeEntry, colourEntryLabel, colourEntry, display, display2, EnterButton);
		
		
		// create a scene to hold the root node
		
		Scene scene1 = new Scene (root, 1200, 1000, Color.AQUA);
		
		
		// add the scene to the stage

		stage.setScene(scene1);
		stage.setTitle("Shapes");
		stage.show();
		
		
	
		
		// write the code for the button to execute
		// first write the code to display the correct shape one at a time and give the user feedback
	
	EnterButton.setOnAction( e -> {
		
		if (shapeEntry.getText().isEmpty() ||  colourEntry.getText().isEmpty())
		
		{
		
			display.setText("You need to enter ONE  valid shape (Triangle, Rectangle or Hexagon)" + "\n" + "AND ONE valid colour (red, green or grey)." + "\n" + "Please try again.");
			
			
		}
		
		else if (shapeEntry.getText().equalsIgnoreCase("Triangle"))
				
				{
			
			
			shapeGroup.getChildren().clear();
			shapeGroup.getChildren().add(triangle);
			
			display.setText("You entered Triangle.");
				}
		
		
			else if (shapeEntry.getText().equalsIgnoreCase("hexagon"))
				
			{
				

				shapeGroup.getChildren().clear();
				shapeGroup.getChildren().add(hexagon);
				
				display.setText("You entered Hexagon.");
				
			}
		
			
				else if (shapeEntry.getText().equalsIgnoreCase("rectangle"))
					
					
					{
					
					
					shapeGroup.getChildren().clear();
					shapeGroup.getChildren().add(rectangle);
		
					display.setText("You entered Rectangle.");
					}
					
					else 
						
					{
						display.setText("You entered an invalid shape.");
						
						
					}
					
		
		// now add the code to display the correct colour one at a time and give the user feedback
		
		
		if (shapeEntry.getText().isEmpty() ||  colourEntry.getText().isEmpty())
			
		{
		
			display2.setText("You need to enter ONE valid shape (Triangle, Rectangle or Hexagon)" + "\n" + "AND ONE valid colour (red, green or grey)." + "\n" + "Please try again.");
			
			
		}
		
		else if (colourEntry.getText().equalsIgnoreCase("Red"))
				
				{
			
			
			triangle.setFill(Color.RED);
			rectangle.setFill(Color.RED);
			hexagon.setFill(Color.RED);
			
			display2.setText("You entered red.");
				}
		
		
			else if (colourEntry.getText().equalsIgnoreCase("Green"))
				
			{
				
				triangle.setFill(Color.GREEN);
				rectangle.setFill(Color.GREEN);
				hexagon.setFill(Color.GREEN);
				
				display2.setText("You entered green.");
				
				
			}
		
					else if (colourEntry.getText().equalsIgnoreCase("Grey"))
				
			{
				
						triangle.setFill(Color.GREY);
						rectangle.setFill(Color.GREY);
						hexagon.setFill(Color.GREY);
				
						display2.setText("You entered grey.");
			}
		
		
					else 
						
					{
						
						display2.setText("You entered an invalid colour.");
						
					}
		
		
		
		
		
	});
	
	

	
	
	
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	launch (args);
	
	
	}

}
