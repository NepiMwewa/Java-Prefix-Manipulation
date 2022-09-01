import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Stack;

public class AlexsPrefix extends JFrame
{
   //declare JPanels
   private JPanel mainJPanel;
   
   //declare JTextField
   private JTextField displayJTextField;
   private JTextField inputJTextField;
   private JTextField outputJTextField;
   
   //declare JButtons
   private JButton resultJButton;
   
   //constructor
   public AlexsPrefix()
   {  
      //call buildMainJPanel method
      buildMainJPanel();
      
      //set screen size
      setSize( 400, 200 );
      //set title
      setTitle("Alexs Prefix");
      //set visible
      setVisible(true);
   }
   
    //buildMainJPanel method
   private void buildMainJPanel()
   {
      //get contentPane
      Container contentPane = getContentPane();
      //set contentPane layout to null
      contentPane.setLayout( null );
      
      mainJPanel = new JPanel();
      mainJPanel.setBounds(0,0,400,150);
      mainJPanel.setBackground(Color.BLACK);
      mainJPanel.setLayout(null);
      contentPane.add(mainJPanel);
      
      //set up display JTextField
      displayJTextField = new JTextField();
      displayJTextField.setBounds(0,0,400,20);
      displayJTextField.setText("Enter * or + then two positive numbers");
      displayJTextField.setEditable(false);
      mainJPanel.add(displayJTextField);
      
      //set up input JTextField
      inputJTextField = new JTextField();
      inputJTextField.setBounds(0,20,400,20);
      inputJTextField.setText("");
      inputJTextField.setEditable(true);
      mainJPanel.add(inputJTextField);
      
      
      //set up result JButton
      resultJButton = new JButton();
      resultJButton.setBounds(0,45,150,50);
      resultJButton.setText("Result");
      resultJButton.addActionListener(
         new ActionListener()
            {
               public void actionPerformed( ActionEvent event )
                  {
                     //call resultJButtonActionPerformed method
                     //when clicked
                     resultJButtonActionPerformed( event );
                  }
            }
      );
      mainJPanel.add(resultJButton);
      
      //set up output JTextField
      outputJTextField = new JTextField();
      outputJTextField.setBounds(0,100,400,20);
      outputJTextField.setText("");
      outputJTextField.setEditable(false);
      mainJPanel.add(outputJTextField);
    }
    //result method
   private void resultJButtonActionPerformed( ActionEvent event )
   {
	   //create stacks
      Stack<String> op = new Stack<String>();
      Stack<Integer> num = new Stack<Integer>();
      Stack<Integer> temp = new Stack<Integer>();
      
      //create resources 
      String sort;
      char operator = ' ';
      int a, b, sortingNum; 
      int total = 0, y = 0;
      
      for(int x = 0; x < inputJTextField.getText().length(); ++x)
         {
            sort = String.valueOf(inputJTextField.getText().charAt(x));
            switch(sort.charAt(0))
            {
            case '0'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '1'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '2'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '3'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '4'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '5'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '6'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '7'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '8'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '9'://if number push to num stack
               sortingNum = Integer.parseInt(sort);
               num.push(sortingNum);
               break;//break case
            case '+'://if prefix push to op stack
               op.push(sort);
               y++;
               break;//break case
            case '*'://if prefix push to op stack
               op.push(sort);
               y++;
               break;//break case
            default:
            
            }//end switch
         }//end for
      	
      	 if(y == 0)//if no prefix set total to inputJTextField text
      	 {
      		 total = Integer.parseInt(inputJTextField.getText());
      	 }
         // if 1 prefix pop numbers and prefix then multiple or add
         if(y == 1)
         {
               operator = op.pop().charAt(0);
               a = num.pop();
               b = num.pop();
               //if prefix  is + add the two numbers
               if(operator == '+')
               {
                  total = a + b;
               }
               //if prefix is * multiple the two numbers
               if(operator == '*')
               {
                  total = a * b;
               }
         }
         else if(y == 3)
         {	 //while y is more than 1 keep pop numbers and prefix
        	 //then multiple and/or add
            while(y > 1)
            {
               operator = op.pop().charAt(0);
               a = num.pop();
               b = num.pop();
               //if prefix  is + add the two numbers
               if(operator == '+')
               {
                  temp.push(total = a + b);
                  --y;
               }
               //if prefix is * multiple the two numbers
               if(operator == '*')
               {
                  temp.push(total = a * b);
                  --y;
               }
               
            }
               
               operator = op.pop().charAt(0);
               a = temp.pop();
               b = temp.pop();
               //if prefix  is + add the two numbers   
               if(operator == '+')
               {
                  total = a + b;
               }
               //if prefix is * multiple the two numbers
               if(operator == '*')
               {
                  total = a * b;
               }
         }
         //display output
         outputJTextField.setText(String.valueOf(total));
      }
    
   
   
    //main method
    public static void main(String[] args)
    {
       //call AlexsPrefix method
       new AlexsPrefix();
    }//end of main method  
}