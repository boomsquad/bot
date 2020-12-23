//For url information
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class getURL
{
    public static void myURL()
    {
        try 
        {
            URI uri= new URI("https://www.bestbuy.com/site/samsung-70-class-6-series-led-4k-uhd-smart-tizen-tv/6395915.p?skuId=6395915");
    
            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}

class botFrame extends JFrame implements ActionListener
{
    public botFrame()
    {
        setBounds(100,100,200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        JButton button = new JButton("Start");
        button.addActionListener(this);
        buttonPanel.add(button);

        contentPane.add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        getURL.myURL();
    }
}


class bot
{
    public static void main(String[] args)  
    {
        System.out.println("Starting...");

        botFrame myFrame = new botFrame();
        myFrame.setVisible(true);
    }   
}