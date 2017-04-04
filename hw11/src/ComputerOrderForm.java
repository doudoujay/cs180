import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jay on 2017/3/31.
 */
public class ComputerOrderForm {
    class calcPriceAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int cpu = 0;
            int gpu = 0;
            int ram = 0;
            int ps = 0;
            int hd = 0;
//            Handle not Integer Error&Bland Error
            try {
                cpu = Integer.parseInt(cpuCoresJTextField.getText());
                gpu = Integer.parseInt(gpuCoresJTextField.getText());
                ram = Integer.parseInt(ramAmountJTextField.getText());
                ps = Integer.parseInt(powerSupplyJTextField.getText());
                hd = Integer.parseInt(hdCapacityJTextField.getText());

            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null,
                        error.getMessage() + "\n Please fill in ALL blanks with correct info",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
//            Handle specific issue
            if (!(cpu > 0)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid amount of CPU cores! Please enter a positive number!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                cpuCoresJTextField.setText("");
                cpuCoresJTextField.requestFocus();
            }
            if (!(gpu > 0)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid amount of GPU cores! Please enter a positive number!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                gpuCoresJTextField.setText("");
                gpuCoresJTextField.requestFocus();
            }
            if (!(ram > 0)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid amount of RAM! Please enter a positive number!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                ramAmountJTextField.setText("");
                ramAmountJTextField.requestFocus();
            }
            if (!(ps > 0)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid power supply wattage! Please enter a positive number!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                powerSupplyJTextField.setText("");
                powerSupplyJTextField.requestFocus();
            }
            if (!(hd > 0)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid HD capacity! Please enter a positive number!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                hdCapacityJTextField.setText("");
                hdCapacityJTextField.requestFocus();
            }

            if(cpu>0 && gpu>0 && ram>0 && hd>0 && ps>0){
                double result = calculatePrice(brandJTextField.getText(), cpu, gpu, ram, hd, ps);
                JOptionPane.showMessageDialog(null,
                        "Price: $"+result,
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);

            }




        }
    }

    class clearAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            Clear all textfield
            brandJTextField.setText("");
            cpuCoresJTextField.setText("");
            gpuCoresJTextField.setText("");
            ramAmountJTextField.setText("");
            powerSupplyJTextField.setText("");
            hdCapacityJTextField.setText("");
//            Focus on brand
            brandJTextField.requestFocus();

        }
    }

    /**
     * Text fields used for input.
     */
    private JTextField brandJTextField;
    private JTextField cpuCoresJTextField;
    private JTextField gpuCoresJTextField;
    private JTextField ramAmountJTextField;
    private JTextField powerSupplyJTextField;
    private JTextField hdCapacityJTextField;

    /**
     * Buttons used to handle user interaction.
     */
    private JButton calcPriceJButton;
    private JButton clearJButton;

    /**
     * Starting prices for each computer brand
     */
    private static final double APPLE_PRICE = 999.0;
    private static final double DELL_PRICE = 899.0;
    private static final double MICROSOFT_PRICE = 849.0;
    private static final double ASUS_PRICE = 799.0;
    private static final double HP_PRICE = 749.0;

    /**
     * Price multipliers for each component.
     */
    private static final double PER_CPU_CORE_PRICE = 100.0;
    private static final double PER_GPU_CORE_PRICE = 150.0;
    private static final double PER_RAM_GB_PRICE = 25.0;
    private static final double PER_HD_GB_PRICE = 1.0;
    private static final double PER_SUPPLY_WATT_PRICE = 0.25;

    /**
     * Constructs a newly allocated {@code ComputerOrderForm} object.
     */
    public ComputerOrderForm() {
        this.setUpGUI();

        //TODO enter your code for calcPriceJButton's action listener here
        calcPriceJButton.addActionListener(new calcPriceAction());

        //TODO enter your code for clearJButton's action listener here
        clearJButton.addActionListener(new clearAction());
    } //ComputerOrderForm

    /**
     * Sets up the GUI for the user.
     */
    private void setUpGUI() {
        //initialize the components
        this.brandJTextField = new JTextField();
        this.cpuCoresJTextField = new JTextField();
        this.gpuCoresJTextField = new JTextField();
        this.ramAmountJTextField = new JTextField();
        this.powerSupplyJTextField = new JTextField();
        this.hdCapacityJTextField = new JTextField();
        this.calcPriceJButton = new JButton("Calculate Price");
        this.clearJButton = new JButton("Clear Form");

        JFrame mainJFrame = new JFrame("Computer Order Form");
        JPanel mainJPanel = new JPanel();

        //format mainJPanel
        mainJPanel.setLayout(new GridLayout(14, 1));
        mainJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        //add the components to mainJPanel
        mainJPanel.add(new JLabel("Brand:"));
        mainJPanel.add(this.brandJTextField);
        mainJPanel.add(new JLabel("CPU cores:"));
        mainJPanel.add(this.cpuCoresJTextField);
        mainJPanel.add(new JLabel("GPU cores:"));
        mainJPanel.add(this.gpuCoresJTextField);
        mainJPanel.add(new JLabel("RAM amount:"));
        mainJPanel.add(this.ramAmountJTextField);
        mainJPanel.add(new JLabel("Power supply wattage:"));
        mainJPanel.add(this.powerSupplyJTextField);
        mainJPanel.add(new JLabel("HD capacity:"));
        mainJPanel.add(this.hdCapacityJTextField);
        mainJPanel.add(this.calcPriceJButton);
        mainJPanel.add(this.clearJButton);

        //format mainJFrame
        mainJFrame.setMinimumSize(new Dimension(500, 450));
        mainJFrame.setContentPane(mainJPanel);
        mainJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainJFrame.setLocationRelativeTo(null);
        mainJFrame.pack();

        //make mainJFrame visible
        mainJFrame.setVisible(true);
    } //setUpGUI

    public static void main(String[] args) {
        ComputerOrderForm c = new ComputerOrderForm();

    }

    public double calculatePrice(String brand, int cpu, int gpu, int ram, int hd, int ps) {
        double varCost = cpu * PER_CPU_CORE_PRICE + gpu * PER_GPU_CORE_PRICE + ram * PER_RAM_GB_PRICE + hd * PER_HD_GB_PRICE + ps * PER_SUPPLY_WATT_PRICE;
        double baseCost = 0;
        switch (brand) {
            case "Apple":
                baseCost = APPLE_PRICE;
                break;
            case "Dell":
                baseCost = DELL_PRICE;
                break;
            case "Microsoft":
                baseCost = MICROSOFT_PRICE;
                break;
            case "Asus":
                baseCost = ASUS_PRICE;
                break;
            case "HP":
                baseCost = HP_PRICE;
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid brand! Please enter another!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                this.brandJTextField.requestFocus();

        }
        return baseCost + varCost;

    }
}
