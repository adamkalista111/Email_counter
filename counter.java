import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;




public class test {

    private JFrame frame;
    private JTextField Counter6;
    private JTextField Counter5;
    private JTextField Counter4;
    private JTextField Counter3;
    private JTextField Counter2;
    private JTextField Counter1;
    private JTextPane dioda;
    private JLabel Tlo;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {           

                    test window = new test();
                    window.frame.setVisible(true);

                } catch (Exception e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public test() {
        initialize();
        new Thread(this::sraka).start();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.getContentPane().setBackground(new Color(255, 210, 68));

        JTextPane Stars_Email_Counter_Text = new JTextPane();
        Stars_Email_Counter_Text.setBounds(10, 0, 376, 63);
        Stars_Email_Counter_Text.setBackground(new Color(255, 210, 68));
        Stars_Email_Counter_Text.setEditable(false);
        Stars_Email_Counter_Text.setFont(new Font("Yu Gothic Medium", Font.BOLD, 24));
        Stars_Email_Counter_Text.setText("      STARS EMAIL COUNTER");

        Counter6 = new JTextField();
        Counter6.setBounds(10, 480, 400, 70);
        Counter6.setEditable(false);
        Counter6.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter6.setColumns(10);

        Counter5 = new JTextField();
        Counter5.setBounds(10, 399, 400, 70);
        Counter5.setEditable(false);
        Counter5.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter5.setColumns(10);

        Counter4 = new JTextField();
        Counter4.setBounds(10, 318, 400, 70);
        Counter4.setEditable(false);
        Counter4.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter4.setColumns(10);

        Counter3 = new JTextField();
        Counter3.setBounds(10, 237, 400, 70);
        Counter3.setEditable(false);
        Counter3.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter3.setColumns(10);

        Counter2 = new JTextField();
        Counter2.setBounds(10, 156, 400, 70);
        Counter2.setEditable(false);
        Counter2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter2.setColumns(10);

        dioda = new JTextPane();
        dioda.setBounds(404, 0, 20, 20);
        dioda.setBackground(Color.GREEN);
        frame.getContentPane().setLayout(null);

        Counter1 = new JTextField();
        Counter1.setBounds(10, 69, 400, 70);
        Counter1.setEditable(false);
        Counter1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        Counter1.setColumns(10);
        frame.getContentPane().add(Counter1);
        frame.getContentPane().add(Counter2);
        frame.getContentPane().add(Counter3);
        frame.getContentPane().add(Counter4);
        frame.getContentPane().add(Counter5);
        frame.getContentPane().add(Counter6);
        frame.getContentPane().add(Stars_Email_Counter_Text);
        frame.getContentPane().add(dioda);  
        frame.setBounds(100, 100, 440, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   

    private void sraka() {
        System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");  
           WebDriver driver=new ChromeDriver();
           driver.get("https://stars-emea.nsroot.net/prweb/SSOServlet/hzhP9HwhB2H6CmVkCOWsjQ%5B%5B*/!STANDARD");

            WebDriverWait wait = new WebDriverWait(driver, 40);

            try {               

                   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div/div/div/span/button/div/div/div/div")));
                   driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[2]/div/div/div/div/div/div/div/span/button/div/div/div/div")).click();    


                   driver.manage().window().setPosition(new org.openqa.selenium.Point(1,1000));
                   driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080)); 


                   TimeUnit.SECONDS.sleep(2);
                   wait.until(ExpectedConditions.elementToBeClickable(By.id("Tab1")));
                   driver.findElement(By.id("Tab1")).click();   
                   TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

    try {
        while(true) {
            TimeUnit.SECONDS.sleep(5);
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[1]/div/div/div/div/div[1]/div[2]/div")));
               driver.findElement(By.xpath("//*[@id=\"RULE_KEY\"]/div/div/div/div[1]/div/div/div/div/div[1]/div[2]/div")).click();  
               TimeUnit.SECONDS.sleep(5);

               wait.until(ExpectedConditions.elementToBeClickable(By.id("$POperatorPg$pWorkBasketListDisplay$l1")));
               dioda.setBackground(Color.RED);

               String c1 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l1")).getText();
               System.out.println(c1);

               String c2 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l2")).getText();

               String c3 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l3")).getText();

               String c4 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l4")).getText();

               String c5 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l5")).getText();

               String c6 = driver.findElement(By.id("$POperatorPg$pWorkBasketListDisplay$l6")).getText();


               Counter1.setText(c1);
               Counter2.setText(c2);
               Counter3.setText(c3);
               Counter4.setText(c4);
               Counter5.setText(c5);
               Counter6.setText(c6);
               dioda.setBackground(Color.GREEN);

        }

    }
     catch (Exception e) {

         System.out.println(e);

     }

    }
} 